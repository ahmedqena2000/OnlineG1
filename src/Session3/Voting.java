package Session3;

import java.util.Scanner;

public class Voting {
    public  static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age : ");
        int age = scanner.nextInt();
        System.out.println("Please enter nationality : ");
        scanner.nextLine();
        String nationality = scanner.nextLine().toLowerCase();
        if (age>=18 && nationality.equals("egyptian")){
            System.out.println("Eligible to vote");
        }else {
            System.out.println("Not eligible");
        }
    }
}
