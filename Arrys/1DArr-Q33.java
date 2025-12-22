import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int l=0,r=n-1,ans=-1;
        while(l<=r){
            int m=(l+r)/2;
            if(a[m]==x){ans=m;break;}
            else if(a[m]<x) l=m+1;
            else r=m-1;
        }
        System.out.println(ans);
    }
}
