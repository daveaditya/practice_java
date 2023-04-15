/*
 * Create a Date class with three integer instance variables named day, month, year.
 * It has a constructor with three parameters for initializing the instance variables,
 * and it has one method named daySinceJan1(). It computes and returns the number of
 * days since January 1 of the same year, including January 1 and the day in the Date
 * object. For example, if day is a Date object with day = 1, month = 3, and year =2000
 * then the call date.datSinceJan1() should return 61 since there are 61 days between
 * the dates if January 1, 2000, and March 1, 2000, including January 1 and March 1.
 * Include a DateDemo class that tests the Date class. Don't forget leap years.
 */
class Date {
	int day,month,year;

	Date() {
		day = 1;
		month = 1;
		year = 2000;
	}

	Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	long daySinceJan1() {
		int day = this.day;
		int month = this.month;
		int year = this.year;

		long days = 0;
		int numOfMonths = month;
		
		for(int y = year ; y >= 2000 ; y++) {
			if(y%4 == 0) {
				days = 29;
			}
			else {
				days = 28;
			}
			
			
		}
								

		return days;
	}

	void setDay(int day) {
		this.day = day;
	}

	void setMonth(int month) {
		this.month = month;
	}

	void setYear(int year) {
		this.year = year;
	}

	int getDay() {
		return day;
	}

	int getMonth() {
		return month;
	}

	int getYear() {
		return year;
	}
}

class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date obj = new Date(1,3,2000);
		System.out.println("The date is : " + obj.getMonth() + " " + obj.getDay() + ", " + obj.getYear());
		System.out.println("Days since January 01, 2000 are " + obj.daySinceJan1());
	}

}
