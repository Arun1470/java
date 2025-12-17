import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int num;int sum=0;int c;
	    num=sc.nextInt();
	    while(num!=0){
	        num=num/10;
	        sum++;
	    }
		System.out.println(sum);
	}
}