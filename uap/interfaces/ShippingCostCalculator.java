package interfaces;

public interface ShippingCostCalculator { // Interface untuk menghitung biaya pengiriman barang berdasarkan beratnya
    int PRICE_PER_KG = 2000; // Harga tetap biaya pengiriman barang per kg

    double calculateCost(); // Method untuk menghitung biaya pengiriman yang harus diimplementasikan oleh
                            // kelas yang mengimplementasikan interface ini
}
