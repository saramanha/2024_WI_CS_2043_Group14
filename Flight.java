public class Flight {
	  
	  //inst. vars.
	  private Country country;      
	  private double cost;
	  private String flightName;
	  private String insurance;    //change to insurance object soon
	  private Date startDate;
	  private WeatherInformation weather;

	  //constructor
	  public Flight(Country countryIn, double costIn, String nameIn, String insuranceIn, Date startIn){
	    country = countryIn;
	    cost = costIn;
	    flightName = nameIn;
	    insurance = insuranceIn;
	    startDate = startIn;
	    this.weather = null;
	  }

	  //get methods

	  /**
	  * This method returns the name of the country the flight is headed.
   	  * @return the flight's destination.
	  **/
	  public Country getDestination(){
	      return country;
	  }

	  /**
	  * This method returns the cost of the flight.
   	  * @return the flight costs.
	  **/
	  public double getCost(){
	      return cost;
	  }

	  /**
	  * This method returns the name of the flight.
   	  * @return The flight's name.
	  **/
	  public String getName(){
	      return flightName;
	  }

	  /**
	  * This method returns the flight insurance.
   	  * @return the flight insurance.
	  **/
	  public String getInsurance(){
	      return insurance;
	  }
	  
	  /**
	   * This method returns when the flight takes off.
    	   * @return the flight's start date.
	  **/
	  public Date getStartDate(){
		  return startDate;
	  }

	  /**
   	   * This method returns the current weathor conditions of the flight's destination.
       	   * @return the weather at the flight's destination.
       	  **/
	  public WeatherInformation getWeather() {
		  return weather;
	  }
	  
	  //set methods

	  /**
	  * This method sets the destination of the flight.
   	  * @param the country destination.
	  **/
	  public void setDestination(Country countryIn) {
		 country = countryIn;
	  }

	  /**
	  * This method sets cost of the flight.
   	  * @param the new flight cost.
	  **/
	  public void setCost(double costIn) {
		 cost = costIn;
	  }

	  /**
	  * This method sets the name of the flight.
   	  * @param the flight's name.
	  **/
	  public void setName(String nameIn) {
		  flightName = nameIn;
	  }

	  /**
	  * This method sets insurance of the flight.
   	  * @param the flight insurance.
	  **/
	  public void setInsurance(String insuranceIn) {
		  insurance = insuranceIn;
	  }

	  /**
	  * This method sets when the flight takes off.
   	  * @param the start date of the flight.
	  **/
	  public void setStartDate(Date startIn) {
		  startDate = startIn;
	  }

	  /**
	  * This method sets the current weather of the flight's destination.
   	  * @param the flight destination's weather.
	  **/
	  public void setWeather(WeatherInformation weather) {
		  this.weather = weather;
	  }
		  
	  /**
	  * This method displays all of the flight's information out to the terminal. (toString() method)
   	  * @return	"Flight Name: flightName
      	  *		 Destination: destination
	  *		 Cost: $cost
      	  *		 Insurance: insurance
	  *		 Flight takes off at: startDate"
	  **/
	  public void display() {
		  System.out.println("Flight Name: " + flightName);
		  System.out.println("Destination: " + country.getCountryName());
		  System.out.println("Cost: $" + cost);
		  System.out.println("Insurance: " + insurance);
		  System.out.println("Flight Takes off at: " + startDate.display());
	  }

}
