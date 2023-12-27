
public class Demo {

	public static void main(String[] args) { 
		Factory poly = new Factory();
		Polygon gon = poly.createShape(5);
		gon.getShape();
		
		Polygon gon1 = poly.createShape(6);
		gon1.getShape();
	}
}
	