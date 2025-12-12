import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double candie=sc.nextDouble();
	    double student=sc.nextDouble();
	    double each=candie/student;
	    double remain=candie%student;
		System.out.println("eachgets "+each+""+"remaining: "+remain);
	}
}