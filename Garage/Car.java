import java.util.Scanner;

public class Car extends Vehicle {
    Scanner nDoors = new Scanner(System.in);
    static int nWheel = 4;

    public Car(String regNumber, String fName, String lName, int nWheel){
        super(regNumber, fName, lName, nWheel);
        System.out.println("Please input Number of doors");
        int doors = nDoors.nextInt();

        
    }




}