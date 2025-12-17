import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s="";
        while(n>0){
            int r=n%10;
            if(r==0)s="Zero "+s;
            if(r==1)s="One "+s;
            if(r==2)s="Two "+s;
            if(r==3)s="Three "+s;
            if(r==4)s="Four "+s;
            if(r==5)s="Five "+s;
            if(r==6)s="Six "+s;
            if(r==7)s="Seven "+s;
            if(r==8)s="Eight "+s;
            if(r==9)s="Nine "+s;
            n=n/10;
        }
        System.out.print(s);
    }
}
