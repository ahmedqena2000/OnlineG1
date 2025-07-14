package Session3;

import java.util.Scanner;

public class CountAndReverse {
    public static void main(String[]args){
        System.out.println("please enter at least two numbers :");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int reversed = 0;
        int count = 0;
        while (count < String.valueOf(number).length()){
            count++;
        }
        while (number>0){
            int digit = number%10;
            reversed = reversed*10 + digit;
            number /= 10;
        }
        System.out.println("Count of digits " + count);
        System.out.println("Reversed of your number is :" + reversed);
    }
}
