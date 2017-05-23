/**
 * Last Name: Zar
 * First Name: Ilan
 */
import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.DecimalFormat;
public class Main {
	public static void main(String[] args) {
		DecimalFormat numberFormat = new DecimalFormat("#.00");
		System.out.println("------->JAC 444 Assignment 1 by Ilan Zar <-------");
		System.out.println("Exceptions Thrown!");
		List<Shape> shapelist = buildShapesFromFile("Shapes.txt");
		System.out.println("------->Task 1 ... <-------");
		for(int i = 0; i < shapelist.size(); i++){
			System.out.println(shapelist.get(i).toString() + " " + numberFormat.format(shapelist.get(i).getPerimeter()));
		}
		System.out.println("------->Task 2 ... <-------");
		double min = Double.MAX_VALUE;
		double max = Double.MIN_VALUE;
		for(int i = 0; i < shapelist.size(); i++){
			if(shapelist.get(i).getPerimeter() < min && shapelist.get(i) instanceof Triangle)
				min = shapelist.get(i).getPerimeter();
		}
		for(int i = 0; i < shapelist.size(); i++){
			if(shapelist.get(i).getPerimeter() > max && shapelist.get(i) instanceof Circle)
				max = shapelist.get(i).getPerimeter();
		}
		for(Iterator<Shape> iter = shapelist.iterator(); iter.hasNext();){
			Shape element = iter.next();
			if(element.getPerimeter() == min && element instanceof Triangle){
				iter.remove();
			}
		}
		for(Iterator<Shape> iter = shapelist.iterator(); iter.hasNext();){
			Shape element = iter.next();
			if(element.getPerimeter() == max && element instanceof Circle){
				iter.remove();
			}
		}
		for(int i = 0; i < shapelist.size(); i++){
			System.out.println( shapelist.get(i).toString() + " " + numberFormat.format(shapelist.get(i).getPerimeter()));
		}
		
		System.out.println("------->Task 3 ... <-------");
		double pperimeters = 0;
		double tperimeters = 0;
		for(int i = 0; i < shapelist.size(); i++){
			if(shapelist.get(i) instanceof Triangle){
				tperimeters += shapelist.get(i).getPerimeter();
			}
			if(shapelist.get(i) instanceof Parallelogram){
				pperimeters += shapelist.get(i).getPerimeter();
			}
		}
		System.out.println("Exact Total of Parallelogram Perimeters: " + pperimeters);
		System.out.println("Exact Total of Triangle Perimeters: " + tperimeters);
		System.out.println("Rounded Total of Parallelogram Perimeters: " + numberFormat.format(pperimeters));
		System.out.println("Rounded Total of Triangle Perimeters: " + numberFormat.format(tperimeters));
		System.out.println("------->Task 4 ... <-------");
		
		Collections.sort(shapelist, new SortComparator());
		for(int i = 0; i < shapelist.size(); i++){
			System.out.println( shapelist.get(i).toString() + " " + numberFormat.format(shapelist.get(i).getPerimeter()));
		}
	}
	public static List<Shape> buildShapesFromFile(String fileName) {
		List<Shape> shapelist = new ArrayList<Shape>();
		String path = System.getProperty("user.dir");
		Shape sp = null;
		String s;
		try (BufferedReader br = new BufferedReader(new FileReader("./Root/" + fileName))) {
			// if you run locally on your environment use: new FileReader(path + "/src/" + fileName)
			while ((s = br.readLine()) != null) {
				String[] tok = s.split(",");
				if(tok.length == 2){
					if(tok[0].equals("Circle")) {
						try{
							Double parafirst = new Double(tok[1]);
							sp = new Circle(parafirst);
							shapelist.add(sp);
						}
						catch (Exception e){
							System.out.println(e.getMessage());
						}
					}
					if(tok[0].equals("Square")){
						try{
							Double parafirst = new Double(tok[1]);
							sp = new Square(parafirst);
							shapelist.add(sp);
						}
						catch (Exception e){
							System.out.println(e.getMessage());
						}
					}
				}
				if(tok.length == 3){
					if(tok[0].equals("Rectangle")){
						try{
							Double parafirst = new Double(tok[1]);
							Double parasecond = new Double(tok[2]);
							sp = new Rectangle(parafirst, parasecond);
							shapelist.add(sp);
						}
						catch (Exception e){
							System.out.println(e.getMessage());
						}
					}
					if(tok[0].equals("Parallelogram")){
						try{
							Double parafirst = new Double(tok[1]);
							Double parasecond = new Double(tok[2]);
							sp = new Parallelogram(parafirst, parasecond);
							shapelist.add(sp);
						}
						catch (Exception e){
							System.out.println(e.getMessage());
						}
					}
				}
				if(tok.length == 4){
					if(tok[0].equals("Triangle")){
						try{
							Double parafirst = new Double(tok[1]);
							Double parasecond = new Double(tok[2]);
							Double parathird = new Double(tok[3]);
							sp = new Triangle(parafirst, parasecond, parathird);
							shapelist.add(sp);
						}
						catch (Exception e){
							System.out.println(e.getMessage());
						}
					}
				}
				//check the shape type and call the shape ctr.
			}
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		return shapelist;
	}
}
