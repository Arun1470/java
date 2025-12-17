import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1,f=0;
        while(i*i<=n){
            if(i*i==n){
                f=1;
                break;
            }
            i++;
        }
        if(f==1){
            System.out.println("Perfect Square");
        }else{
            System.out.println("Not Perfect Square");
        }
    }
}

