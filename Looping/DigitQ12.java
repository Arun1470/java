import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int se=0,so=0;
        while(n>0){
            int r=n%10;
            if(r%2==0){
                se=se+r;
            }else{
                so=so+r;
            }
            n=n/10;
        }
        System.out.println(se-so);
    }
}
