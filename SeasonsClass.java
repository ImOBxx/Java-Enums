
public class SeasonsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seasons mySeasons = Seasons.FALL;
		
		switch (mySeasons)
		{
		case FALL:
            System.out.println("The Season is FALL.");
            break;
		case SUMMER:
            System.out.println("The Season is SUMMER.");
            break;
		case SPRING:
            System.out.println("The Season is SPRING.");
            break;
		case WINTER:
            System.out.println("The Season is WINTER.");
            break;
		}
		
		for (Seasons season : Seasons.values()) {
			System.out.println(season);
		}

	}

}
