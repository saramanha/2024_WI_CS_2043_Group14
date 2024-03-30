public class Insurance {

	//inst. var.
	private String insuranceLevel;
	private double insuranceCost;
	
	//constructor
	public Insurance(String insuranceIn, double costIn) {
		insuranceLevel = insuranceIn;
		insuranceCost = costIn;
	}
	
	//other methods
	
	/**
	 * Returns the insurance level.
	 * @return Insurance level.
	 */
	public String getLevel() {
		return insuranceLevel;
	}
	
	/**
	 * Returns the insurance cost.
	 * @return Insurance cost.
	 */
	public double getCost() {
		return insuranceCost;
	}
	
	/**
	 * Sets the insurance level.
	 * @param New insurance level.
	 */
	public void setLevel(String levelIn) {
		insuranceLevel = levelIn;
	}
	
	/**
	 * Sets the insurance cost.
	 * @param New insurance cost.
	 */
	public void setCost(double costIn) {
		insuranceCost = costIn;
	}
	
	/**
	 * Displays the insurance information out to the terminal. (toString() method)
	 * @return "Insurance Level: insuranceLevel
	 * 			Cost: insuranceCost"
	 */
	public void display() {
		System.out.println("Insurance Level: ", insuranceLevel);
		System.out.println("Cost: ", insuranceCost);
	}
}
