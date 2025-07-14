package Session3;

public class LoopAndDays {
    public  static  void  main(String[]args){
        for (int x=1; x <=10; x++){
            System.out.println(x);
            if (x % 2 == 0){
                System.out.println("Even");
            }else {
                System.out.println("Odd");
            }
            switch (x){
                case 1:
                    System.out.println("saturday");
                    break;
                case 2:
                    System.out.println("sunday");
                    break;
                case 3:
                    System.out.println("monday");
                    break;
                case 4:
                    System.out.println("tuesday");
                    break;
                case 5:
                    System.out.println("wednesday");
                    break;
                case 6:
                    System.out.println("thursday");
                    break;
                case 7:
                    System.out.println("friday");
                    break;
                default:
                    System.out.println("-----");
            }
        }
    }
}
