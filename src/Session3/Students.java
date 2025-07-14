package Session3;

import java.util.Scanner;

public class Students {
    public static void main(String[] args){
        System.out.println("Enter the number of the students :");
        Scanner scanner = new Scanner(System.in);
        int numStudents = scanner.nextInt();
        scanner.nextLine();
        for (int i=0; i<numStudents;i++){
            System.out.println("what is the student number " +(i+1)+" name");
            String stuName = scanner.nextLine();

            double score = 0;
            int exams = 3;
            for (int s=1; s<=exams;s++){
                System.out.println("score exam "+ s+" for student " + stuName + ":");
                score += scanner.nextDouble();
            }
            scanner.nextLine();
            double average = score / exams;
            int result = (int) average;
            String grade;
            if (result>=85){
                 grade = "A";
            } else if (result>=70 && result<84){
                 grade = "B";
            } else if (result>=50 && result <69){
                grade = "C";
            }else {
                 grade = "F";
            }
            System.out.println("student "+stuName+" his averge "+average+" his grade "+ grade);
        }
        }
    }

