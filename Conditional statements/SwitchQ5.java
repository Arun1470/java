import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Enter pin");
		int balance=50000;
		int pin=sc.nextInt();
		if(pin==1470){
		    System.out.println("withdrow press 1 or deposit press 2");
		    int wid=sc.nextInt();
		    switch(wid){
		        case 1:
		            wid=sc.nextInt();
		            int avaibalance=balance-wid;
		            System.out.println("available balance"+avaibalance);
		            break;
		        case 2:
		            int dep=sc.nextInt();
		            int avaibalanc=balance+dep;
		            System.out.println("available balance"+avaibalanc);
		            break;
		    }
		    System.out.println("Transaction Sucessful");
		}
		else {
		    System.out.println("Invalid pin number");
		}
		
	}
}
