/**
 * Last Name: Zar
 * First Name: Ilan
 */
public class Circle implements Shape{
    /** circle radius */
    private double radius;
    private Shape perimeterlambda = ()->radius * 2 * Math.PI;
    /**
     * Constructor accepts an double for the radius, throws exception if data is not valid
     * @param radius A positive double representing the radius of the circle
     * @throws Exception 
     * */
   public Circle(double rad) throws Exception{
	   if(rad < 0){
		   throw new Exception("Radius Cannot Be Less Than Or Equal To Zero!");
	   }
	   else{
		   radius = rad;
	   }
   }
    /**
     * Getting the perimeter of the circle
     * @return a double indicating the perimeter of the shape
     * */
    public double getPerimeter() {
    	return perimeterlambda.getPerimeter();
    }
    /**
     * Returning a string of the variable in the circle
     * @return a String indicating the radius of the circle
     * */
    @Override
    public String toString(){
    	new Double(radius);
       return "Circle {" +
       		  "r=" + Double.toString(radius) + "}";
    }
    
    /**
     * Unique hashCode
     * @return a unique integer hashCode
     * */
    @Override
    public int hashCode(){
    	new Double(radius);
       int result = 31 * Double.hashCode(radius);
       return result;
    }
    /**
     * Equals function
     * @return a boolean indicating whether the circles are equal
     * */
    @Override
    public boolean equals(Object object){
      if(this == object) return true;
      if(!(object instanceof Circle)) return false;
      
      Circle rad = (Circle) object;
      
      if(!(rad.radius == radius)) return false;
      
      return true;
    }
    public String classtype(){
    	return "Circle";
    }
}
