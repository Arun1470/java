import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int e=0,o=0;
        while(n>0){
            if((n%10)%2==0){
                e=1;
            }else{
                o=1;
            }
            n=n/10;
        }
        if(e==1&&o==0){
            System.out.println("Even");
        }else if(e==0&&o==1){
            System.out.println("Odd");
        }else{
            System.out.println("Mixed");
        }
    }
}
