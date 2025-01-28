import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student stu1 = new Student(1,"Alice Johnson", 20, "A");
        Student stu2 = new Student(2,"Bob Smith", 19, "B");
        Student stu3 = new Student(3,"Charlie Brown", 21, "C");
        Student stu4 = new Student(4,"Daisy Miller", 22, "A");

        Student[] students = {stu1, stu2, stu3, stu4};
        System.out.println(Arrays.toString(students));

    }
}