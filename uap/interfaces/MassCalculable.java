package interfaces; // Merupakan package interfaces yang berisi berbagai interface 

public interface MassCalculable { // Interface untuk menghitung massa dari shape
    int DENSITY = 8; // Ini merupakan nilai tetap untuk densitas atau massa jenis
    double THICKNESS = 0.5; // Ini merupakan nilai tetap dari ketebalan

    double getMass(); // Method untuk menghitung massa yang harus diimplementasikan oleh kelas yang
                      // mengimplementasikan interface ini
}