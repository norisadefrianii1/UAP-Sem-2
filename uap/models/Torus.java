package models;

import bases.Shape;
import interfaces.*;

// Kelas Torus yang merupakan turunan dari kelas Shape yang mengimplementasikan semua interface
public class Torus extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius; // Atribut untuk menyimpan jari-jari besar torus
    private double minorRadius; // Atribut untuk menyimpan jari-jari kecil torus

    public Torus() { // Konstruktor tanpa parameter
    }

    public Torus(double majorRadius, double minorRadius) { // Konstruktor dengan parameter untuk menginisialisasi
                                                           // jari-jari
        this.majorRadius = majorRadius; // Jari-jari besar torus
        this.minorRadius = minorRadius; // Jari-jari kecil torus
    }

    // Method untuk menghitung volume torus
    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    // Method untuk menghitung luas permukaan torus
    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    // Method untuk menghitung massa torus
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // Method untuk menampilkan informasi tentang torus
    @Override
    public void printInfo() {
        System.out.printf("Volume\t\t : %.2f\n", getVolume());
        System.out.printf("Luas permukaan\t : %.2f\n", getSurfaceArea());
        System.out.printf("Massa\t\t : %.2f\n", getMass());
        System.out.printf("Massa dalam kg\t : %.2f\n", gramToKilogram(getMass()));
        System.out.printf("Biaya kirim\t : Rp%.0f\n", calculateCost());
    }

    // Method untuk mengkonversi gram ke kilogram
    @Override
    public double gramToKilogram(double gram) {
        return gram / DENOMINATOR;
    }

    // Method untuk menghitung biaya pengiriman berdasarkan massa
    @Override
    public double calculateCost() {
        double kg = gramToKilogram(getMass());
        return Math.ceil(kg) * PRICE_PER_KG;
    }
}
