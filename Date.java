public class Date {
	
	//inst. var.
	private int year;
	private int month;
	private int day;
	private final int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
	
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
	
	public int getMonth() {
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

	public int toDays() {
		int days = day;
		int months = month;
		int years = year;

		

		for (int i = 1; i < months; i++) {
			days += daysInMonth[i - 1];
		}

		for (int i = 1; i < years; i++) {
			if (i % 4 == 0) {
				days += 366;
			} else {
				days += 365;
			}
		}

		return days;
	}
	
	/**
	 * this method returns a int that shows month and day
	 * @return year/month/day
	 */
	public String display() {
		return year + "/" +  month + "/" + day;
		
	}

}
