import java.util.Scanner;
public class Main{
    static void rev(int[] a,int l,int r){
        while(l<r){int t=a[l];a[l]=a[r];a[r]=t;l++;r--;}
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),k=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        k%=n;
        rev(a,0,k-1);rev(a,k,n-1);rev(a,0,n-1);
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
