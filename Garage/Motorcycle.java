import java.util.Scanner;

public class Motorcycle extends Vehicle {
    Scanner engineSize = new Scanner(System.in);
    static int nWheel = 2;

    public Motorcycle(String regNumber, String fName, String lName, int nWheel){
        System.out.println("Please input Engine size in CCs");
        engineSize = engineSize.nextLine();

        super(regNumber, fName, lName, nWheel);
    }


}