class Student {
	int id;
	String name;
	Student() {
		id=0;
		name="NA";
	}
	Student(int i,String n) {
		id=i;
		name=n;
	}
	void display() {
		System.out.println(id+" "+name);
	}
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student(1,"Arun");
		s1.display();
		s2.display();
	}
}

