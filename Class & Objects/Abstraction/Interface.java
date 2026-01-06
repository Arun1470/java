interface Shape {
	void draw();
}
class Rectangle implements Shape {
	public void draw() {
		System.out.println("Drawing Rectangle");
	}
}
class Main {
	public static void main(String[] args) {
		Shape s=new Rectangle();
		s.draw();
	}
}
