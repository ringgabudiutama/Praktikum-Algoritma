package JOBSHEET12;

public class DoubleLinkedListsMain {
    public static void main(String[] args) {
        DoubleLinkedLists dll = new DoubleLinkedLists();

        System.out.println("=== TEST 1: ADD AT SPECIFIC INDEX ===");
        dll.addFirst(new Student("111", "Anton", "TI-1I", 3.57));
        dll.addLast(new Student("112", "Prabowo", "TI-1I", 3.7));
        
        // Memasukkan Herco di indeks ke-1 (di antara Anton dan Prabowo)
        dll.add(new Student("113", "Herco", "TI-1I", 3.89), 1);
        dll.print();

        System.out.println("=== TEST 2: REMOVE AFTER KEY ===");
        // Menghapus data setelah Anton (NIM 111), berarti menghapus Herco
        dll.removeAfter("111");
        dll.print();

        System.out.println("=== TEST 3: GET DATA METHOD ===");
        dll.addLast(new Student("114", "Rizki", "TI-1I", 3.8)); // menambah data baru untuk pelengkap
        dll.print();
        
        System.out.println("Data Pertama (First) : " + dll.getFirst().name);
        System.out.println("Data Terakhir (Last) : " + dll.getLast().name);
        System.out.println("Data Indeks ke-1      : " + dll.getIndex(1).name);

        System.out.println("\n=== TEST 4: GET SIZE METHOD ===");
        System.out.println("Jumlah total data di dalam list: " + dll.getSize());

        System.out.println("\n=== TEST 5: INDEX OF METHOD ===");
        String cariNim = "114";
        int posisi = dll.indexOf(cariNim);
        System.out.println("Data dengan NIM " + cariNim + " berada pada indeks ke: " + posisi);
    }
}