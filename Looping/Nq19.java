import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sq=n*n;
        int t=n,f=1;
        while(t>0){
            if(t%10!=sq%10){
                f=0;
                break;
            }
            t=t/10;
            sq=sq/10;
        }
        if(f==1){
            System.out.println("Automorphic");
        }else{
            System.out.println("Not Automorphic");
        }
    }
}
