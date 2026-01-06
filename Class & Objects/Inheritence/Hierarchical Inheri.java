import java.util.Scanner;
class A {
	int x;
	A(int x) {
		this.x=x;
	}
}
class B extends A {
	B(int x) {
		super(x);
	}
	void show() {
		System.out.println(x);
	}
}
class C extends A {
	C(int x) {
		super(x);
	}
	void show() {
		System.out.println(x);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		B obj1=new B(sc.nextInt());
		C obj2=new C(sc.nextInt());
		obj1.show();
		obj2.show();
	}
}
