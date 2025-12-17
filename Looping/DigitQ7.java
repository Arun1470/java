import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int last=n%10;
        int first=n;
        int p=1;
        while(first>=10){
            first=first/10;
            p=p*10;
        }
        int mid=(n%p)/10;
        int res=last*p+mid*10+first;
        System.out.println(res);
    }
}
