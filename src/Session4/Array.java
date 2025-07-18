package Session4;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[]args){
        int [] scores = {85,92,78,96,88};
        int max = Arrays.stream(scores).max().getAsInt();
        System.out.print("the array we have :");
        System.out.println(Arrays.toString( scores));
        System.out.println("the maximum value is : "+max);
        float sum=0;

        for (int score : scores) {
            sum += score;
        }
        System.out.println("the sum of values is : " + sum);
        float average = sum / scores.length;
        System.out.println("the average will be " + average);
        Arrays.sort(scores);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Chose a value from array to search for its index");
        System.out.println(Arrays.toString(scores));
        int value = scanner.nextInt();
        int ind = Arrays.binarySearch(scores, value);
        if (ind>=0){
            System.out.println("The index of value "+value+"is "+ind);
        }else {
            System.out.println("the value you are looking for isn't found");
        }

    }

}
