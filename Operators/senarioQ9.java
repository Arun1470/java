import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double p=sc.nextDouble();
	    double r=sc.nextDouble();
	    double t=sc.nextDouble();
		System.out.println("Simple intrest: "+(p*r*t)/100);
	}
}

