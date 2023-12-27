
public class BuildCar {
	
    private String eng;
    private String body;
    private String electrc;
    
    public BuildCar getEng(String eng)
    {
        this.eng = eng;
        return this;
    }
    public BuildCar getBody(String body)
    {
        this.body = body;
        return this;
    }
    public BuildCar getElec(String electrc)
    {
        this.electrc = electrc;
        return this;
    }
    public car build()
    {
        return new car(eng, body, electrc);
    }
}
