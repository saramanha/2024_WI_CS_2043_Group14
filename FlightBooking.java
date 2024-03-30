import java.util.ArrayList;
import java.util.Scanner;

public class FlightBooking {

   // Instance variables
 private User passenger;          // Changed to User object when added to main
 private Flight userFlight;       // Flight input by the User
 private ArrayList<Flight> allFlights; // List of all the flights in the system
 private ArrayList<Flight> bestFlights; // List of best flights for the User

    // Constructor
  public FlightBooking(User passengerIn, Flight flightIn, ArrayList<Flight> allFlightsIn) {
        passenger = passengerIn;
        userFlight = flightIn;
        allFlights = allFlightsIn;
        bestFlights = new ArrayList<Flight>();
    }

  //other methods
  /**
  *  Checks the Flights database compares what the User wants for the flight.
  *  @return An array of flights that match what the user is searching for.
  **/
   public ArrayList<Flight> findBestFlights() {
        for (Flight flight : allFlights) { //loop through all the flights
            int matches = 0; // Used to count how many matches we have so far with the User's request

            if (flight.getDestination().equals(userFlight.getDestination())) {
                matches++; // Add a match if we have the same destination as the User's order
            }

            double cost = userFlight.getCost();
            if (cost * 0.75 <= flight.getCost() && flight.getCost() <= cost * 1.25) {
                matches++; // Add a match if the cost of the flight is between 75% and 125% of the User's order
            }

            if (flight.getStartDate().toDays() - userFlight.getStartDate().toDays() <= 7 && flight.getStartDate().toDays() - userFlight.getStartDate().toDays() >= -7){
                matches++; // Add a match if the travel dates are within 7 days of the User's order
            }

            if (matches > 0) {
                bestFlights.add(flight); // Add the flight to the list of best flights if it has a match
            }
        }

  

        return bestFlights;
    }

  
  /**
  *  Allows the User to choose from a list of selected flights, and sets their flight to it
  *  @param pass - the User who is booking the flight
  *  @param arr - The Flight array list to show all Flights in the database.
  **/
  public void bookFlight(User pass, Flight[] arr){
      if(arr.length > 0){
      System.out.println("We recommend these flight based on your search:");
      printFlights(arr); //print the selection
      System.out.println("Please enter the flight you want to book:");
      Scanner scanner = new Scanner(System.in); //scan for input
      int choice = scanner.nextInt();
      if (choice >= 0 && choice < arr.length) { //make sure input is in the selection
          System.out.println("You have chosen to book " + arr[choice].getName());
          pass.setFlight(arr[choice]);
      } 

      else {
            System.out.println("Please enter a valid flight number");
        }
      }

     else{
         System.out.println("No flights matching your description are available at the moment");
    } 
    }

   /**
   * Prints out the Flights database set in an Flights array
   * @param arr The array of Flights from the database.
   */
  public void printFlights(Flight[] arr){
      for(int i = 0; i < arr.length; i++){
          System.out.println("Flight " + i + ": " + arr[i].getName() + " to " + arr[i].getDestination());
        }
    }

}
