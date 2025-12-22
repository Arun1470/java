import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),ans=a=0,max=0;
        int[] a1=new int[n];
        for(int i=0;i<n;i++) a1[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++) if(a1[i]==a1[j]) c++;
            if(c>max){max=c;ans=a1[i];}
        }
        System.out.println(ans);
    }
}
