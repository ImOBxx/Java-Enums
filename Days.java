
public class Days {
	
	public enum DaysOfTheWeek {
		SUNDAY,
		MONDAY,
		TUESDAY,
		WEDNESDAY,
		THURSDAY,
		FRIDAY,
		SATURDAY
	}

	public static void main(String[] args) {
		// Correct way to assign an enum value
		DaysOfTheWeek today = DaysOfTheWeek.MONDAY;
		System.out.println("Today is " + today);
	}
}
