import java.util.Scanner;
public class Main{
    static int sum(int n){
        int s=0;
        while(n>0){
            s=s+n%10;
            n=n/10;
        }
        return s;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int t=i;
            while(t>9){
                t=sum(t);
            }
            if(t==1){
                System.out.print(i+" ");
            }
        }
    }
}

