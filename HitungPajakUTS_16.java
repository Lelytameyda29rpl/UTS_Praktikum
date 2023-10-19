//Nama : Lelyta Meyda Ayu Budiyanti
//NIM : 2341720124
//Kelas : 1F-TI
//No.absen : 16
//Tugas : UTS Praktikum Pemrograman Dasar

import java.util.Scanner; // mengimport Scanner
public class HitungPajakUTS_16 {

    public static void main(String [] args) {
        
        //Mendeklarasikan Scanner
        Scanner input16 = new Scanner(System.in);
        
        //Mendeklarasikan variabel
        double pajak = 0, totalPenghasilan = 0, totalHartaKekayaan = 0, nilaiHarta = 0;
        boolean keluarga = false;
        int jmlAnakKuliah, jmlAnakSMA;
        String pilihanUsaha, bendaKekayaan, jenisKekayaan, pilihanBerkeluarga;

        //user menginputkan pilihanUsaha -> apakah memiliki usaha atau tidak
        System.out.println("=== SELAMAT DATANG DI PROSES HITUNG PAJAK ! ===");
        System.out.print("Apakah Anda Memiliki Usaha? (Ya/Tidak) : ");
        pilihanUsaha = input16.nextLine();

        //Kondisi jika memiliki usaha
        if (pilihanUsaha.equalsIgnoreCase("Ya")) {
            System.out.print("Berapakah Penghasilan Anda Dalam 1 Tahun?: Rp. ");
            totalPenghasilan = input16.nextDouble();
            pajak = totalPenghasilan * 0.15;
        }
        
        // Input harta kekayaan
        System.out.print("Berapakah Nilai Harta Kekayaan Anda?: ");
        totalHartaKekayaan = input16.nextDouble();
        input16.nextLine(); // Membersihkan Baris Baru
        
        //User menginputkan pilihan apakah memiliki benda kekayaan
        System.out.print("Apakah Anda Memiliki Harta Kekayaan Berupa Benda Bergerak Ataupun Benda Tidak Bergerak? (Ya/Tidak) : ");
        bendaKekayaan = input16.nextLine();
        
        //Melakukan perulangan untuk menginputkan jenis benda kekayaan 
        while (bendaKekayaan.equalsIgnoreCase("Ya")) {
            System.out.print("Masukkan Jenis Harta Kekayaan: ");
            jenisKekayaan = input16.nextLine();
            System.out.print("Masukkan nilai jual jenis harta kekayaan saat ini dari " + jenisKekayaan + ": Rp.");
            nilaiHarta = input16.nextDouble();
            totalHartaKekayaan += nilaiHarta;
        
            System.out.print("Apakah Anda Memiliki Harta Benda Kekayaan Lainnya? (Ya/Tidak) : ");
            bendaKekayaan = input16.next(); 
            input16.nextLine(); 
        }

        System.out.print("Apakah Anda Sudah Berkeluarga? (Ya/Tidak) : ");
        pilihanBerkeluarga = input16.nextLine();

        // Melakukan Kondisi Bersarang
        if (pilihanBerkeluarga.equalsIgnoreCase("Ya")) {
            keluarga = true;

            if (keluarga) {
                System.out.print("Berapa Jumlah Anak Anda Yang Ada Di Jenjang Kuliah? ");
                jmlAnakKuliah = input16.nextInt();

                System.out.print("Berapa Jumlah Anak Anda Yang Ada Di Jenjang SMA? ");
                jmlAnakSMA = input16.nextInt();

                if (jmlAnakKuliah == 1 && jmlAnakSMA == 1 && totalHartaKekayaan >= 50000000) {
                    pajak *= 0.9; //Dipotong 10%
                } else {
                    pajak *= pajak * 0.95; //Dipotong 5%
                }

                System.out.printf("Anda harus membayar pajak sebesar: Rp%.2f%n", pajak);
            }
        } else {
            System.out.printf("Anda harus membayar pajak sebesar: Rp%.2f%n", pajak);
        }
    }
}
