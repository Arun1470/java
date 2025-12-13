import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        if(temp>=100){
            System.out.println("Feaver");
        }
        else {
            System.out.println("Normal");
        }
       
    }
}