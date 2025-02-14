import java.util.Scanner;
public class Olimpiade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] cabangOlahraga = {"Badminton", "Basket", "Bola Voli"};

        System.out.print("Masukkan jumlah politeknik yang mendaftar: ");
        int jumlahPoliteknik = sc.nextInt();
        sc.nextLine();

        String[][][] dataAtlet = new String[cabangOlahraga.length][jumlahPoliteknik][3];

        System.out.println();
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Masukkan nama atlet untuk cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 3; k++) {
                    System.out.print("  Atlet " + (k + 1) + ": ");
                    dataAtlet[i][j][k] = sc.nextLine();
                }
            }
        }
        System.out.println();
        System.out.println("=== Informasi Nama Atlet ===");
        for (int i = 0; i < cabangOlahraga.length; i++) {
            System.out.println("Cabang " + cabangOlahraga[i] + ":");
            for (int j = 0; j < jumlahPoliteknik; j++) {
                System.out.println("Politeknik " + (j + 1) + ":");
                for (int k = 0; k < 3; k++) {
                    System.out.println("  Atlet " + (k + 1) + ": " + dataAtlet[i][j][k]);
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
