import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int str=sc.nextInt();
        String result=(str>0&&(str&(str-1))==0)?(str+"is power of 2"):(str+"is not power of 2");
        System.out.println(result);
    }
}
