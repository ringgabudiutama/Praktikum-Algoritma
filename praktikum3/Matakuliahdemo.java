import java.util.Scanner;

public class Matakuliahdemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan jumlah Matakuliah: ");
        int n = Integer.parseInt(sc.nextLine());

        Matakuliah[] arrayOfMatakuliah = new Matakuliah[n];

        String kode, nama;
        int sks, jumlahJam;

        for (int i = 0; i < n; i++) {
            System.out.println("Masukkan Data Matakuliah ke-" + (i + 1));

            System.out.print("Kode       : ");
            kode = sc.nextLine();

            System.out.print("Nama       : ");
            nama = sc.nextLine();

            System.out.print("Sks        : ");
            sks = Integer.parseInt(sc.nextLine());

            System.out.print("Jumlah Jam : ");
            jumlahJam = Integer.parseInt(sc.nextLine());

            arrayOfMatakuliah[i] = new Matakuliah();
            arrayOfMatakuliah[i].addData(kode, nama, sks, jumlahJam);

            System.out.println("---------------------------------");
        }

        for (int i = 0; i < n; i++) {
            System.out.println("Data Matakuliah ke-" + (i + 1));
            arrayOfMatakuliah[i].printInfo();
            System.out.println("---------------------------------");
        }

        sc.close();
    }
}