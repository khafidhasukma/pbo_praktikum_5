package queue;
import java.util.LinkedList;
import java.util.Queue;

public class QueueOperations {
    private Queue<Integer> queue;
    private final int MAX_SIZE;

    // Constructor dengan kapasitas yang bisa ditentukan oleh user
    public QueueOperations(int maxSize) {
        this.queue = new LinkedList<>();
        this.MAX_SIZE = maxSize;
    }

    // Menambahkan elemen ke dalam queue
    public void insert(int value) {
        if (queue.size() >= MAX_SIZE) {
            System.out.println("Queue is full! Cannot insert.");
        } else {
            queue.add(value);
            System.out.println("Inserted: " + value);
        }
    }

    // Menghapus elemen dari queue
    public void remove() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! Nothing to remove.");
        } else {
            int removedValue = queue.poll();
            System.out.println("Removed: " + removedValue);
        }
    }

    // Mengintip elemen depan queue
    public void peek() {
        if (queue.isEmpty()) {
            System.out.println("Queue is empty! No front element.");
        } else {
            System.out.println("Front element: " + queue.peek());
        }
    }

    // Mengecek apakah queue kosong
    public void checkEmpty() {
        System.out.println(queue.isEmpty() ? "Queue is empty." : "Queue is not empty.");
    }

    // Mengecek apakah queue penuh
    public void checkFull() {
        System.out.println(queue.size() >= MAX_SIZE ? "Queue is full." : "Queue is not full.");
    }

    // Menampilkan ukuran queue
    public void size() {
        System.out.println("Size = " + queue.size());
    }

    // Menampilkan isi queue
    public void displayQueue() {
        System.out.println("Queue = " + queue);
    }
}
