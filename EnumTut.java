
public class EnumTut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
		
		if (day == DaysOfTheWeek.THURSDAY) {
			System.out.println("Yay it's almost Friday!");
		}
		
		for (DaysOfTheWeek myDay : DaysOfTheWeek.values()) {
			System.out.println(myDay);
		}
	}
}

