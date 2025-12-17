import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=0,cu=0;
        while(n>0){
            int r=n%10;
            sq=sq+r*r;
            cu=cu+r*r*r;
            n=n/10;
        }
        System.out.println(sq);
        System.out.println(cu);
    }
}
