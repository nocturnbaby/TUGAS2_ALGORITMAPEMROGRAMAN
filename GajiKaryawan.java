import java.util.Scanner;

public class GajiKaryawan {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Golongan Karyawan (A/B/C): ");
        String golongan = input.next().toUpperCase();
        System.out.print("Masukkan Jumlah Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        switch (golongan) {
            case "A":
                gajiPokok = 5000000;
                break;
            case "B":
                gajiPokok = 6500000;
                break;
            case "C":
                gajiPokok = 9500000;
                break;
            default:
                System.out.println("Golongan tidak valid");
                System.exit(0);
        }

        double persentaseLembur = 0;
        if (jamLembur == 1) {
            persentaseLembur = 0.30;
        } else if (jamLembur == 2) {
            persentaseLembur = 0.32;
        } else if (jamLembur == 3) {
            persentaseLembur = 0.34;
        } else if (jamLembur == 4) {
            persentaseLembur = 0.36;
        } else if (jamLembur >= 5) {
            persentaseLembur = 0.38;
        }

        double gajiLembur = gajiPokok * persentaseLembur * jamLembur;
        double totalGaji = gajiPokok + gajiLembur;

        System.out.println("\n=== Rincian Gaji Karyawan ===");
        System.out.printf("Golongan: %s%n", golongan);
        System.out.printf("Gaji Pokok: Rp %,d%n", (int) gajiPokok);
        System.out.printf("Gaji Lembur: Rp %,d%n", (int) gajiLembur);
        System.out.printf("Total Gaji: Rp %,d%n", (int) totalGaji);

        input.close();
    }
}
