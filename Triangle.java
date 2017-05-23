/**
 * Last Name: Zar
 * First Name: Ilan
 */
public class Triangle implements Shape{
	
	private double sideA, sideB, sideC;
    private Shape perimeterlambda = ()->sideA + sideB + sideC;
    /**
     * Constructor for Triangle. Accepts three doubles for sides A, B, C.
     */
	public Triangle(double a, double b, double c) throws Exception{
		   if(a < 0 || b < 0 || c < 0){
			   throw new Exception("Sides Of The Triangle Cannot Be Less Than Or Equal To Zero!");
		   }
		   else{
			   sideA = a;
			   sideB = b;
			   sideC = c;
		   }
	   }
    /**
     * Getting the perimeter of the triangle
     * @return a double indicating the perimeter of the shape
     * */
    public double getPerimeter() {
    	return perimeterlambda.getPerimeter();
    }
    /**
     * Returning a string of the variable in the triangle
     * @return a String indicating the sides of the triangle
     * */
    @Override
    public String toString(){
    	new Double(sideA);
    	new Double(sideB);
    	new Double(sideC);
    	return "Triangle {" +
		  "a=" + Double.toString(sideA) + ", b=" + Double.toString(sideB) + ", c=" + Double.toString(sideC) + "}";
    }
    
    /**
     * Unique hashCode
     * @return a unique integer hashCode
     * */
    @Override
    public int hashCode(){
    	double perimeter = getPerimeter();
    	new Double(perimeter);
       int result = 31 * Double.hashCode(perimeter);
       return result;
    }
    /**
     * Equals function
     * @return a boolean indicating whether the triangles are equal
     * */
    @Override
    public boolean equals(Object object){
      if(this == object) return true;
      if(!(object instanceof Triangle)) return false;
      
      Triangle tri = (Triangle) object;
      
      if(!(tri.sideA == sideA || tri.sideB == sideB || tri.sideC == sideC)) return false;
      
      return true;
    }
    public String classtype(){
    	return "Triangle";
    }
}
