package models;

import bases.Shape;
import interfaces.*;

// Kelas yang merupakan turunan dari kelas Shape dan mengimplementasikan semua interface
public class Sphere extends Shape
        implements ThreeDimensional, PiRequired, MassCalculable, MassConverter, ShippingCostCalculator {

    private double radius; // Atribut untuk menyimpan jari-jari bola

    public Sphere() { // Kontruktor tanpa parameter
    }

    public Sphere(double radius) { // Konstruktor dengan parameter untuk menginisialisasi jari-jari
        this.radius = radius;
    }

    // Method untuk menghitung volume sphere
    @Override
    public double getVolume() {
        return (4.0 / 3.0) * PI * radius * radius * radius;
    }

    // Method untuk menghitung luas permukaan sphere
    @Override
    public double getSurfaceArea() {
        return 4 * PI * radius * radius;
    }

    // Method untuk menghitung massa sphere
    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    // Method untuk menampilkan informasi tentang sphere
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
