
public class CoinTester {


 public static void main(String[] args) {


   Coin myCoin = new Coin();


   Coin yourCoin = new Coin();


   Coin coinage = new Coin();



   System.out.println("My Coin = " + myCoin.toString());


   System.out.println("Your Coin = " + yourCoin.toString());

   int hCount = 0;
   int tCount = 0;


   for (int i = 0; i < 10; i++) {


     coinage.flip();


     if(coinage.isHeads()) {


       hCount++;


     }


     else {


       tCount++;


     }


   }


   System.out.println("Random Coin flip 10x:");

      System.out.println("Heads Count: " + hCount + "\nTails Count: " + tCount);
    }
   }
