import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        m=a[0];
        for(int i=1;i<n;i++) if(a[i]>m)m=a[i];
        System.out.println(m);
    }
}
