import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),s=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int sum=0,l=0;
        for(int r=0;r<n;r++){
            sum+=a[r];
            while(sum>s) sum-=a[l++];
            if(sum==s){System.out.println(l+" "+r);return;}
        }
        System.out.println(-1);
    }
}
