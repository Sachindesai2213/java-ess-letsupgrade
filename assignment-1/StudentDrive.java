import java.util.*;

class Student {
    String name;
    int roll;
    float marks;

    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Roll Number: ");
        roll = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextFloat();
    }

    void display() {
        System.out.println("\nName: " + name + "\nRoll No: " + roll + "\nMarks: " + marks);
    }
}

class StudentDrive {
    public static void main(String[] args) {
        Student student = new Student();
        student.input();
        student.display();
    }
}