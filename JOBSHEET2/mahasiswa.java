package JOBSHEET2;

public class mahasiswa {

    String nim;
    String nama;
    String kelas;
    double ipk;

    void tampilkanInformasi() {
        System.out.println("NIM  : " + nim);
        System.out.println("Nama : " + nama);
        System.out.println("IPK  : " + ipk);
        System.out.println("Kelas: " + kelas);
    }

    void ubahKelas(String kelasBaru) {
        kelas = kelasBaru;
    }

    void updateIpk(double ipkBaru) {
        ipk = ipkBaru;
    }

    String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }

    public static void main(String[] args) {
        mahasiswa mhs = new mahasiswa();

        mhs.nim = "123456";
        mhs.nama = "Budi";
        mhs.kelas = "TI-1A";
        mhs.ipk = 3.4;

        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());

        mhs.ubahKelas("TI-1B");
        mhs.updateIpk(3.7);

        System.out.println("\nSetelah Update:");
        mhs.tampilkanInformasi();
        System.out.println("Nilai Kinerja: " + mhs.nilaiKinerja());
    }
}