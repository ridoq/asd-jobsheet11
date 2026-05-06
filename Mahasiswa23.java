public class Mahasiswa23 {
    String nim, nama, kelas;
    double ipk;

    public Mahasiswa23() {
    }

    public Mahasiswa23(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    public void tampilInformasi() {
        System.out.print(nama + "\t\t");
        System.out.print(nim + "\t\t");
        System.out.print(kelas + "\t\t");
        System.out.print(ipk + "\t\t");
        System.out.println();
    }
}