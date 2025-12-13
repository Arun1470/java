import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int ft=a/100;
	    int lt=a%100;
	    if(ft==lt){
	        System.out.println("Equal");
	    }
	    else
	        System.out.println("NOt Equal");
	}
}
