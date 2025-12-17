import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int s=0,c=0;
        while(c<n){
            int x=sc.nextInt();
            if(x>0){
                s=s+x;
                c++;
            }
        }
        System.out.println(s);
    }
}
