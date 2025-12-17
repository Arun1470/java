import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int se=0,so=0;
        for(int i=1;i<=n;i++){
            if(i%2==0){
                se=se+i;
            }else{
                so=so+i;
            }
        }
        System.out.println(se);
        System.out.println(so);
    }
}
