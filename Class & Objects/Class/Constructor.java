import java.util.Scanner;
class Book {
	int id;
	String title;
	double price;
	Book(Scanner sc) {
		id=sc.nextInt();
		title=sc.next();
		price=sc.nextDouble();
	}
	void display() {
		System.out.println(id+" "+title+" "+price);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Book[] b=new Book[n];
		for(int i=0; i<n; i++) {
			b[i]=new Book(sc);
		}
		for(int i=0; i<n; i++) {
			b[i].display();
		}
	}
}
