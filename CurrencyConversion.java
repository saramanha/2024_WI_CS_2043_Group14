public class CurrencyConversion{

  //inst. var.
  private double countryRate;
  private double flightCost; 

  //class method
  public CurrencyConversion(Country countryIn, Flight flightIn){
    countryRate = countryIn.getConver();
    flightCost = flightIn.getCost();
  }

  //other methods

  /**
  *  Grabs the flight's costs and converts it into the user's country rate.
  *  @return the converted flight cost.
  **/
  public double convert(){
    double convertedCost = flightCost * countryRate;
    return convertedCost;
  }

}
