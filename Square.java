/**
 * Last Name: Zar
 * First Name: Ilan
 */
public class Square implements Shape{
	public double length, width;
	private Shape perimeterlambda = ()->(length*2) + (width*2);
	public double getPerimeter(){
		return perimeterlambda.getPerimeter();
	}
	//public abstract String toString();
	public int hashCode(){
		double perimeter = getPerimeter();
		new Double(perimeter);
		int result = 31 * Double.hashCode(perimeter);
		return result;
	}
	public Square(double len) throws Exception{
		if(len < 0){
			throw new Exception("Length Of Square Cannot Be Less Than Or Equal To Zero!");
		}
		else {
			length = len;
			width = len;
		}
	}
	public String toString(){
		new Double(length);
		return "Square {" +
 		  "w=" + Double.toString(width) + ", h=" + Double.toString(width) + "}";
	}
	public boolean equals(Object object){
	      if(this == object) return true;
	      if(!(object instanceof Square)) return false;
	      
	      Square sqr = (Square) object;
	      
	      if(!(sqr.length == length)) return false;
	      
	      return true;
	    }
	public String classtype(){
    	return "Square";
    }
}

