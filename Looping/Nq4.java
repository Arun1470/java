import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num;int sum=1;
	    num=sc.nextInt();
	    while (num!=0){
	        sum=sum*(num%10);
	        num=num/10;
	    }
		System.out.println(sum);
	}
}