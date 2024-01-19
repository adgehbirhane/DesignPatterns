package BeforeRefactoring;

public class Customer {
    private String name;
    private String address;
    private String city;
    private String state;
    private String zipCode;

    public Customer(String name, String address, String city, String state, String zipCode) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
}
