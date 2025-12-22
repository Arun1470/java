import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        int c=0,el=0;
        for(int x:a){
            if(c==0){el=x;c=1;}
            else if(x==el)c++;
            else c--;
        }
        System.out.println(el);
    }
}
