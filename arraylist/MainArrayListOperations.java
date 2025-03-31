package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayListOperations {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> nilai1 = new ArrayList<>();
        ArrayList<Integer> nilai2 = new ArrayList<>();
        
        // Input jumlah data dari pengguna
        System.out.print("Masukkan jumlah data: ");
        int jumlahData = input.nextInt();
        
        // Input nilai1
        System.out.println("Masukkan nilai untuk ArrayList nilai1:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai1 index ke-" + i + ": ");
            nilai1.add(input.nextInt());
        }
        
        // Input nilai2
        System.out.println("\nMasukkan nilai untuk ArrayList nilai2:");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print("Nilai2 index ke-" + i + ": ");
            nilai2.add(input.nextInt());
        }
        
        // Hitung hasil operasi
        ArrayList<Integer> hasilTambah = ArrayListOperations.hitungPenjumlahan(nilai1, nilai2);
        ArrayList<Integer> hasilKurang = ArrayListOperations.hitungPengurangan(nilai1, nilai2);
        ArrayList<Integer> hasilKali = ArrayListOperations.hitungPerkalian(nilai1, nilai2);
        ArrayList<Double> hasilBagi = ArrayListOperations.hitungPembagian(nilai1, nilai2);
        
        // Tampilkan hasil
        System.out.println("\nHasil Penjumlahan:");
        ArrayListOperations.cetakInteger(hasilTambah);
        
        System.out.println("\nHasil Pengurangan:");
        ArrayListOperations.cetakInteger(hasilKurang);
        
        System.out.println("\nHasil Perkalian:");
        ArrayListOperations.cetakInteger(hasilKali);
        
        System.out.println("\nHasil Pembagian:");
        ArrayListOperations.cetakDouble(hasilBagi);
        
        input.close();
    }
}