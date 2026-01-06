import java.util.Scanner;
class Student {
	int id;
	String name;
	int marks;
	Student(int id,String name,int marks) {
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
	void display() {
		System.out.println(id+" "+name+" "+marks);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Student[] s=new Student[n];
		for(int i=0; i<n; i++) {
			int id=sc.nextInt();
			String name=sc.next();
			int marks=sc.nextInt();
			s[i]=new Student(id,name,marks);
		}
		for(int i=0; i<n; i++) {
			s[i].display();
		}
	}
}