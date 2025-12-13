import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int Pin=sc.nextInt();
        if(Pin==1470){
            System.out.println("Pin is matched");
        }
        else {
            System.out.println("Pin not matched");
        }
    }
}