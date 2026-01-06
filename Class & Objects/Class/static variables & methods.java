import java.util.Scanner;
class Employee {
	static int count;
	int id;
	String name;
	double salary;
	Employee(int id,String name,double salary) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		count++;
	}
	static void display(Employee[] e) {
		for(int i=0; i<e.length; i++) {
			System.out.println(e[i].id+" "+e[i].name+" "+e[i].salary);
		}
		System.out.println(count);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Employee[] e=new Employee[n];
		for(int i=0; i<n; i++) {
			e[i]=new Employee(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		Employee.display(e);
	}
}