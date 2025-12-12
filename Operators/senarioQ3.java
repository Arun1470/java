import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double speed=sc.nextDouble();
	    double time=sc.nextDouble();
	    double distance=speed*time;
	    System.out.println(distance);
	}
}