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

	/**
	 * The method returns the date's year.
	 * @return The date's year.
	 */
	public int getYear() {
		return year;
	}

	/**
	 * The method returns the date's month.
	 * @return The date's month.
	 */
	public int getMonth() {
		return month;
	}

	/**
	 * The method returns the date's day.
	 * @return The date's day.
	 */
	public int getDay() {
		return day;
	}
	
	/**
	 * The method sets the date's year.
	 * @param The date's new year.
	 */
	public void setYear(int yearIn) {
		year = yearIn;
	}

	/**
	 * The method sets the date's month.
	 * @param The date's new month.
	 */
	public void setMonth(int monthIn) {
		month = monthIn;
	}
	
	/**
	 * The method sets the date's day.
	 * @param The date's new day.
	 */
	public void setDay(int dayIn) {
		day = dayIn;
	}

	/**
	 * The method converts the months and years into their equivalent days.
	 * @return the total days within the date.
	 */
	public int toDays() {
		//instantiate vars
		int days = day;
		int months = month;
		int years = year;

		
		//months ---> days
		for (int i = 1; i < months; i++) {
			days += daysInMonth[i - 1];
		}

		//years ---> days
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
