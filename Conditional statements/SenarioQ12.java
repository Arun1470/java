import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int deg=sc.nextInt();
        if(deg<0){
            System.out.println("cold");
        }
        else if (deg<70){
            System.out.println("Plasant");
        }
        else {
            System.out.println("Hot");
        }
    }
}