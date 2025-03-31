package matriks_operations;

public class MatriksUtils {
    // Method untuk menampilkan matriks
    public static void tampilkanMatriks(int[][] matriks) {
        for (int[] baris : matriks) {
            for (int elemen : baris) {
                System.out.print(elemen + " ");
            }
            System.out.println();
        }
    }

    // Method untuk melakukan transpose matriks
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

    // Method untuk menjumlahkan dua matriks
    public static int[][] jumlahkanMatriks(int[][] matriksA, int[][] matriksB) {
        int baris = matriksA.length;
        int kolom = matriksA[0].length;
        int[][] hasil = new int[baris][kolom];
        for (int i = 0; i < baris; i++) {
            for (int j = 0; j < kolom; j++) {
                hasil[i][j] = matriksA[i][j] + matriksB[i][j];
            }
        }
        return hasil;
    }

    // Method untuk mengalikan dua matriks
    public static int[][] kalikanMatriks(int[][] matriksA, int[][] matriksB) {
        int barisA = matriksA.length;
        int kolomA = matriksA[0].length;
        int kolomB = matriksB[0].length;
        int[][] hasil = new int[barisA][kolomB];

        for (int i = 0; i < barisA; i++) {
            for (int j = 0; j < kolomB; j++) {
                for (int k = 0; k < kolomA; k++) {
                    hasil[i][j] += matriksA[i][k] * matriksB[k][j];
                }
            }
        }
        return hasil;
    }
}
