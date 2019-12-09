
public class DieTester {

public static void main(String[] args) {


Die d1 = new Die(6);


Die d2 = new Die(6);


d1.roll();


d2.roll();


System.out.println(d1.toString());


System.out.println(d2.toString());



int count;


int total = 0;


for (int i = 0; i < 100; i++) {


count = 0;


d1.setFace(1);


d2.setFace(2);


while (d1.getFace() != d2.getFace()){


d1.roll();


d2.roll();


System.out.println("d1 rolled a " + d1.getFace() + ".");


System.out.println("d2 rolled a " + d2.getFace() + ".");


System.out.println("the sum is " + (d1.getFace() + d2.getFace()) + ".");


count++;


}


total += count;


System.out.println("it took " + count + " rolls to roll a double.");

}

System.out.println("the avg number of rolls it took to roll a double was " + total/100 + ".");


}


}
