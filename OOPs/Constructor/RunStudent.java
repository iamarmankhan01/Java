
/*
WAP to create Student,Now input Student name and Marks of 3subjects.
(Implements this program of 3 students)
*/
import java.util.Scanner;

class Student {
    String name, div;
    int m1, m2, m3, total;
    float per;

    void input() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Student Name and Marks of 3 Subjects");
        name = scan.next();
        m1 = scan.nextInt();
        m2 = scan.nextInt();
        m3 = scan.nextInt();
    }

    void printMarksheet() {
        total = m1 + m2 + m3;
        per = total / 3.0f;
        if (per >= 60)
            div = "First Division";
        else if (per >= 50)
            div = "Second Divison";
        else if (per >= 40)
            div = "Third Divison";
        else
            div = "Fail";
        System.out.println("              ");
        System.out.println("Student Name  :" + name);
        System.out.println("Total marks    :" + total);
        System.out.println("Percentage    :" + per);
        System.out.println("Divison       :" + div);
    }
}

class RunStudent {
    public static void main(String args[]) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        stu1.input();
        stu2.input();
        stu3.input();
        stu1.printMarksheet();
        stu2.printMarksheet();
        stu3.printMarksheet();
    }
}
