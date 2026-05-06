package Tugas;

public class QueueLayanan23 {
    Node23 front, rear;
    int size;

    public QueueLayanan23() {
        front = rear = null;
        size = 0;
    }

    public boolean isEmpty() {
        return front == null;
    }

    public boolean isFull() {
        return false; 
    }

    public void enqueue(Mahasiswa23 data) {
        Node23 newNode = new Node23(data);
        if (isEmpty()) {
            front = rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        size++;
        System.out.println(data.nama + " telah mendaftar ke antrean.");
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Antrean kosong, tidak ada yang bisa dipanggil.");
            return;
        }
        System.out.println("Memanggil antrean: " + front.data.nama + " (NIM: " + front.data.nim + ")");
        front = front.next;
        if (front == null) {
            rear = null;
        }
        size--;
    }

    public void peek() {
        if (!isEmpty()) {
            System.out.println("Antrean Terdepan: " + front.data.nama);
            System.out.println("Antrean Terakhir: " + rear.data.nama);
        } else {
            System.out.println("Antrean masih kosong.");
        }
    }

    public void displayJumlah() {
        System.out.println("Jumlah mahasiswa dalam antrean: " + size);
    }

    public void clear() {
        front = rear = null;
        size = 0;
        System.out.println("Antrean berhasil dikosongkan.");
    }

    public void printAll() {
        if (isEmpty()) {
            System.out.println("Antrean Kosong.");
            return;
        }
        Node23 tmp = front;
        System.out.println("--- Daftar Antrean Mahasiswa ---");
        while (tmp != null) {
            System.out.println("- " + tmp.data.nama + " (" + tmp.data.nim + ")");
            tmp = tmp.next;
        }
    }
}
