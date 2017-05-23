/**
 * Last Name: Zar
 * First Name: Ilan
 */
public class Rectangle implements Shape{
	
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
	public Rectangle(double len, double wid) throws Exception{
		if(len < 0 || wid < 0){
			throw new Exception("Length And/Or Width Of Rectangle Cannot Be Less Than Or Equal To Zero!");
		}
		else {
			length = len;
			width = wid;
		}
	}
	public String toString(){
		new Double(length);
		new Double(width);
		return "Rectangle {" +
		  "w=" + Double.toString(width) + ", h=" + Double.toString(width) + "}";
	}
	
	public boolean equals(Object object){
	      if(this == object) return true;
	      if(!(object instanceof Rectangle)) return false;
	      
	      Rectangle rct = (Rectangle) object;
	      
	      if(!(rct.length == length || rct.width == width)) return false;
	      
	      return true;
	    }
	public String classtype(){
    	return "Rectangle";
    }
	
}

