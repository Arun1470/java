import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        if(data<=250&&data>0){
            System.out.println("low data");
        }
        else if (data==1000) {
              System.out.println("half consumed");
        }
        else if (data==0){
            System.out.println("Data over");
        }
       }
      
    }
