public class Figurines extends Collectibles {
  
/*
  * Art is a sublclass and extends off of Collectibles
  */

/*
  * Instance variables for this class
  */
  
private String genre;
  private boolean isBobblehead;
  private boolean isRare;

  /*
  * Constructor setting default values
  */
  
  public Figurines () {
    genre = "No genre";
    isBobblehead = false;
    isRare = false;
  }

/*
  * Parameterized Constructor setting order of variables and uses the variables from the super class.
  */
  
public Figurines (String name, boolean isBobblehead, double price, String genre, boolean isFictional, boolean isRare) {
  super(name, price, isFictional);
  this.genre = genre;
  this.isBobblehead = isBobblehead;
  this.isRare = isRare;
}

/*
  * Accessor methods to get values
  * Mutator Methods to set values
  */
  
  public String getGenre (){
    return genre;
  }

public void setGenre(String genre){
  this.genre = genre;
}

  public boolean getIsBobblehead (){
    return isBobblehead;
  }

  public void setIsBobblehead (){
    this.isBobblehead = isBobblehead;
  }

  public boolean getIsRare (){
    return isRare;
  }

  public void setIsRare (){
    this.isRare = isRare;
  }

  
/*
  * toString Method returns the same variables as the super class and if it is a bobblehead, its genre, and if it is rare.
  * also sets the format when printed out.
  */
  
public String toString() {
  return (super.toString() + "\n Is it a Bobblehead?: " + getIsBobblehead() + "\n Genre: " + getGenre() + "\n Is it Rare?: " + getIsRare());
}


  
}