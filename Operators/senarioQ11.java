import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int value=sc.nextInt();
	    int profit=sc.nextInt();
	    int sell=value+profit;
		System.out.println("sell: "+sell);
	}
}
