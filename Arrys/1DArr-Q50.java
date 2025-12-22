import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),m=sc.nextInt();
        int[] a=new int[n],b=new int[m],c=new int[n+m];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<m;i++) b[i]=sc.nextInt();
        int i=0,j=0,k=0;
        while(i<n&&j<m) c[k++]=a[i]<b[j]?a[i++]:b[j++];
        while(i<n) c[k++]=a[i++];
        while(j<m) c[k++]=b[j++];
        int len=n+m;
        if(len%2==1) System.out.println(c[len/2]);
        else System.out.println((c[len/2-1]+c[len/2])/2.0);
    }
}
