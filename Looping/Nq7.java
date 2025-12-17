import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int a=sc.nextInt();
	    int temp=a;int digit=0;int sum=0;
	    while(temp!=0){
	        temp=temp/10;
	        digit++;
	    }
	    temp=a;
	    while(temp!=0){
	        int num=temp%10;
	        sum+=Math.pow(num,digit);
	        temp/=10;

	    }
	    if(a==sum){
	    System.out.println(" Amstrong number");
	    }
	    else 
	    System.out.println("Not an Amstrong number");
    }
}
