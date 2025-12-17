import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int prev=-1;
        int f=1;
        while(n>0){
            int r=n%10;
            if(prev!=-1&&r<prev){
                f=0;
                break;
            }
            prev=r;
            n=n/10;
        }
        if(f==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
