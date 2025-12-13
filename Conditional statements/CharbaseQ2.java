import java.util.Scanner;
public class Main{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z'){
            System.out.println("Uppper");
        }
        else if(ch>='a' && ch<='z'){
            System.out.println("lower");
        }
        else if(ch>0){
            System.out.println("Number");
        }
        else
            System.out.println("Special Symbol");
    }
}
