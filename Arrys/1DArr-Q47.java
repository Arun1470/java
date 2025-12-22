import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),max=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        for(int x:s){
            if(!s.contains(x-1)){
                int c=1;
                while(s.contains(x+c)) c++;
                max=Math.max(max,c);
            }
        }
        System.out.println(max);
    }
}
