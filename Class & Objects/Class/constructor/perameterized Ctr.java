import java.util.Scanner;
class Mobile {
	int id;
	String brand;
	double price;
	Mobile(int id,String brand,double price) {
		this.id=id;
		this.brand=brand;
		this.price=price;
	}
	void display() {
		System.out.println(id+" "+brand+" "+price);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Mobile[] m=new Mobile[n];
		for(int i=0; i<n; i++) {
			m[i]=new Mobile(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		for(int i=0; i<n; i++) {
			m[i].display();
		}
	}
}
