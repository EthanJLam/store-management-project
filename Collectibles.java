public class Collectibles{

  /*
 * Instance Variables
 */
  
private String name;
private double price;
private boolean isFictional;

/*
  * Constructor setting default values
  */
  
  public Collectibles (){
    name = "no name";
    price = 0.0;
    isFictional = false;
  }

/*
  * Parameterized Constructor setting order of variables
  */
  
public Collectibles (String name, double price, boolean isFictional){
  this.name = name;
  this.price = price;
  this.isFictional = isFictional;
}

/*
  * Accessor methods to get values
  * Mutator Methods to set values
  */
  
public String getName() {
  return name;
}

public double getPrice() {
  return price;
}

  public boolean getIsFictional() {
    return isFictional;
  }
  
public void setName(String name){
  this.name = name;
}
  
public void setPrice(double price){
  this.price = price;
}

  public void setIsFictional(boolean isFictional){
    this.isFictional = isFictional;
  }

/*
  * toString Method returns the name, price, and if it is fictional as well as sets the format when printed out.
  */
  
public String toString() {
  return ("\n Name: " + getName() + "\n Price: " + getPrice() + "\n Is it Fictional: " + getIsFictional());
}


  
}