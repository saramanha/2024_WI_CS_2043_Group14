public class Date {
	
	//inst. var.
	private int year;
	private int month;
	private int day;
	
	//class method
	public Date(int yearIn, int monthIn, int dayIn) {
		year = yearIn;
		month = monthIn;
		day = dayIn;
	}
	
	//other methods

	public int getYear() {
		return year;
	}
	
	public int geMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}

	public void setYear(int yearIn) {
		year = yearIn;
	}
	
	public void setMonth(int monthIn) {
		month = monthIn;
	}
	
	public void setDay(int dayIn) {
		day = dayIn;
	}
	
	/**
	 * this method returns a int that shows month and day
	 * @return year/month/day
	 */
	public String display() {
		return year + "/" +  month + "/" + day;
		
	}

}
