import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int bal=sc.nextInt();
        int with=sc.nextInt();
        if(bal>=with&&with%100==0){
            System.out.println("Withdrowel allowed");
        }
        else if (with>bal){
            System.out.println("Invalid Balance");
        }
        else {
            System.out.println("error");
        }
    }
}