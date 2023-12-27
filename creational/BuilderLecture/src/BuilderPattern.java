
public class BuilderPattern {

    public static void main(String[] args) {
        // TODO code application logic here
        
        car buildedCar = new BuildCar()
        		.getBody("spokiye")
        		.getElec("candela")
                .getEng("cyclinder")
                .build();
        System.out.println(buildedCar);
        buildedCar.showMessage();
    }
    
}
