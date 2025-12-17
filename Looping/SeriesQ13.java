import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int s=0;
        while(true){
            int n=sc.nextInt();
            if(n<0){
                break;
            }
            s=s+n;
        }
        System.out.println(s);
    }
}
