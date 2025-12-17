import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num;int rev=0;
	    num=sc.nextInt();
	    int org=num;
	    while(num!=0){
	        int i=num%10;
	        rev=rev*10+i;
	        num=num/10;
	    }
		System.out.println(rev);
if ( org==rev){
    System.out.println("p");
}
else
System.out.println("np");
	}
}