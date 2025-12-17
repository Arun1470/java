import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,i=2;
        while(c<n){
            System.out.print(i+" ");
            i=i+2;
            c++;
        }
    }
}
