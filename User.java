//User.java 

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

    /**
     * Provides the user's name.
     * @return The name of the user.
     */
    public String getName() {
        return name;
    }

    /**
     * Provides the user's payment information.
     * @return The user's payment information.
     */
    public String getpayment() {
        return paymentInfo;
    }

    /**
     * Provides the user's password credentials.
     * @return The user's password.
     */
    public String getPassword() {
        return password;
    }

    /**
     * Provides the user's mobile number.
     * @return The user's phone number.
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * Provides the user's address.
     * @return The user's address.
     */
    public String getAddress() {
        return address;
    }

    /**
     * Provides the flight that the user has booked. (if any)
     * @return The flight that the user booked. (if any)
     */
    public Flight getFlight() {
        return flight;
    }

    /**
     * Sets the flight that the user has booked.
     * @param flight - Flight that user booked.
     */
    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    /**
     * Sets the user's name.
     * @param name - The name of the user.
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Sets the user's payment information.
     * @param paymentInfo - User's payment information.
     */
    public void setpayment(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    /**
     * Sets the user's password.
     * @param password - The user's password.
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * Sets the user's mobile information.
     * @param mobile - User's mobile number.
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * Sets the user's address.
     * @param address - The user's address.
     */
    public void setAddress(String address) {
        this.address = address;
    }
    
    /**
     * Prints out all of the user's information out in the terminal. (toString() method)
     * @return  "Name: name
                 Payment Info: paymentInfo
                 Password: password
                 Mobile: mobile
                 Address: address"
     */
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Payment Info: " + paymentInfo);
        System.out.println("Password: " + password);
        System.out.println("Mobile: " + mobile);
        System.out.println("Address: " + address);
    }
}
