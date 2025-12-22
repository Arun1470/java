import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int min=Integer.MAX_VALUE,sec=Integer.MAX_VALUE;
        for(int x:a){
            if(x<min){sec=min;min=x;}
            else if(x<sec&&x!=min) sec=x;
        }
        System.out.println(sec);
    }
}
