import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        //int b=sc.nextInt();
        if(a>99){
            System.out.println("3 Digit");
        }
        else
            System.out.println("Not 3 Digit");
    }
}