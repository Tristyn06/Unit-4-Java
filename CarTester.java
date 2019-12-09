
public class CarTester {




 public static void main(String [] args) {




   Car car1 = new Car("Subaru", "Forester",25, 20);


   Car car2 = new Car("Jeep", "Wrangler", 12, 15);


   Car car3 = new Car("Nisson", "Rogue", 18, 21);




   System.out.println();




   car1.drive(50);


   car2.drive(200);


   car3.drive(150);


   car1.fillTank();

   car2.addGasAmt(10);
   car3.addGasAmt(.3);



   car1.canGo();
   car2.canGo();
   car3.canGo();



 }


}
