import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.nextLine();
        if(number.length()>=10){
            System.out.println("Valid number");
        }
        else {
            System.out.println("Invalid number");
        }
    }
}
