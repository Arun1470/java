import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        if(age>=60){
            System.out.println("You're Eligible for Senior citizen benefits");
        }
        else{
        System.out.println("You're Not Eligible for Senior citizen benifits");
        }
    }
}
