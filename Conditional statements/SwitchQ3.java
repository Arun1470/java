import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    int day=sc.nextInt();
	    switch(day){
	        case 7:case 1:
	            System.out.println("Weekend");
	            break;
	        case 2:case 3:case 4:case 5:case 6:
	            System.out.println("Weekday");
	            break;
	    }
    }
}
