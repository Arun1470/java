import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int b=sc.nextInt();
	    int str=a%100;
	    int str1=b%100;
	    if(str==str1){
	        System.out.println("Equal");
	    }
	    else
	        System.out.println("NOt Equal");
	}
}
