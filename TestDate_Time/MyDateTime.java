
public class MyDateTime {
	
	MyDate date;
	MyTime time;
	

	public MyDateTime(MyDate date, MyTime time) {
		this.date = date ;
		this.time = time ;
	}
	public String toString() {
		return date.toString() +" " + time.toString() ;
		
	}

	public void incrementDay() {
		date.incrementDay();
		
	}

	public void incrementDay(int i) {
		date.incrementDay(i);
		
	}
	
	public void incrementHour() {
		date.incrementDay(time.incrementHour());

	}
	
	public void incrementHour(int i) {
		date.incrementDay(time.incrementHour(i));
		
		
	}
	public void decrementHour(int i) {
		date.decrementDay(time.decrementHour(i));
	
	}

	public void incrementMinute(int i) {
		date.incrementDay(time.incrementMinute(i));
		
	}

	public void decrementMinute(int i) {
		date.decrementDay(time.decrementMinute(i));
	}

	public void incrementYear(int i) {
		date.incrementYear(i);
	
	}

	public void decrementDay() {
		date.decrementDay();
	
	}

	public void decrementYear() {
		date.decrementYear();
		
	}

	public void decrementMonth() {
		date.decrementMonth();
	
	}

	public void decrementMonth(int i) {
		date.decrementMonth(i);
	
	}

	public void decrementDay(int i) {
		date.decrementDay(i);
		
	}

	public void incrementMonth(int i) {
		date.incrementMonth(i);		
	}

	public void decrementYear(int i) {
		date.decrementYear(i);		
	}

	public void incrementMonth() {
		date.incrementMonth();
	}

	public void incrementYear() {
		date.incrementYear();
	}

	public boolean isBefore(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isAfter(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return false;
	}

	public String dayTimeDifference(MyDateTime anotherDateTime) {
		// TODO Auto-generated method stub
		return null;
	}
	




	

}
