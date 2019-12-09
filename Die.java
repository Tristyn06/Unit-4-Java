
public class Die {

  private int face;


  private int sides;


  public Die(int numSides) {


   sides = numSides;


  }


  public int getFace() {


	return face;


  }


  public void setFace(int New) {


	face = New;


  }


  public void roll() {


	face = (int)(Math.random() * sides + 1);


  }

    public String toString() {


  	return "You rolled a " + face;


    }


  }
