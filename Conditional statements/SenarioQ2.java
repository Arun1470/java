import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("You're Eligible");
        }
        else{
        System.out.println("You're Not Eligible");
        }
    }
}
