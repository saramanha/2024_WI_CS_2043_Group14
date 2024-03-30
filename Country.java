public class Country{
  //This class represents a country/destination for each flight
  private String countryName; //name of the country
  private String currencyName; //type of currency
  private double conversion; //conversion rate
  private double temperature;

  public Country(String countryName, String currencyName, double conversion, double temperature){
	      this.countryName = countryName;
	      this.currencyName = currencyName;
	      this.conversion = conversion;
	      this.temperature = temperature;
	  }
	
	  // Get methods

   	   /**
	   * Provides information of the country's currency.
	   * @return The name of the country's currency.
	   */
	   public String getCurName(){
			      return currencyName;
		  }

	    /**
	    * Provides the information of the country's name.
	    * @return The name of the country.
	    */
	   public String getCountryName(){
			      return countryName;
		  }

	    /**
	    * Provides the conversion rate of the country to CAD.
	    * @return The conversion rate of the country to CAD.
	    */
	   public double getConver(){
			      return conversion;
		  }

	     /**
	    * Provides the current temperature at the country. (in Celsius)
	    * @return The temperature of the country. (in Celsius)
	    */
	   public double getTemp(){
			      return temperature;
		  }

	    /**
	    * Sets the country's currency name.
	    * @param newName - The new currency name for the country.
	    */
	   public void setCurName(String newName){
			      currencyName = newName;
		  }
	    /**
	    * Sets the country's conversion rate to CAD.
	    * @param newConver - The new conversion rate to CAD.
	    */
	   public void setConver(double newConver){
			      conversion = newConver;
		  }
		
	   /**
	    * Sets the country's new temperature. (in Celsius)
	    * @param newTemp - The new temperature.
	    */	
	   public void setTemp(double newTemp){
			      temperature = newTemp;
		  }
		
	    /**
	    * Prints out the Flight's information at the terminal.
     	    * @return  "Currency Name: currencyName
	  		Conversion Rate: conversion
     			Temperature: temperature"
	    */
	    public void display() {
	    			  System.out.println("Currency Name: " + currencyName);
	    			  System.out.println("Conversion Rate: " + conversion);
	    			  System.out.println("Temperature: " + temperature);
	    		  }
	
	
	
	  
}
