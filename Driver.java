import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Driver
 */
public class Driver {

    private static final String USER_FILENAME = "users.txt";
    private static final String FLIGHT_FILENAME = "flights.txt";
    private static final String COUNTRY_FILENAME = "countries.txt";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<User> userbase = loadUsers(); // file where user data is stored
        ArrayList<Country> countries = loadCountries(); // file where country data is stored
        ArrayList<Flight> totalflights = loadFlights();

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

                    System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Book a flight\n2. Review Flight Details\n3. Currency Converter\n4. Weather Report\n5. Exit\nEnter your choice:");
                    int choice = sc.nextInt();
                    
                    while (choice != 5) {
                        switch (choice) {
                            case 1://book a flight
                                System.out.println("Enter your desired flight details:");

                                sc.nextLine(); // consume the newline character
                                System.out.println("Enter desired country:");
                                String country = sc.nextLine();
                                Country userCountry = null;

                                for (Country countryCheck : countries) {
                                    if (countryCheck.getCountryName().equals(country)) {
                                        userCountry = countryCheck;

                                        System.out.println("Enter your budget:");
                                        double cost = sc.nextDouble();
                                        sc.nextLine(); // consume the newline character
                    
                                        System.out.println("Enter your desired date of departure (MM/DD/YYYY):");
                                        String[] date = sc.nextLine().split("/");
                                        Date departureDate = new Date(Integer.parseInt(date[2]), Integer.parseInt(date[0]), Integer.parseInt(date[1]));


                                        Flight userFlight = new Flight(userCountry, cost, "Flight", null, departureDate);
                                        FlightBooking fb = new FlightBooking(passenger, userFlight, totalflights);

                                        ArrayList<Flight> flights = fb.findBestFlights();

                                        fb.bookFlight(passenger, flights.toArray(new Flight[flights.size()]));
                                        break;
                                    }

                                    
                                }

                                if (userCountry == null) {
                                    System.out.println("Country not found. Please try again.");
                                }
    
                                break;
                            
    
                            case 2://review flight details
                                if (passenger.getFlight() != null) {
                                    System.out.println("Your flight details:");
                                    passenger.getFlight().display();
                                } else {
                                    System.out.println("You have not booked a flight yet.");
                                }
    
                                break;
    
                            case 3://currency converter
                                if (passenger.getFlight() == null) {
                                    System.out.println("You have not booked a flight yet.");
                                    break;
                                    
                                }
                                else{
                                    sc.nextLine(); // consume the newline character
                                    System.out.println("Currency Converter (USD to another currency)");

                                    CurrencyConversion converter = new CurrencyConversion(passenger.getFlight().getDestination(), passenger.getFlight());
                                    double convertedAmount = converter.convert();
                                    System.out.println("The cost of the flight in " + passenger.getFlight().getDestination().getCurName() + " is " + convertedAmount + " " + passenger.getFlight().getDestination().getCurName() + ".");

                                break;
                            }

                            //WEATHER TRACKER NOT IMPLEMENTED YET WAITING ON KAILE
                            case 4://weather Tracker
                                if (passenger.getFlight() != null) {
                                    //String output = passenger.getFlight().getWeather();
                                    //System.out.println(output);
                                }
                                else {
                                    System.out.println("You have not booked a flight yet.");
                                }
                                break;

                            case 5://exit
                                System.out.println("Exiting...");
                                break;
                        
                            default: //invalid choice
                                System.out.println("Invalid choice. Please try again.");
                                break;
                        }
                        System.out.println("Flight Booking System\nWhat action are you looking for?\n1. Book a flight\n2. Review Flight Details\n3. Currency Converter\n4. Weather Report\n5. Exit\nEnter your choice:");
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

    public static ArrayList<Flight> loadFlights() {
        ArrayList<Flight> flights = new ArrayList<>();
        ArrayList<Country> countries = loadCountries();
    
        try (BufferedReader br = new BufferedReader(new FileReader(FLIGHT_FILENAME))) {
            String line;
    
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                if (parts.length == 4) {
                    String countryName = parts[0];
                    double cost = Double.parseDouble(parts[1]);
                    String name = parts[2];
                    Date startDate = parseDate(parts[3]);

                    for (Country country : countries) {
                        if (country.getCountryName().equals(countryName)) {
                            Flight flight = new Flight(country, cost, name, null, startDate);
                            flights.add(flight);
                        }
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
            return flights;
    }

    private static Date parseDate(String dateStr) {
        String[] dateParts = dateStr.split("/");
        int year = Integer.parseInt(dateParts[0]);
        int month = Integer.parseInt(dateParts[1]);
        int day = Integer.parseInt(dateParts[2]);
        return new Date(year, month, day);
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
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(USER_FILENAME, false))) {
            for (User user : users) {
                bw.write(user.getName() + "," + user.getpayment() + "," + user.getPassword() + "," + user.getMobile() + "," + user.getAddress());
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static ArrayList<Country> loadCountries() { //load countries from file
        ArrayList<Country> countries = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(COUNTRY_FILENAME))) {
            String line;

            //break the country data into parts and fill arraylist with the countries 
            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                String countryName = parts[0];
                String currencyName = parts[1];
                double conversion = Double.parseDouble(parts[2]);
                double temperature = Double.parseDouble(parts[3]);

                Country country = new Country(countryName, currencyName, conversion, temperature);
                countries.add(country);
            }

        } catch (IOException e) {
            return new ArrayList<>();
        }
        return countries;
    }
}
