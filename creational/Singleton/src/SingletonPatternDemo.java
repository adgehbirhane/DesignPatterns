
public class SingletonPatternDemo {
	public static void main(String[] args) {
		SingleObject object = SingleObject.getInstance();
		object.showMessage();
		System.out.print(object.add(43.34, 34.40));
	}
}
