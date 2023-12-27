
public class Factory {
	public Polygon createShape(int side) {
		if(side==5) {
			return new Fivegon();
		}else if (side==6) {
			return new Hexgon();
		}
		return null;
	}
}
