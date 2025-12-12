import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	   int price=sc.nextInt();
	   int numofbuy=sc.nextInt();
	   int payfor=((numofbuy/5)*3)+(numofbuy%5);
	   int totalamount=payfor*price;
	   System.out.println("payfor: "+payfor+" "+"totalamount: "+totalamount);
	}
}
