import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String signal=sc.next();
        if(signal.equals("green")){
            System.out.println("Go");
        }
        else if (signal.equals("orange")){
            System.out.println("Ready");
        }
        else {
            System.out.println("wait");
        }
    }
}
