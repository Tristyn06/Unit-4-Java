
public class Car {


 private String make;
 private String model;
 private double mileage;
 private double tankCapacity;
 private double fuelAmt;
 private double distP;


public Car(String newMake, String newModel, double newMileage, double newTankCap) {


  make = newMake;
   model = newModel;
   mileage = newMileage;
   tankCapacity = newTankCap;
   fuelAmt = tankCapacity;
   distP = fuelAmt * mileage;


 }


 public void fillTank() {


   fuelAmt = tankCapacity;


   System.out.println(make + " " + model + " tank is now full.\n");


 }







 public void addGasAmt(double newFuelAmt) {


   if ((fuelAmt + newFuelAmt) >= tankCapacity){


     fuelAmt = tankCapacity;


     System.out.println(make + " " + model + " tank is now full.\n");


   }


   else {


     fuelAmt = fuelAmt + newFuelAmt;


     System.out.println(make + " " + model + " has: " + fuelAmt + " gallons left.\n");


   }


 }







 public void canGo() {


   distP = fuelAmt * mileage;


   System.out.println(make + " " + model + " can drive " + distP + " before it runs out of gas.\n");


 }







 public void drive(double distance) {


   if (distP <= distance) {


     System.out.println(make + " " + model + " drove " + distP + " miles before it ran out of gas.");


     fuelAmt = 0;


     distP = 0;


     System.out.println("Fuel Left: " + fuelAmt + " gallons.\n");


   }


   else {


     System.out.println(make + " " + model + " drove " + distance + " miles.");


     fuelAmt = fuelAmt - (distance / mileage);


     distP = fuelAmt * mileage;


     System.out.println("Fuel Left: " + fuelAmt + " gallons.\n");


   }


 }







}
