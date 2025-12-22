import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();int ans=-1;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            boolean f=false;
            for(int j=0;j<n;j++) if(i!=j&&a[i]==a[j]) f=true;
            if(!f){ans=a[i];break;}
        }
        System.out.println(ans);
    }
}
