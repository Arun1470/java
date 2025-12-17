import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,res=0,p=1;
        while(n>0){
            r=n%10;
            if(r!=0){
                res=res+r*p;
                p=p*10;
            }
            n=n/10;
        }
        System.out.println(res);
    }
}
