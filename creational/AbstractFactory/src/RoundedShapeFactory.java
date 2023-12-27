
public class RoundedShapeFactory extends AbstractFactory {
  @Override()
  public Shape getShape(String shapeType) {
	  if(shapeType==null) {
		  return null;
	  } 
	  
	  if(shapeType.equalsIgnoreCase("ROUNDEDRECTANGLE")) {
		  return new RoundedRectangle();
	  }else if(shapeType.equalsIgnoreCase("ROUNDEDSQUARE")) {
		  return new RoundedSquare();
	  }else {
		  return null;
	  }
  }
}
