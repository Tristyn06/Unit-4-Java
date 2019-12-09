
public class Coin {

private int face;
private final int HEADS = 0; // Constants defining heads and tails.
private final int TAILS = 1;


/*
The Coin constructor
*/

public Coin() {


flip();


}

/*
 The methods of a Coin.
*/

//The accessor method

public int getFace(){


return face;


}

public void setFace(int newFace){


face = newFace;


}

public void flip() {


face = (int) (Math.random() * 2);


}


public boolean isHeads() {


return (face == 0);


}

public String toString() {


String result = "";


if (face == HEADS) {


result = "HEADS";


}


else {


result = "TAILS";


}


return result;


}






}
