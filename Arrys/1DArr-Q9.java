import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,r;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        r=n-1;
        while(l<r){
            if(a[l]<0) l++;
            else if(a[r]>=0) r--;
            else{int t=a[l];a[l]=a[r];a[r]=t;}
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
