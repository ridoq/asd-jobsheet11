#   Percobaan 1

##  Soal

1.  Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
2.  Jelaskan kegunaan variable temp secara umum pada setiap method!
3.  Lakukan modifikasi agar data dapat ditambahkan dari keyboard!

---

##  Jawaban

1.  Hasil tersebut muncul karena pada saat method print() dipanggil untuk pertama kalinya, objek <mark>SingleLinkedList23</mark> baru saja dibuat melalui instruksi new. Pada kondisi ini, atribut <mark>head</mark> masih bernilai <mark>null</mark> karena belum ada satu pun objek mahasiswa yang dimasukkan ke dalam list. Method isEmpty() akan mengembalikan nilai <mark>true</mark>, sehingga sistem menjalankan perintah untuk mencetak pesan "Linked list kosong".  
2.  Secara umum, variabel <mark>temp</mark> berfungsi sebagai pointer bantuan atau penanda posisi untuk melakukan <mark>traversing</mark> (penelusuran). Karena Linked List tidak memiliki indeks fisik seperti Array, kita membutuhkan variabel bantuan untuk berpindah dari satu node ke node berikutnya melalui referensi <mark>next</mark>. Penggunaan temp sangat krusial agar posisi <mark>head</mark> asli tidak berubah, sehingga struktur dasar list tetap terjaga saat kita melakukan operasi pencarian atau pencetakan data.
3.  menambahkan scanner pada code, contoh perubahan:

    ```java
        import java.util.Scanner;

        public class SLLMain23 {
            public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                SingleLinkedList23 sll = new SingleLinkedList23();
                
                Mahasiswa23[] mhsArray = new Mahasiswa23[4];
                
                for (int i = 0; i < mhsArray.length; i++) {
                    System.out.println("--- Input Data Mahasiswa ke-" + (i + 1) + " ---");
                    System.out.print("NIM   : ");
                    String nim = sc.nextLine();
                    System.out.print("Nama  : ");
                    String nama = sc.nextLine();
                    System.out.print("Kelas : ");
                    String kelas = sc.nextLine();
                    System.out.print("IPK   : ");
                    double ipk = sc.nextDouble();
                    sc.nextLine(); 

                    mhsArray[i] = new Mahasiswa23(nim, nama, kelas, ipk);
                }
                
                sll.print();
                sll.addFirst(mhsArray[0]);
                sll.print();
                sll.addLast(mhsArray[1]);
                sll.print();
                sll.insertAfter(mhsArray[1].nama, mhsArray[2]);
                sll.insertAt(2, mhsArray[3]);
                sll.print();
                sc.close();
            }
        }   
    ```

---

#   Percobaan 2

##  Soal

---

##  Jawaban

---