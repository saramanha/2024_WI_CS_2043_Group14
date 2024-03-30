public class Flight {
	  
	  //inst. vars.
	  private Country country;      
	  private double cost;
	  private String flightName;
	  private String insurance;    //change to insurance object soon
	  private Date startDate;

	  //class method
	  public Flight(Country countryIn, double costIn, String nameIn, String insuranceIn, Date startIn){
	    country = countryIn;
	    cost = costIn;
	    flightName = nameIn;
	    insurance = insuranceIn;
	    startDate = startIn;

	  }

	  //get methods

	  /**
	  * This method returns the name of the country the flight is headed.
	  **/
	  public Country getDestination(){
	      return country;
	  }

	  /**
	  * This method returns the cost of the flight.
	  **/
	  public double getCost(){
	      return cost;
	  }

	  /**
	  * This method returns the name of the flight.
	  **/
	  public String getName(){
	      return flightName;
	  }

	  /**
	  * This method returns the flight insurance.
	  **/
	  public String getInsurance(){
	      return insurance;
	  }
	  
	  /**
	   * This method returns when the flight takes off.
	  **/
	  public Date getStartDate(){
		  return startDate;
	  }
	  
	  //set methods

	  /**
	  * This method sets the destination of the flight.
	  **/
	  public void setDestination(Country countryIn) {
		 country = countryIn;
	  }
	  
	  public void setCost(double costIn) {
		 cost = costIn;
	  }
	  
	  public void setName(String nameIn) {
		  flightName = nameIn;
	  }
	  
	  public void setInsurance(String insuranceIn) {
		  insurance = insuranceIn;
	  }
	  
	  public void setStartDate(Date startIn) {
		  startDate = startIn;
	  }
		  
	  
	  public void display() {
		  System.out.println("Flight Name: " + flightName);
		  System.out.println("Destination: " + country.getCountryName());
		  System.out.println("Cost: $" + cost);
		  System.out.println("Insurance: " + insurance);
		  System.out.println("Flight Takes off at: " + startDate.display());
	  }

}
