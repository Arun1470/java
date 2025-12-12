import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int basic=sc.nextInt();
	    int hra=sc.nextInt();
	    int allow=sc.nextInt();
		System.out.println("total: "+(basic+hra+allow));
	}
}