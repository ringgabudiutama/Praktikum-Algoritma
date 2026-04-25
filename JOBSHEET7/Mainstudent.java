package JOBSHEET7;

import java.util.Scanner;

public class Mainstudent {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        Scanner s = new Scanner(System.in);

        System.out.print("Input students amount: ");
        int amountStudent = s1.nextInt();

        Searchstudent data = new Searchstudent();

        System.out.println("-----------------------------------------------------");
        System.out.println("Input student data accordingly from smallest NIM");
        System.out.println("-----------------------------------------------------");

        for (int i = 0; i < amountStudent; i++) {
            System.out.println("-----------------------------------------------------");
            System.out.print("NIM     : ");
            int nim = s1.nextInt();

            System.out.print("Name    : ");
            String name = s.nextLine();

            System.out.print("Age     : ");
            int age = s1.nextInt();

            System.out.print("GPA     : ");
            double gpa = s1.nextDouble();

            Students std = new Students(nim, age, name, gpa);
            data.add(std);
        }

        System.out.println("-----------------------------------------------------");
        data.display();
        System.out.println("-----------------------------------------------------");

        System.out.print("Search student by NIM: ");
        int search = s1.nextInt();
        System.out.println("Using binary Search");
        int position = data.FindBinarySearch(search, 0, amountStudent - 1);

        data.showPosition(search, position);
        data.showData(search, position);
    }
}