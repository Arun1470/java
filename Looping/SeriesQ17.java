import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int t=i,s=0;
            while(t>0){
                int r=t%10;
                s=s+r*r*r;
                t=t/10;
            }
            if(s==i){
                System.out.print(i+" ");
            }
        }
    }
}