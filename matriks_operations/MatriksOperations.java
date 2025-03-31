package matriks_operations;

import java.util.Scanner;

public class MatriksOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks A
        System.out.print("Input baris matrix A: ");
        int barisA = scanner.nextInt();
        System.out.print("Input kolom matrix A: ");
        int kolomA = scanner.nextInt();

        int[][] matriksA = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("Input elemen matrix A[" + i + "][" + j + "] = ");
                matriksA[i][j] = scanner.nextInt();
            }
        }

        // Input ukuran matriks B
        System.out.print("Input baris matrix B: ");
        int barisB = scanner.nextInt();
        System.out.print("Input kolom matrix B: ");
        int kolomB = scanner.nextInt();

        int[][] matriksB = new int[barisB][kolomB];
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("Input elemen matrix B[" + i + "][" + j + "] = ");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        // Penjumlahan matriks (jika ukuran sama)
        if (barisA == barisB && kolomA == kolomB) {
            int[][] matriksC = MatriksUtils.jumlahkanMatriks(matriksA, matriksB);
            System.out.println("\nHasil penjumlahan matrix A dengan matrix B:");
            MatriksUtils.tampilkanMatriks(matriksC);

            // Transpose matriks C
            int[][] transposC = MatriksUtils.transpose(matriksC);
            System.out.println("\nHasil transpos matrix C:");
            MatriksUtils.tampilkanMatriks(transposC);
        } else {
            System.out.println("\nMatrix tidak dapat dijumlahkan karena ukurannya berbeda.");
        }

        // Perkalian matriks (jika jumlah kolom A = jumlah baris B)
        if (kolomA == barisB) {
            int[][] hasilKali = MatriksUtils.kalikanMatriks(matriksA, matriksB);
            System.out.println("\nHasil perkalian matrix A dengan matrix B:");
            MatriksUtils.tampilkanMatriks(hasilKali);
        } else {
            System.out.println("\nMatrix tidak dapat dikalikan karena jumlah kolom A tidak sama dengan jumlah baris B.");
        }

        scanner.close();
    }
}
