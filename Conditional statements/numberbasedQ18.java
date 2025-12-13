import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0 && a<9){
            System.out.println("Single Digit");
        }
        else if(a>9 && a<99){
            System.out.println("Double Digit");
        }
        else if(a>99 && a<999){
            System.out.println("Three Digit");
        }
        else
            System.out.println("Error");
    }
}
