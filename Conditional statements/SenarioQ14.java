import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>24&&age<50){
            System.out.println("for audelt:50");
        }
        else if (age>50){
            System.out.println("for senior:40");
        }
        else {
            System.out.println("for child:20rs");
        }
    }
}