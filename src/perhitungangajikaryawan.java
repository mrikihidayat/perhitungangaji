import java.util.Scanner;

public class perhitungangajikaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array untuk menyimpan gaji pokok setiap golongan
        double[] gaji = {5000000, 6500000, 9500000};

        // Array untuk menyimpan persentase lembur
        double[] lembur = {0.30, 0.32, 0.34, 0.36, 0.38};

        System.out.println("====================================");
        System.out.println("PROGRAM JAVA");
        System.out.println("PERHITUNGAN GAJI KARYAWAN");
        System.out.println("====================================");

        System.out.println("Masukkan Golongan (A/B/C): ");
        char golongan = input.next().toUpperCase().charAt(0);

        double gajiPokok = 0;

        // Validasi golongan dan set gajiPokok
        boolean golonganValid = true;
        if (golongan == 'A') {
            gajiPokok = gaji[0];
        } else if (golongan == 'B') {
            gajiPokok = gaji[1];
        } else if (golongan == 'C') {
            gajiPokok = gaji[2];
        } else {
            golonganValid = false;
            System.out.println("Golongan tidak valid.");
        }

        if (golonganValid) {
            System.out.println("Masukkan Jam Lembur: ");
            int jamLembur = input.nextInt();

            double gajiLembur = 0;

            // Menghitung gaji lembur berdasarkan jam lembur
            if (jamLembur == 0){
                gajiLembur = gajiPokok * 0; //TIDAK LEMBUR
            } else if (jamLembur > 0 && jamLembur <=5) {
                gajiLembur = gajiPokok * lembur[jamLembur - 1];
            } else if (jamLembur >= 5) {
                gajiLembur = gajiPokok * lembur[4]; // Untuk lembur 5 jam atau lebih
            } else if (jamLembur < 0) {
                System.out.println("Jam lembur tidak valid.");
            }

            // Menghitung total penghasilan
            double totalPenghasilan = gajiPokok + gajiLembur;

            // Output total penghasilan
            System.out.println("Total Penghasilan Rp." + totalPenghasilan);
        } 

        input.close();
        System.out.println("====================================");
    }
}
