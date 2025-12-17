import java.util.Scanner;
public class Main{
    static int fact(int n){
        int f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        return f;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int t=n,s=0;
        while(t>0){
            s=s+fact(t%10);
            t=t/10;
        }
        if(s==n){
            System.out.println("Strong");
        }else{
            System.out.println("Not Strong");
        }
    }
}