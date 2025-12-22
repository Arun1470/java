import java.util.Scanner;
import java.util.HashSet;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<n;i++) s.add(sc.nextInt());
        int i=1;
        while(s.contains(i)) i++;
        System.out.println(i);
    }
}
