//User.java 

/**
 * User
 */
public class User {

    private String name;
    private String paymentInfo;
    private String password;
    private String mobile;
    private String address;
    private Flight flight;

    public User(String name, String paymentInfo, String password, String mobile, String address) {
        this.name = name;
        this.paymentInfo = paymentInfo;
        this.password = password;
        this.mobile = mobile;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getpayment() {
        return paymentInfo;
    }

    public String getPassword() {
        return password;
    }

    public String getMobile() {
        return mobile;
    }

    public String getAddress() {
        return address;
    }

    public Flight getFlight() {
        return flight;
    }

    public void bookFlight(Flight flight) { 
        this.flight = flight; 
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setpayment(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Payment Info: " + paymentInfo);
        System.out.println("Password: " + password);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + address);
    }
}