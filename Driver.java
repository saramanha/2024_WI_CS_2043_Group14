import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver
 */
public class Driver {

    private static final String USER_FILENAME = "users.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userbase = loadUsers(); // file where user data is stored

        System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Register\n2. Login\n3. Exit\nEnter your choice:");
        int n = sc.nextInt();
        while (n != 3) {
            switch (n) {
                case 1: //create new user
                    sc.nextLine(); // consume the newline character
                    System.out.println("Enter your name:");
                    String name = sc.nextLine();

                    System.out.println("Enter your payment info:");
                    String paymentInfo = sc.nextLine();

                    System.out.println("Enter your password:");
                    String password = sc.nextLine();

                    System.out.println("Enter your mobile number:");
                    String mobile = sc.nextLine();

                    System.out.println("Enter your address:");
                    String address = sc.nextLine();

                    User newUser = new User(name, paymentInfo, password, mobile, address);

                    userbase.add(newUser); // add new user to the userbase
                    saveUsers(userbase); // save users to file
                    System.out.println("User registered successfully!");
                    break;
                case 2: //login existing user
                    User passenger = null;
                    sc.nextLine(); // consume the newline character
                    System.out.println("Enter your name:");
                    String name1 = sc.nextLine();

                    System.out.println("Enter your password:");
                    String password1 = sc.nextLine();

                    boolean found = false; //variable to see if a user is in the userbase or not 
                    for (User user : userbase) {
                        if (user.getName().equals(name1) && user.getPassword().equals(password1)) {
                            System.out.println("Login successful!");
                            passenger = user;
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Invalid credentials.");
                        break;
                    }

                    System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Book a flight\n2. Review Flight Details\n3. Exit\nEnter your choice:");
                    int choice = sc.nextInt();
                    
                    while (choice != 3) {
                        switch (choice) {
                            case 1://book a flight
                                System.out.println("Enter your desired flight details:");

                                sc.nextLine(); // consume the newline character
                                System.out.println("Enter desired country:");
                                String country = sc.nextLine();
            
                                System.out.println("Enter your budget:");
                                double cost = sc.nextDouble();
            
                                System.out.println("Enter your desired date of departure (MM/DD/YYYY):");
                                String[] date = sc.nextLine().split("/");
                                Date departureDate = new Date(date[0], date[1], date[2]);

                                Flight userFlight = new Flight(country, cost, "Flight", "", departureDate);
                                FlightBooking fb = new FlightBooking(passenger, userFlight);

    
                                break;
    
                            case 2://review flight details
                                System.out.println("Flight Details:");
                                passenger.getFlight().display();
    
                                break;
    
                            case 3://exit
                                System.out.println("Exiting...");
                                break;
                        
                            default: //invalid choice
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                        System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Book a flight\n2. Review Flight Details\n3. Exit\nEnter your choice:");
                        choice = sc.nextInt();
                    }

                    break;
                case 3:
                    sc.close();
                    System.exit(0);
                    break;
                default: //invalid choice
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
            System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Register\n2. Login\n3. Exit\nEnter your choice:");
            n = sc.nextInt();
            
        }
        sc.close();
    }

    private static ArrayList<User> loadUsers() { //load users from file
        ArrayList<User> users = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(USER_FILENAME))) {
            String line;

            //break the user data into parts and fill arraylist with the users 
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                String paymentInfo = parts[1];
                String password = parts[2];
                String mobile = parts[3];
                String address = parts[4];

                User user = new User(name, paymentInfo, password, mobile, address);
                users.add(user);
            }

        } catch (IOException e) {
            return new ArrayList<>();
        }
        return users;
    }

    private static void saveUsers(ArrayList<User> users) { //save users to file 
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILENAME))) {
            for (User user : users) {
                bw.write(user.getName() + "," + user.getpayment() + "," + user.getPassword() + "," + user.getMobile() + "," + user.getAddress());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
