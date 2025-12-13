import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        if(day==1||day==7){
            System.out.println("for weekend:400rs");
        }
        else {
            System.out.println("for weekdays:250rs");
        }
    }
}
