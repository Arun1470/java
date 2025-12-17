import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int d=0,p=0;
        for(int i=s.length()-1;i>=0;i--){
            d=d+(s.charAt(i)-'0')*(int)Math.pow(2,p);
            p++;
        }
        System.out.println(d);
    }
}
