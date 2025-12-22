import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int max=a[0],min=a[0],res=a[0];
        for(int i=1;i<n;i++){
            int t=max;
            max=Math.max(a[i],Math.max(max*a[i],min*a[i]));
            min=Math.min(a[i],Math.min(t*a[i],min*a[i]));
            res=Math.max(res,max);
        }
        System.out.println(res);
    }
}
