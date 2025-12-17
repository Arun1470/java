import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n-1;j++) System.out.print(" ");
            for(char j=(char)('A'+n-i-1);j>='A';j--) System.out.print(j);
            for(char j='B';j<='A'+n-i-1;j++) System.out.print(j);
            System.out.println();
        }
    }
}
