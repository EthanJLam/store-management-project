import java.util.Scanner;

public class StoreRunner {
  public static void main(String[] args) {

  /*
   * Defines collectibles to default and new values
   * Prints out item1 and item2
   */

Collectibles item1 = new Collectibles();

System.out.println(item1);
    
Collectibles item2 = new Collectibles("Mookie Betts Signed Baseball Hat", 600.00, false);

System.out.println(item2);

/*
 * Defines Art to default and new values
 * Prints out artifact1 and artifact2
 */
    
  Art artifact1 = new Art();
    
    System.out.println(artifact1);
    
    Art artifact2 = new Art ("Naruto Poster", "Poster", 19.99, 24.00, 18.00, true);

 System.out.println(artifact2);

 /*
  * Defines Figurines to default and new values
  * Prints out object1 and object2
  */
    
Figurines object1 = new Figurines();

System.out.println(object1);

Figurines object2 = new Figurines("Darth Vader Exclusive Edition Bobblehead", true, 99.99, "Star Wars", true, true);

System.out.println(object2);



    
  }
}