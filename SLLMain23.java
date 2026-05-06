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