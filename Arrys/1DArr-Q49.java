import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++){int x=sc.nextInt();if(x>0){s.add(x);max=Math.max(max,x);}}
        for(int i=max;i>=1;i--) if(!s.contains(i)){System.out.println(i);return;}
        System.out.println(-1);
    }
}
