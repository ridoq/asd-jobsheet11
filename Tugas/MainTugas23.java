package Tugas;

import java.util.Scanner;

public class MainTugas23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QueueLayanan23 q = new QueueLayanan23();
        int pilih;

        do {
            System.out.println("\n=== LAYANAN UNIT KEMAHASISWAAN ===");
            System.out.println("1. Tambah Antrean (Daftar)");
            System.out.println("2. Panggil Antrean (Dequeue)");
            System.out.println("3. Cek Antrean Depan & Belakang");
            System.out.println("4. Cek Jumlah Antrean");
            System.out.println("5. Tampilkan Semua Antrean");
            System.out.println("6. Kosongkan Antrean");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilih = sc.nextInt();
            sc.nextLine(); 

            switch (pilih) {
                case 1:
                    System.out.print("Masukkan NIM  : ");
                    String nim = sc.nextLine();
                    System.out.print("Masukkan Nama : ");
                    String nama = sc.nextLine();
                    q.enqueue(new Mahasiswa23(nim, nama));
                    break;
                case 2:
                    q.dequeue();
                    break;
                case 3:
                    q.peek();
                    break;
                case 4:
                    q.displayJumlah();
                    break;
                case 5:
                    q.printAll();
                    break;
                case 6:
                    q.clear();
                    break;
            }
        } while (pilih != 0);
        sc.close();
    }
}
