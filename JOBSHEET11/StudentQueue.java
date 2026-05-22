package JOBSHEET11;

public class StudentQueue {
    SingleLinkedList list = new SingleLinkedList();
    int size = 0;

    void enqueue(Student std) {
        list.addLast(std);
        size++;
        System.out.println(std.name + " joined the queue.");
    }

    void dequeue() {
        if (list.isEmpty()) {
            System.out.println("Queue is empty!");
        } else {
            System.out.println("Calling student: " + list.head.data.name);
            list.removeFirst();
            size--;
        }
    }

    void displayStatus() {
        if (!list.isEmpty()) {
            System.out.println("Front: " + list.head.data.name);
            System.out.println("Rear: " + list.tail.data.name);
            System.out.println("Total in queue: " + size);
        } else {
            System.out.println("Queue is empty.");
        }
    }
}