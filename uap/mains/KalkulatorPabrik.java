package mains;

import java.util.Scanner;
import models.Sphere;
import models.Torus;

public class KalkulatorPabrik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Membuat objek scanner untuk input dari pengguna

        System.out.println("========================================"); // Garis pemisah agar terlihat rapi
        System.out.println("Kalkulator Pabrik Cetakan Donat Rumahan"); // Judul dari program ini
        System.out.println("NORISA DEFRIANI");
        System.out.println("245150707111038");
        System.out.println("========================================");

        // Bagian untuk menghitung donat dengan lubang
        System.out.println("Donat dengan lubang");
        System.out.println("========================================");
        System.out.print("Isikan Radius\t : "); // Meminta pengguna untuk memasukkan nilai radius major
        double major = sc.nextDouble();
        System.out.print("Isikan radius\t : "); // Meminta pengguna untuk memasukkan nilai radius minor
        double minor = sc.nextDouble();

        Torus torus = new Torus(major, minor); // Membuat objek torus dengan radius major dan minor yang dimasukkan oleh
                                               // pengguna
        System.out.println("========================================");
        torus.printInfo(); // Menampilkan informasi dari donat torus

        // Bagian untuk menghitung donat tanpa lubang
        System.out.println("========================================");
        System.out.println("Donat tanpa lubang");
        System.out.println("========================================");
        System.out.print("Isikan radius\t : "); // Meminta pengguna untuk memasukkan nilai radius dari sphere
        double r = sc.nextDouble();

        Sphere sphere = new Sphere(r); // Membuat objek sphere dengan radius yang dimasukkan oleh pengguna
        System.out.println("========================================");
        sphere.printInfo(); // Menampilkan informasi dari donat sphere
        System.out.println("========================================");

        sc.close();
    }
}
