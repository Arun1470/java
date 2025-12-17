import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            int s=0;
            for(int j=1;j<=i/2;j++){
                if(i%j==0){
                    s=s+j;
                }
            }
            if(s==i){
                System.out.print(i+" ");
            }
        }
    }
}
