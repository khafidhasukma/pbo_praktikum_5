package queue;
import java.util.Scanner;

public class MainQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Menentukan kapasitas maksimum queue dari input user
        System.out.print("Enter the maximum size of the queue: ");
        int maxSize = scanner.nextInt();

        QueueOperations queueOps = new QueueOperations(maxSize);
        boolean running = true;

        while (running) {
            System.out.println("\nQueue Operations");
            System.out.println("1. Insert");
            System.out.println("2. Remove");
            System.out.println("3. Peek");
            System.out.println("4. Check Empty");
            System.out.println("5. Check Full");
            System.out.println("6. Size");
            System.out.print("Your Choice? ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter value to insert: ");
                    int value = scanner.nextInt();
                    queueOps.insert(value);
                    break;
                case 2:
                    queueOps.remove();
                    break;
                case 3:
                    queueOps.peek();
                    break;
                case 4:
                    queueOps.checkEmpty();
                    break;
                case 5:
                    queueOps.checkFull();
                    break;
                case 6:
                    queueOps.size();
                    break;
                default:
                    System.out.println("Invalid choice! Please choose again.");
            }

            // Menampilkan isi queue
            queueOps.displayQueue();

            // Tanya user apakah ingin lanjut atau tidak
            System.out.print("\nDo you want to continue (Type y or n)? ");
            char cont = scanner.next().charAt(0);
            if (cont == 'n' || cont == 'N') {
                running = false;
            }
        }

        System.out.println("Program exited.");
        scanner.close();
    }
}
