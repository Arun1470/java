import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int d=0;d<=9;d++){
            int c=0,temp=n;
            while(temp>0){
                if(temp%10==d){
                    c++;
                }
                temp=temp/10;
            }
            if(c>0){
                System.out.println(d+" "+c);
            }
        }
    }
}
