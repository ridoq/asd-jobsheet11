public class SLLMain23 {
    public static void main(String[] args) {
        SingleLinkedList23 sll = new SingleLinkedList23();
        
        Mahasiswa23 mhs1 = new Mahasiswa23("21212200", "Alvaro", "1A", 4.0);
        Mahasiswa23 mhs2 = new Mahasiswa23("23212201", "Bimon", "2B", 3.8);
        Mahasiswa23 mhs3 = new Mahasiswa23("22212202", "Cintia", "3C", 3.5);
        Mahasiswa23 mhs4 = new Mahasiswa23("24212203", "Dirga", "4D", 3.6);

        sll.print();
        sll.addFirst(mhs4);
        sll.print();
        sll.addLast(mhs1);
        sll.print();
        sll.insertAfter("Dirga", mhs3);
        sll.insertAt(2, mhs2);
        sll.print();
    }
}