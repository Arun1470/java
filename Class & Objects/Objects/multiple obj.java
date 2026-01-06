import java.util.Scanner;
class Student {
    int id;
    int marks;
    void input(Scanner sc) {
        id = sc.nextInt();
        marks = sc.nextInt();
    }
    void display() {
        System.out.println("ID: "+id +", Marks: "+marks);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        Student s2 = new Student();
        s1.input(sc);
        s2.input(sc);
        s1.display();
        s2.display();
    }
}
