import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();boolean ok=true;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]==a[j]) ok=false;
        System.out.println(ok);
    }
}
