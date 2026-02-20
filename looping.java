import java.util.Scanner;

public class looping {
    public static void main(String[] args) {

        // Membuat objek Scanner untuk menerima input dari user
        Scanner input = new Scanner(System.in);

        // Meminta user memasukkan NIM
        System.out.print("Masukkan NIM: ");
        String nim = input.nextLine();

        // Mengambil 2 digit terakhir dari NIM
        // substring digunakan untuk mengambil bagian akhir string
        int n = Integer.parseInt(nim.substring(nim.length() - 2));

        // Jika 2 digit terakhir adalah 00 maka n dianggap 10
        if (n == 0) {
            n = 10;
        }

        System.out.println("Nilai n adalah: " + n);
        System.out.print("Output: ");

        // Melakukan perulangan dari 1 sampai n
        for (int i = 1; i <= n; i++) {

            // Angka 10 dan 15 tidak boleh dicetak, jadi dilewati
            if (i == 10 || i == 15) {
                continue; // lanjut ke angka berikutnya
            }

            // Jika angka merupakan kelipatan 3
            // maka tidak mencetak angka, tetapi mencetak simbol #
            if (i % 3 == 0) {
                System.out.print("#");
            }

            // Jika angka genap (dan bukan kelipatan 3 karena sudah dicek sebelumnya)
            // maka angka tersebut dicetak apa adanya
            else if (i % 2 == 0) {
                System.out.print(i);
            }

            // Jika bukan genap dan bukan kelipatan 3
            // berarti angka tersebut ganjil
            // maka dicetak simbol *
            else {
                System.out.print("*");
            }
        }

        // Menutup Scanner agar tidak terjadi memory leak
        input.close();
    }
}