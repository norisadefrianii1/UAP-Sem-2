package bases; // Merupakan package yang berisi kelas abstrak Shape

public abstract class Shape {
    private String name; // Atribut untuk menyimpan nama bentuk atau shape dengan tipe data String

    public Shape() { // Konstruktor tanpa parameter
    }

    public void setName(String inputName) { // Method untuk mengatur nama shape atau bentuk
        this.name = inputName;
    }

    public String getName() { // Method untuk mendapatkan nama shape atau bentuk
        return name;
    }

    public abstract void printInfo(); // Method abstrak yang harus di override oleh kelas turunan untuk menampilkan
                                      // informasi tentang shape
}