import java.util.Scanner;
class Student {
	int id;
	String name;
	Student(int id,String name) {
		this.id=id;
		this.name=name;
	}
	void display() {
		System.out.println(id+" "+name);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Student s=new Student(sc.nextInt(),sc.next());
		s.display();
	}
}
