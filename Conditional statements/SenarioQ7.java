import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int unit=sc.nextInt();
        if(unit<=100){
            System.out.println("free");
        }
        else if (unit>100&&unit<=300) {
            System.out.println(unit*5+""+"  5rs per unit");
        }
        else if (unit>300&&unit<=500){
            System.out.println(unit*10+""+"  10rs per unit");
        }
        else if(unit>500){
            System.out.println(unit*15+""+"  10rs per unit+addictional charge +5rs for used above 500 units");
        }
       
    }
}
