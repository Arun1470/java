import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n,s=0;
        while(sq>0){
            s=s+sq%10;
            sq=sq/10;
        }
        if(s==n){
            System.out.println("Neon");
        }else{
            System.out.println("Not Neon");
        }
    }
}
