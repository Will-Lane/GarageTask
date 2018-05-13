import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class Garage {
    static String regNumber;
    static String vehicleType;
    static int nWheel;
    public static ArrayList<Vehicle> vehicleList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner vehicleInput = new Scanner(System.in);
        Scanner type = new Scanner(System.in);
        Scanner reg = new Scanner(System.in);
        Scanner nameInput = new Scanner(System.in);
        Scanner nDoors = new Scanner(System.in);
        Scanner exists = new Scanner(System.in);
        Scanner checkContinue = new Scanner(System.in);

        for (int i=0; i>-1; i++) {

        String fName;
        String lName;

        
        System.out.println("What would you like to do? (Add vehicle, Retrieve, Repair)");
        String checkInput = vehicleInput.nextLine();

        System.out.println("Vehicle Type (Car, Motorbike, Truck)");
        vehicleType = type.nextLine();

        System.out.println("Registration Number");
        regNumber = reg.nextLine();
        
        if (new String("Add vehicle").equals(checkInput)){
                System.out.println("Please Input First Name");
                fName = nameInput.nextLine();
        
                System.out.println("Please Input surname");
                lName = nameInput.nextLine();

                if (new String("Motorbike").equals(vehicleType)){
                    Motorbike motorbike = new Motorbike(regNumber,fName, lName, nWheel);
                    addVehicle(motorbike);

                } else if (new String("Car").equals(vehicleType)){
                    Car car = new Car(regNumber, fName, lName, nWheel);
                    addVehicle(car);

                } else if (new String("Truck").equals(vehicleType)){
                    Truck truck = new Truck(regNumber, fName, lName, nWheel);
                    addVehicle(truck);
                }
                viewRecords();
            
            
        } else if (new String("Retrieve").equals(checkInput)){

                removeVehicle(regNumber);
                viewRecords();


        } else if (new String("Repair").equals(checkInput)){
                System.out.println("Please Input First Name");
                fName = nameInput.nextLine();

                System.out.println("Please Input surname");
                lName = nameInput.nextLine();

                System.out.println("is the Vehicle already in the system? y/n");
                String checkExists = exists.nextLine();

                if (checkExists.equals("n")){
                    if (new String("Motorbike").equals(vehicleType)){
                        Motorbike motorbike = new Motorbike(regNumber,fName, lName, Motorbike.nWheel);
                        addVehicle(motorbike);
                        repairVehicle(motorbike);

                    } else if (new String("Car").equals(vehicleType)){
                        Car car = new Car(regNumber, fName, lName, Car.nWheel);
                        addVehicle(car);
                        repairVehicle(car);

                    } else if (new String("Truck").equals(vehicleType)){
                        Truck truck = new Truck(regNumber, fName, lName, Truck.nWheel);
                        addVehicle(truck);
                        repairVehicle(truck);

                    }
                } else {

                if (new String("Motorbike").equals(vehicleType)){
                    Motorbike motorbike = new Motorbike(regNumber,fName, lName, Motorbike.nWheel);
                    repairVehicle(motorbike);
                } else if (new String("Car").equals(vehicleType)){
                    Car car = new Car(regNumber, fName, lName, Car.nWheel);
                    repairVehicle(car);
                } else if (new String("Truck").equals(vehicleType)){
                    Truck truck = new Truck(regNumber, fName, lName, Truck.nWheel);
                    repairVehicle(truck);
                }
                System.out.println("Please pay Bill to release vehicle");
                removeVehicle(regNumber);
                }
            }
            
            System.out.println("would you like to add, remove or repair another vehicle? y/n");
            String continueV = checkContinue.nextLine();
            if (new String("n").equals(continueV)){
            break;
            }
        }
            
    }

    

    private static void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    private static void removeVehicle(String regNumber){
        Iterator<Vehicle> iter = vehicleList.iterator();
        while (iter.hasNext()){
            Vehicle v = (Vehicle) iter.next();
            if (v.regNumber == regNumber){
                iter.remove();
            }
        }

    }

    private static void repairVehicle(Vehicle vehicle) {
        
        if (nWheel == 2) {
            System.out.println("Motorbike repair = £150");
        }else if (nWheel == 4) {
            System.out.println("Car repair = £400");
        }else if (nWheel == 8) {
            System.out.println("Truck repair = £800");
        }else {
            System.out.println("Invalid Selection");
        }

        System.out.println(nWheel);

    }

    public static void viewRecords(){

        Scanner view = new Scanner(System.in);

        System.out.println("Would you like to view stored vehicles? y/n");
        
        String viewR = view.nextLine();
        if (viewR.equals("y")) {
            System.out.println(vehicleList);
        }
    }


}

// public class Vehicle {
//     public String regNumber;

//     public Vehicle(String regNumber, String fName, String lName, int nWheel){
//         this.regNumber = regnumber;
//     }
// }

// Public class Motorcycle extends Vehicle {
//     Scanner engineSize = new Scanner(System.in);
//     static int nWheel = 2;

//     public Motorcycle(String regNumber, String fName, String lName, int nWheel){
//         System.out.println("Please input Engine size in CCs")
//         engineSize = engineSize.nextLine();

//         super(regNumber, fName, lName, nWheel);
//     }


// }

// Public class Car extends Vehicle {
//     Scanner nDoors = new Scanner(System.in);
//     static int nWheel = 4;

//     public Car(String regNumber, String fName, String lName, int nWheel){
//         System.out.println("Please input Number of doors")
//         engineSize = engineSize.nextLine();

//         super(regNumber, fName, lName, nWheel);
//     }




// }

// Public class Truck extends Vehicle {
//     Scanner load = new Scanner(System.in);
//     static int nWheel = 8;

//     public Motorcycle(String regNumber, String fName, String lName, int nWheel){
//         System.out.println("Please input maximum load in tonnes")
//         load = load.nextLine();

//         super(regNumber, fName, lName, nWheel);
//     }




// }
