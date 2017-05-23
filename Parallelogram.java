/**
 * Last Name: Zar
 * First Name: Ilan
 */
public class Parallelogram implements Shape{
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
	public Parallelogram(double len, double wid) throws Exception{
		if(len < 0 || wid < 0){
			throw new Exception("Length And/Or Width Of Parallelogram Cannot Be Less Than Or Equal To Zero!");
		}
		else {
			length = len;
			width = wid; 
		}
	}
	public Parallelogram(double len, double wid, double hei) throws Exception{
		new Parallelogram(len, wid);
		if(hei < 0){
			System.out.println("Your attempts at breaking my program with a height of zero has been duly noted.\n");
		}
		if(len < 0 || wid < 0){
			throw new Exception("Length And/Or Width Of Parallelogram Cannot Be Less Than Or Equal To Zero!");
		}
		else {
			length = len;
			width = wid; 
		}
	}
	public String toString(){
		new Double(length);
		new Double(width);
		return "Parallelogram {" +
		  "w=" + Double.toString(width) + ", h=" + Double.toString(width) + "}";
	}
	
	public boolean equals(Object object){
	      if(this == object) return true;
	      if(!(object instanceof Parallelogram)) return false;
	      
	      Parallelogram prl = (Parallelogram) object;
	      
	      if(!(prl.length == length || prl.width == width)) return false;
	      
	      return true;
	    }
	public String classtype(){
    	return "Parallelogram";
    }
	
}

