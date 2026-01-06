import java.util.Scanner;
class A {
	int x;
	A(int x) {
		this.x=x;
	}
	void show() {
		System.out.println(x);
	}
}
class B extends A {
	int y;
	B(int x,int y) {
		super(x);
		this.y=y;
	}
	void display() {
		show();
		System.out.println(y);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		B obj=new B(sc.nextInt(),sc.nextInt());
		obj.display();
	}
}
