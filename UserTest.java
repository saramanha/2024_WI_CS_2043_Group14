import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import junit.framework.Assert;

public class UserTest {
	@Test
	void changeUserNameTest() {
		User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");
		user.setName("Robert Doe");
		Assert.assertTrue(user.getName().equals("Robert Doe"));
	}
	
	void changePhoneTest() {
		User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");
		user.setMobile("506 123 4567");
		Assert.assertTrue(user.getMobile().equals("506 123 4567"));
	}
	
	void changePaymentTest() {
		User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");
		user.setpayment("1234 5678 9000");
		Assert.assertTrue(user.getpayment().equals("1234 5678 9000"));
	}
	
	void changePasswordTest() {
		User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");
		user.setPassword("newpassword");
		Assert.assertTrue(user.getPassword().equals("newpassword"));
	}
	
	void changeAddressTest() {
		User user = new User("John Doe", "0123456789", "password", "1234567890", "123, Main Street");
		user.setAddress("1223 Brunswick St");
		Assert.assertTrue(user.getAddress().equals("1223 Brunswick St"));
	}
}
