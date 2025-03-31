package matriks_operations;
import java.util.Scanner;

public class MatriksOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input ukuran matriks A
        System.out.print("input baris matrix A: ");
        int barisA = scanner.nextInt();
        System.out.print("input kolom matrix A: ");
        int kolomA = scanner.nextInt();

        int[][] matriksA = new int[barisA][kolomA];
        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomA; j++) {
                System.out.print("input elemen matrix A[" + i + "][" + j + "] = ");
                matriksA[i][j] = scanner.nextInt();
            }
        }

        // Input ukuran matriks B
        System.out.print("input baris matrix B: ");
        int barisB = scanner.nextInt();
        System.out.print("input kolom matrix B: ");
        int kolomB = scanner.nextInt();

        int[][] matriksB = new int[barisB][kolomB];
        for (int i = 0; i < barisB; i++) {
            for (int j = 0; j < kolomB; j++) {
                System.out.print("input elemen matrix B[" + i + "][" + j + "] = ");
                matriksB[i][j] = scanner.nextInt();
            }
        }

        // Penjumlahan matriks (jika ukuran sama)
        int[][] matriksC = null;
        if (barisA == barisB && kolomA == kolomB) {
            matriksC = new int[barisA][kolomA];
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomA; j++) {
                    matriksC[i][j] = matriksA[i][j] + matriksB[i][j];
                }
            }
            System.out.println("Hasil penjumlahan matrix A dengan matrix B:");
            tampilkanMatriks(matriksC);
        } else {
            System.out.println("Matrix tidak dapat dijumlahkan karena ukurannya berbeda.");
        }

        // Transpos Matriks C (jika ada)
        if (matriksC != null) {
            int[][] transposC = transpose(matriksC);
            System.out.println("Hasil transpos matrix C:");
            tampilkanMatriks(transposC);
        }

        // Perkalian matriks (jika jumlah kolom A = jumlah baris B)
        if (kolomA == barisB) {
            int[][] hasilKali = new int[barisA][kolomB];
            for (int i = 0; i < barisA; i++) {
                for (int j = 0; j < kolomB; j++) {
                    for (int k = 0; k < kolomA; k++) {
                        hasilKali[i][j] += matriksA[i][k] * matriksB[k][j];
                    }
                }
            }
            System.out.println("Hasil perkalian matrix A dengan matrix B:");
            tampilkanMatriks(hasilKali);
        } else {
            System.out.println("Matrix tidak dapat dikalikan karena jumlah kolom A tidak sama dengan jumlah baris B.");
        }
    }

    public static int[][] transpose(int[][] matriks) {
        int baris = matriks.length;
        int kolom = matriks[0].length;
        int[][] hasil = new int[kolom][baris];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[j][i] = matriks[i][j];
            }
        }
        return hasil;
    }

    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }
}
