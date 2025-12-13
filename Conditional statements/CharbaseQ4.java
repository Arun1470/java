import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        if (ch>='0'&&ch<='9'){
            System.out.println(ch+" is a digit.");
        } else {
            System.out.println(ch+" is not a digit.");
        }
    }
}
