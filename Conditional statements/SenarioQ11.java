import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int am=sc.nextInt();
        if(am>=5000){
            System.out.println("discount for 5000 above: "+am*0.20);
        }
        else if (am>=3000&&am<5000){
            System.out.println("discount for 3000 above: "+am*0.10);
        }
        else {
            System.out.println(am*0.01);
        }
    }
}