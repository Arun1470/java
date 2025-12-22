import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),sum=0;
        int[] a=new int[n-1];
        for(int i=0;i<n-1;i++){a[i]=sc.nextInt();sum+=a[i];}
        System.out.println(n*(n+1)/2-sum);
    }
}
