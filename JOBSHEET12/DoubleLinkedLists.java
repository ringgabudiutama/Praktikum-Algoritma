package JOBSHEET12;

public class DoubleLinkedLists {
    Node head;
    Node tail;

    public DoubleLinkedLists() {
        head = null;
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    // --- KODE EKSPERIMEN 1 ---
    public void addFirst(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void addLast(Student data) {
        Node newNode = new Node(data);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void insertAfter(String key, Student data) {
        Node newNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                if (temp == tail) {
                    addLast(data);
                } else {
                    newNode.next = temp.next;
                    newNode.prev = temp;
                    temp.next.prev = newNode;
                    temp.next = newNode;
                }
                break; 
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Insertion failed. Data (" + key + ") not found!!");
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node temp = head;
            while (temp != null) {
                temp.data.print();
                temp = temp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Double linked list is currently empty!!");
        }
    }

    // --- KODE EKSPERIMEN 2 ---
    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void remove(int index) {
        if (isEmpty()) {
            System.out.println("Double linked list is currently empty!!");
            return;
        }
        if (index < 0) {
            System.out.println("Index cannot be negative!");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else {
            Node temp = head;
            int size = 0;
            while (temp != null && size < index) {
                temp = temp.next;
                size++;
            }
            if (temp == null) {
                System.out.println("Index out of bounds!");
                return;
            }
            if (temp == tail) {
                removeLast();
            } else {
                temp.prev.next = temp.next;
                temp.next.prev = temp.prev;
            }
        }
    }

    // --- KODE TUGAS 12.5 (ASSIGNMENTS) ---
    
    // Tugas 1: add(Student item, int index)
    public void add(Student item, int index) {
        if (index < 0) {
            System.out.println("Index cannot be negative!");
            return;
        }
        if (index == 0) {
            addFirst(item);
            return;
        }
        Node temp = head;
        int i = 0;
        while (temp != null && i < index - 1) {
            temp = temp.next;
            i++;
        }
        if (temp == null) {
            System.out.println("Index out of bounds!");
        } else if (temp == tail) {
            addLast(item);
        } else {
            Node newNode = new Node(temp, item, temp.next);
            temp.next.prev = newNode;
            temp.next = newNode;
        }
    }

    // Tugas 2: removeAfter(String key)
    public void removeAfter(String key) {
        Node temp = head;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                break;
            }
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Data dengan NIM " + key + " tidak ditemukan!");
        } else if (temp.next == null) {
            System.out.println("Tidak ada data setelah NIM " + key + " untuk dihapus!");
        } else {
            Node targetNode = temp.next;
            if (targetNode == tail) {
                removeLast();
            } else {
                temp.next = targetNode.next;
                targetNode.next.prev = temp;
            }
        }
    }

    // Tugas 3: getFirst()
    public Student getFirst() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
            return null;
        }
        return head.data;
    }

    // Tugas 3: getLast()
    public Student getLast() {
        if (isEmpty()) {
            System.out.println("Linked list kosong!");
            return null;
        }
        return tail.data;
    }

    // Tugas 3: getIndex(int index)
    public Student getIndex(int index) {
        if (isEmpty() || index < 0) {
            System.out.println("Indeks tidak valid atau list kosong!");
            return null;
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            if (temp == null) {
                System.out.println("Indeks di luar batas jangkauan!");
                return null;
            }
            temp = temp.next;
        }
        return (temp != null) ? temp.data : null;
    }

    // Tugas 4: getSize()
    public int getSize() {
        int size = 0;
        Node temp = head;
        while (temp != null) {
            size++;
            temp = temp.next;
        }
        return size;
    }

    // Tugas 5: indexOf(String key)
    public int indexOf(String key) {
        Node temp = head;
        int index = 0;
        while (temp != null) {
            if (temp.data.nim.equalsIgnoreCase(key)) {
                return index;
            }
            temp = temp.next;
            index++;
        }
        return -1; 
    }
}