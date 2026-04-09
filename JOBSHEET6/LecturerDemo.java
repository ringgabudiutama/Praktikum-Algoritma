import java.util.Scanner;

public class LecturerDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LecturerData data = new LecturerData();
        int menu;

        do {
            System.out.println("===== MENU =====");
            System.out.println("1. Add Data");
            System.out.println("2. Display Data");
            System.out.println("3. Sort ASC (youngest to oldest) - Bubble Sort");
            System.out.println("4. Sort DSC (oldest to youngest) - Selection Sort");
            System.out.println("5. Exit");
            System.out.print("Choose menu: ");
            menu = sc.nextInt();
            sc.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("Input ID      : ");
                    String id = sc.nextLine();

                    System.out.print("Input Name    : ");
                    String name = sc.nextLine();

                    System.out.print("Input Gender (M/F): ");
                    String genderInput = sc.nextLine();
                    boolean gender;
                    if (genderInput.equalsIgnoreCase("M")) {
                        gender = true;
                    } else {
                        gender = false;
                    }

                    System.out.print("Input Age     : ");
                    int age = sc.nextInt();
                    sc.nextLine();

                    Lecturer lec = new Lecturer(id, name, gender, age);
                    data.add(lec);
                    System.out.println("Data added successfully.\n");
                    break;

                case 2:
                    System.out.println("\n===== LECTURER DATA =====");
                    data.print();
                    break;

                case 3:
                    data.sortingASC();
                    System.out.println("\nData sorted ascending by age.");
                    data.print();
                    break;

                case 4:
                    data.sortingDSC();
                    System.out.println("\nData sorted descending by age.");
                    data.print();
                    break;

                case 5:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Menu not available.");
            }

            System.out.println();
        } while (menu != 5);

        sc.close();
    }
}
