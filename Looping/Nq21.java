import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n<1){
            System.out.println("No");
            return;
        }
        while(n%3==0){
            n=n/3;
        }
        if(n==1){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
