//User Creation Spike

/**
 * UserSpike
 */
public class UserSpike {

    public static void main(String[] args) {
        User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");

        user.display();

        user.setName("Jane Doe");
        user.setpayment("9876543210");
        user.setPassword("newpassword");
        user.setMobile("0987654321");
        user.setAddress("456, Main Street");

        user.display();
    }
}