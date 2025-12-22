import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int k=0;
        for(int i=0;i<n;i++){
            boolean f=false;
            for(int j=0;j<k;j++) if(a[i]==a[j]) f=true;
            if(!f) a[k++]=a[i];
        }
        for(int i=0;i<k;i++) System.out.print(a[i]+" ");
    }
}
