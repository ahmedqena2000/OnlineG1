package Main;

public class Student {
    private String name;
    private int age;
    private   float gpa;

    Student(String name, int age, float gpa){
        this.name = name;
        this.age = age;
        this.gpa = gpa;
    }
    void displayInfo(){
        System.out.println("name is "+ name);
    }
    void study(){
        System.out.println("student "+name+" is studying");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public float getGpa() {
        return gpa;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }
}
