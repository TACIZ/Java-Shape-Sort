/**
 * Last Name: Zar
 * First Name: Ilan
 */
import java.util.Comparator;
public class SortComparator implements Comparator<Shape>{
	@Override
	public int compare(Shape obj1, Shape obj2) {
		if(obj1 instanceof Circle || obj2 instanceof Circle){
			if(obj1 instanceof Circle && obj2 instanceof Circle){
				return compare(obj1.getPerimeter(), obj2.getPerimeter());					
			}
			if(obj1 instanceof Circle){
				return -1;
			}
			if(obj2 instanceof Circle){
				return 1;
			}
		}
		if(obj1 instanceof Parallelogram || obj2 instanceof Parallelogram){
			if(obj1 instanceof Parallelogram && obj2 instanceof Parallelogram){
				return compare(obj1.getPerimeter(), obj2.getPerimeter());						
			}
			if(obj1 instanceof Parallelogram){
				return -1;
			}
			if(obj2 instanceof Parallelogram){
				return 1;
			}
		}
		if(obj1 instanceof Rectangle || obj2 instanceof Rectangle){
			if(obj1 instanceof Rectangle && obj2 instanceof Rectangle){
				return compare(obj1.getPerimeter(), obj2.getPerimeter());						
			}
			if(obj1 instanceof Rectangle){
				return -1;
			}
			if(obj2 instanceof Rectangle){
				return 1;
			}
		}
		if(obj1 instanceof Square || obj2 instanceof Square){
			if(obj1 instanceof Square && obj2 instanceof Square){
				return compare(obj1.getPerimeter(), obj2.getPerimeter());			
			}
			if(obj1 instanceof Square){
				return -1;
			}
			if(obj2 instanceof Square){
				return 1;
			}
		}
		if(obj1 instanceof Triangle || obj2 instanceof Triangle){
			if(obj1 instanceof Triangle && obj2 instanceof Triangle){
				return compare(obj1.getPerimeter(), obj2.getPerimeter());					
			}
			if(obj1 instanceof Triangle){
				return -1;
			}
			if(obj2 instanceof Triangle){
				return 1;
			}
		}
		return 0;
	}
	public int compare(double x, double y){
		return x < y? -1
			: x > y? 1
			: 0;
	}
}

