import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),l=0,m=0,h;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        h=n-1;
        while(m<=h){
            if(a[m]==0){int t=a[l];a[l]=a[m];a[m]=t;l++;m++;}
            else if(a[m]==1) m++;
            else{int t=a[m];a[m]=a[h];a[h]=t;h--;}
        }
        for(int i=0;i<n;i++) System.out.print(a[i]+" ");
    }
}
