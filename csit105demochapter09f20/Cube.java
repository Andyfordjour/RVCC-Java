package csit105demochapter09f20;
/**                     
 * This class holds data about a cube.
 * 11/8/2014 - changed to inherit from square
 * @author Concept by:  Tony Gaddis (et al) modified by Stephen Brower
 */

public class Cube extends Square
{
   private double height;  // The height of the cube

   /**
    *  The constructor accepts the cube's length
       Note: width and height are same as length
     * @param len value to be used for length, width, height
    */

   public Cube(double len)
   {
      // Call the superclass constructor to
      // initialize length and width.
      super(len);

      // Initialize height.
      height = len;
   }

   /**
    *  The setHeight method sets the height
    *  field
       @param h The value to store in height.
    */

   public void setHeight(double h)
   {
      height = h;
   }


   /**
    *  The getHeight method returns the height
    *  field.
       @return The value in the height field.
    */

   public double getHeight()
   {
      return height;
   }

   /**
    *  The getSurfaceArea method returns the
    *  cube's surface area.
       @return The product of area * 6 for 6 sides
    */

   public double getSurfaceArea()
   {
      return getArea() * 6;
   }

   /**
    *  The getVolume method returns the volume of
       @return The product of area * width.
   */

   public double getVolume()
   {
      return getArea() * height;
   }

   /**
        toString method returns a text representation of this Square
        overrides toString() in Rectangle
        @return String representing this square
   */
   @Override
   public String toString()
   {
       return "Cube L/W/H: " + getLength();
   }

}