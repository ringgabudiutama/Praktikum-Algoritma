package JOBSHEET2;

public class StudentMain {

    public static void main(String[] args) {

        mahasiswa mhs1 = new mahasiswa();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk(3.60);
        mhs1.tampilkanInformasi();

        mahasiswa mhs2 = new mahasiswa();
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();
    }
}