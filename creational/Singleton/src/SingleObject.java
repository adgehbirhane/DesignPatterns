
public class SingleObject {
	private static SingleObject instance = new SingleObject();
	private SingleObject() {}
	
	public static SingleObject getInstance () {
		return instance;
	} 
	public double minus(double a, double b) {
		return a-b;
	}
	
	public double product(double a, double b) {
		return a*b;
		
	}
	
	public void showMessage() {
		System.out.println("Hello world");
	}

	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a + b;
	}
	
}
