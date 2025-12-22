import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int max=Integer.MIN_VALUE,sec=Integer.MIN_VALUE;
        for(int x:a){
            if(x>max){sec=max;max=x;}
            else if(x>sec&&x!=max) sec=x;
        }
        System.out.println(sec);
    }
}
