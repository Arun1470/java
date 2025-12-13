import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        if (num%2==0&&num%5==0&&num%8!=0) {
            System.out.println(num+" is divisible by 2 and 5 but not by 8.");
        } else {
            System.out.println(num+" does not satisfy the condition.");
        }
    }
}
