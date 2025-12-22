import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),x=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int f=-1,l=-1;
        for(int i=0;i<n;i++) if(a[i]==x){if(f==-1)f=i;l=i;}
        System.out.println(f+" "+l);
    }
}
