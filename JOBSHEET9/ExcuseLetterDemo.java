package JOBSHEET9;

import java.util.Scanner;

public class ExcuseLetterDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ExcuseLetterStack stack = new ExcuseLetterStack(5);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Submit Excuse Letter");
            System.out.println("2. Process Excuse Letter");
            System.out.println("3. View Latest Excuse Letter");
            System.out.println("4. Search for Letter");
            System.out.println("0. Exit");
            System.out.print("Choose a menu: ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("ID: ");
                    String id = scan.nextLine();

                    System.out.print("Name: ");
                    String name = scan.nextLine();

                    System.out.print("Class Name: ");
                    String className = scan.nextLine();

                    System.out.print("Type of Excuse (S/I): ");
                    char type = scan.nextLine().charAt(0);

                    System.out.print("Duration: ");
                    int duration = scan.nextInt();
                    scan.nextLine();

                    ExcuseLetter letter = new ExcuseLetter(id, name, className, type, duration);
                    stack.push(letter);
                    break;

                case 2:
                    ExcuseLetter processed = stack.pop();

                    if (processed != null) {
                        System.out.println("Processing latest excuse letter:");
                        processed.printData();
                    }
                    break;

                case 3:
                    ExcuseLetter latest = stack.peek();

                    if (latest != null) {
                        System.out.println("Latest excuse letter:");
                        latest.printData();
                    }
                    break;

                case 4:
                    System.out.print("Input student name to search: ");
                    String searchName = scan.nextLine();

                    stack.searchByName(searchName);
                    break;

                case 0:
                    System.out.println("Program finished.");
                    break;

                default:
                    System.out.println("Invalid menu choice!");
            }

            System.out.println();

        } while (choice != 0);

        scan.close();
    }
}