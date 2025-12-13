import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int per=sc.nextInt();
        if(per==100){
            System.out.println("battery full");
        }
        else if (per==50){
            System.out.println("Consumed");
        }
        else if (per<20){
        System.out.println("battery low");
        }
    }
}