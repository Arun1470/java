import java.util.Scanner;
class Account {
	public int accNo;
	protected String name;
	private double balance;
	Account(int accNo,String name,double balance) {
		this.accNo=accNo;
		this.name=name;
		this.balance=balance;
	}
	void display() {
		System.out.println(accNo+" "+name+" "+balance);
	}
}
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Account a=new Account(sc.nextInt(),sc.next(),sc.nextDouble());
		a.display();
	}
}
