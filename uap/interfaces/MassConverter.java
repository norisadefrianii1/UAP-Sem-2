package interfaces;

public interface MassConverter { // Merupakan interface yang digunakan untuk mengubah nilai massa dari gram ke
                                 // kg.
    int DENOMINATOR = 1000; // merupakan nilai tetap konversi dari gr ke kg

    double gramToKilogram(double gram); // Method untuk mengubah gram ke kilogram
}
