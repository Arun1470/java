import java.util.Scanner;
class Car {
	int id;
	String model;
	double price;
	Car() {}
	void setData(int id,String model,double price) {
		this.id=id;
		this.model=model;
		this.price=price;
	}
	void display() {
		System.out.println(id+" "+model+" "+price);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Car[] c=new Car[n];
		for(int i=0; i<n; i++) {
			c[i]=new Car();
			c[i].setData(sc.nextInt(),sc.next(),sc.nextDouble());
		}
		for(int i=0; i<n; i++) {
			c[i].display();
		}
	}
}
