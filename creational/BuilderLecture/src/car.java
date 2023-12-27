
public class car {
    
    private String eng;
    private String body;
    private String electrc;
    
    public car(String eng, String body, String electrc)
    {
       this.eng = eng;
       this.body = body;
       this.electrc = electrc;
    }
    public String toString()
    {
        return "Car : "+ eng +" + " + body +" + " + electrc;
    }
    public void showMessage() {
    	System.out.println("Hello, world");
    	}
    
}
