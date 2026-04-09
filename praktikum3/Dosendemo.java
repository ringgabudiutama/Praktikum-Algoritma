import java.util.Scanner;

public class 23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number of lecturers: ");
        int n = Integer.parseInt(sc.nextLine());

        Dosen[] arrayOfDosen = new Dosen[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Input Lecturer Data #" + (i + 1));

            System.out.print("Code   : ");
            String code = sc.nextLine();

            System.out.print("Name   : ");
            String name = sc.nextLine();

            System.out.print("Gender (true=Male, false=Female): ");
            boolean gender = Boolean.parseBoolean(sc.nextLine());

            System.out.print("Age    : ");
            int age = Integer.parseInt(sc.nextLine());

            arrayOfDosen[i] = new Dosen(code, name, gender, age);
            System.out.println("---------------------------------");
        }

        Datadosen data = new Datadosen();

        System.out.println("\n=== ALL LECTURERS ===");
        data.dataAllDosen(arrayOfDosen);

        System.out.println("\n=== NUMBER OF LECTURERS PER GENDER ===");
        data.numberOfLecturersPerGender(arrayOfDosen);

        System.out.println("\n=== AVERAGE AGE PER GENDER ===");
        data.averageAgeOfLecturersPerGender(arrayOfDosen);

        System.out.println("\n=== OLDEST LECTURER ===");
        data.infoDosenPalingTua(arrayOfDosen);

        System.out.println("\n=== YOUNGEST LECTURER ===");
        data.infoDosenPalingMuda(arrayOfDosen);

        sc.close();
    }
}