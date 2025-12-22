import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int ans=-1;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++)
            for(int j=i+1;j<n;j++)
                if(a[i]==a[j]){ans=a[i];i=n;break;}
        System.out.println(ans);
    }
}
