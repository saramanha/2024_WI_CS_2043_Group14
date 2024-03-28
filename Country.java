public class Country{
  private String countryName;
  private String currencyName;
  private double conversion;
  //private weatherIntegration weather
  private double temperature;

  public Country(String countryName, String currencyName, double conversion, double temperature){
	  this.countryName = countryName;
      this.currencyName = currencyName;
      this.conversion = conversion;
      this.temperature = temperature;
  }

  // Get methods

   public String getCurName(){
		      return currencyName;
	  }

	public String getCountryName(){
		      return countryName;
	  }

   public double getConver(){
		      return conversion;
	  }

   //public String getWeather(){
	//	      return weather;
	//  }

   public double getTemp(){
		      return temperature;
	  }

   public void setCurName(String newName){
		      currencyName = newName;
	  }

   public void setConver(double newConver){
		      conversion = newConver;
	  }

   //public void setWeather(weatherIntegration newWeather){
	//	      weather = newWeather;
	 // }

   public void setTemp(double newTemp){
		      temperature = newTemp;
	  }

    public void display() {
    			  System.out.println("Currency Name: " + currencyName);
    			  System.out.println("Conversion Rate: " + conversion);
    			  System.out.println("Weather: " + "weather");
    			  System.out.println("Temperature: " + temperature);
    		  }



  
}
