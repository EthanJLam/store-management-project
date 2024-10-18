public class Art extends Collectibles {

/*
  * Art is a sublclass and extends off of Collectibles
  */

/*
  * Instance variables for this class
  */
  
private String artType;
  private double lengthCm;
  private double widthCm;

  /*
  * Constructor setting default values
  */
  
  public Art () {
    artType = "Painting";
    lengthCm = 25.0;
    widthCm = 20.0;
  }
  
/*
  * Parameterized Constructor setting order of variables and uses the variables from the super class.
  */
  
public Art (String name, String artType, double price, double lengthCm, double widthCm, boolean isFictional) {
  super(name, price, isFictional);
  this.artType = artType;
  this.lengthCm = lengthCm;
  this.widthCm = widthCm;
}

/*
  * Accessor methods to get values
  * Mutator Methods to set values
  */
  
  public String getArtType (){
    return artType;
  }
public void setArtType(String artType){
  this.artType = artType;
}

  
  public double getLengthCm (){
    return lengthCm;
  }
public void setLengthCm(double lengthCm){
  this.lengthCm = lengthCm;
}

  
  public double getWidthCm (){
    return widthCm;
  }
public void setWidthCm(double widthCm){
  this.widthCm = widthCm;
}

/*
  * toString Method returns the same variables as the super class and the art type, length in cm, and width in cm 
  * also sets the format when printed out.
  */
  

public String toString() {
  return (super.toString() + "\n Art Type: " + getArtType() + "\n Length in Cm: " + getLengthCm() + "\n Width in Cm: " + getWidthCm());
}


  
}