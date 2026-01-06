class Student {
	private int id;
	private String name;
	void setId(int id) {
		this.id=id;
	}
	void setName(String name) {
		this.name=name;
	}
	int getId() {
		return id;
	}
	String getName() {
		return name;
	}
}
class Main {
	public static void main(String[] args) {
		Student s=new Student();
		s.setId(102);
		s.setName("Arun");
		System.out.println(s.getId());
		System.out.println(s.getName());
	}
}
