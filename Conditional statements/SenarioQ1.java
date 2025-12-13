import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>=10000){
            System.out.println(a*0.20);
        }
        else if(a>=5000){
            System.out.println(a*0.10);
        }
        else {
            System.out.println(a*0.01);
        }
    }
}
