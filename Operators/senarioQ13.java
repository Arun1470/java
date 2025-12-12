import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int price=sc.nextInt();
	    int buy=sc.nextInt();
	    int buys=buy/3;
	    int totalmangoprice=price*buy;
	    int totalmango=buys+buy;
		System.out.println("total mango price: "+totalmangoprice+" "+"total mango: "+totalmango);
	}
}
