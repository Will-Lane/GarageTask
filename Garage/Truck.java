import java.util.Scanner;
public class Truck extends Vehicle {
    Scanner load = new Scanner(System.in);
    static int nWheel = 8;

    public Truck(String regNumber, String fName, String lName, int nWheel){
         super(regNumber, fName, lName, nWheel);
         System.out.println("Please input maximum load in tonnes");
        int loadV = load.nextInt();

       
    }




}