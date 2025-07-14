package Session3;

import java.util.Scanner;

public class Grade {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the user's grade in characters A, B, C, D, F :");
            String grade = scanner.nextLine().toUpperCase();
            switch (grade) {
                case "A":
                    System.out.println("you are Excellent");
                    break;
                case "B":
                    System.out.println("You are Very Good");
                    break;
                case "C":
                    System.out.println("you are Good");
                    break;
                case "D":
                    System.out.println("you are Pass");
                    break;
                case "F":
                    System.out.println("you Fail");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    continue;
            }
            break;
        }
    }
}
