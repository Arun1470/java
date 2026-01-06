import java.util.Scanner;
class Car {
    String brand;
    int year;
    void showInfo() {
        System.out.println("Brand: " + brand);
        System.out.println("Year: " + year);
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        Car myCar = new Car();
        myCar.brand = sc.nextLine();
        myCar.year = sc.nextInt();
        myCar.showInfo();
    }
}
