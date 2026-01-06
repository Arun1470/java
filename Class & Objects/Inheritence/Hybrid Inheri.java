import java.util.Scanner;
interface A {
	void setA(int x);
}
class B {
	int y;
	void setB(int y) {
		this.y=y;
	}
}
class C extends B implements A {
	int x;
	public void setA(int x) {
		this.x=x;
	}
	void display() {
		System.out.println(x+" "+y);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C obj=new C();
		obj.setA(sc.nextInt());
		obj.setB(sc.nextInt());
		obj.display();
	}
}
