import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();
        for(int i=0;i<n;i++){
            int z=0,o=0;
            for(int j=i;j<n;j++){
                if(a[j]==0)z++;else o++;
                if(z==o) max=Math.max(max,j-i+1);
            }
        }
        System.out.println(max);
    }
}
