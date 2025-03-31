package arraylist;

import java.util.ArrayList;

public class ArrayListOperations {
    // Method penjumlahan
    public static ArrayList<Integer> hitungPenjumlahan(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> hasil = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            hasil.add(a.get(i) + b.get(i));
        }
        return hasil;
    }
    
    // Method pengurangan
    public static ArrayList<Integer> hitungPengurangan(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> hasil = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            hasil.add(a.get(i) - b.get(i));
        }
        return hasil;
    }
    
    // Method perkalian
    public static ArrayList<Integer> hitungPerkalian(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Integer> hasil = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            hasil.add(a.get(i) * b.get(i));
        }
        return hasil;
    }
    
    // Method pembagian (menangani pembagi nol)
    public static ArrayList<Double> hitungPembagian(ArrayList<Integer> a, ArrayList<Integer> b) {
        ArrayList<Double> hasil = new ArrayList<>();
        for (int i = 0; i < a.size(); i++) {
            int pembilang = a.get(i);
            int penyebut = b.get(i);
            if (penyebut == 0) {
                hasil.add(null); // Penanda error
            } else {
                hasil.add((double) pembilang / penyebut);
            }
        }
        return hasil;
    }
    
    // Cetak hasil operasi integer
    public static void cetakInteger(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println("Index ke-" + i + ": " + list.get(i));
        }
    }
    
    // Cetak hasil operasi double (dengan penanganan pembagi nol)
    public static void cetakDouble(ArrayList<Double> list) {
        for (int i = 0; i < list.size(); i++) {
            Double nilai = list.get(i);
            if (nilai == null) {
                System.out.println("Index ke-" + i + ": Tidak bisa dibagi (pembagi nol)");
            } else {
                System.out.println("Index ke-" + i + ": " + String.format("%.2f", nilai));
            }
        }
    }
}