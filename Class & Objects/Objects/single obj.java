import java.util.Scanner;
class student {
	int id,marks;
	void display() {
		System.out.println(id+" "+marks);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		student s=new student();
		s.id=sc.nextInt();
		s.marks=sc.nextInt();
		s.display();
	}
}