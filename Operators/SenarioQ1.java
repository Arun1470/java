
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    double price=sc.nextDouble();
	    double discount=sc.nextDouble();
	    double discamount = discount*price/100;
	    double finalamount=price-discamount;
	    System.out.println(discamount);
	    System.out.println(finalamount);
	    
	}
}