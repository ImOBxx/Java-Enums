
public enum Day {
	SUNDAY,
	MONDAY,
	TUESDAY,
	WEDNESDAY,
	THURSDAY,
	FRIDAY,
	SATURDAY;
}


public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Day today = Day.MONDAY;
          System.out.println(today);
          System.out.println(today.name());
          System.out.println(today.ordinal());
          
          
	}

}
