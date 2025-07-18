package Main;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student("Zain", 5, 3.8f);
        stu1.displayInfo();
        stu1.study();
        System.out.println("student "+stu1.getName()+ "  his gpa is "+ +stu1.getGpa());
        stu1.setName("Jana");
        System.out.println("name after modifying is " + stu1.getName());
        System.out.println("-------------------");

        Student stu2 = new Student("Jana", 12, 6.5f);
        stu2.displayInfo();
        stu2.study();
        System.out.println("student "+stu2.getName()+ "  his gpa is "+ +stu2.getGpa());
        stu2.setName("Zain");
        System.out.println("name after modifying is " + stu2.getName());

    }
}
