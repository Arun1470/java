import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int crg=sc.nextInt();
        if(crg==100){
            System.out.println("full");
        }
        else if (crg<20){
            System.out.println("low");
        }
        else {
            System.out.println("moderate");
        }
    }
}