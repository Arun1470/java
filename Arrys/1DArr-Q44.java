import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=Integer.MIN_VALUE;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=n-1;i>=0;i--){
            if(a[i]>max){System.out.print(a[i]+" ");max=a[i];}
        }
    }
}
