import java.util.Scanner;
interface A {
	void showA(int x);
}
interface B {
	void showB(int y);
}
class C implements A,B {
	int x,y;
	public void showA(int x) {
		this.x=x;
	}
	public void showB(int y) {
		this.y=y;
	}
	void display() {
		System.out.println(x+" "+y);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		C obj=new C();
		obj.showA(sc.nextInt());
		obj.showB(sc.nextInt());
		obj.display();
	}
}
