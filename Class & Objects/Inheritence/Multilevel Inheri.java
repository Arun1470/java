import java.util.Scanner;
class A {
	int x;
	A(int x) {
		this.x=x;
	}
}
class B extends A {
	int y;
	B(int x,int y) {
		super(x);
		this.y=y;
	}
}
class C extends B {
	int z;
	C(int x,int y,int z) {
		super(x,y);
		this.z=z;
	}
	void display() {
		System.out.println(x+" "+y+" "+z);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C obj=new C(sc.nextInt(),sc.nextInt(),sc.nextInt());
		obj.display();
	}
}
