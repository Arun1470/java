import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int n2000=n/2000;
		int n500=(n%2000)/500;
		int n100=((n%2000)%500)/100;
		int remaining=((n%2000)%500)%100;
		System.out.println("2000: "+n2000);
		System.out.println("500: "+n500);
		System.out.println("100: "+n100);
		System.out.println("remmain: "+remaining);
	}
}
