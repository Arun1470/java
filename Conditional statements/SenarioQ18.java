import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double liter=sc.nextDouble();
        double bill=0;
        if(liter<=1000){
            System.out.println("free");
        }
        else if (liter<=3000) {
              bill=((liter-bill)/1000.0)*5;
              System.out.println("for above 1000 liters:"+bill);
        }
        else if (liter>=3000){
            bill=10;
            bill=((liter-bill)/1000.0)*10;
            System.out.println("for above 3000 liters:"+bill);
        }
       }
      
    }
