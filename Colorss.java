
public class Colorss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Color myColor = Color.RED;
		
		switch (myColor)
		{
		case RED:
			System.out.println("The Color Is Red.");
			break;
		case GREEN:
			System.out.println("The Color Is GREEN.");
			break;
		case BLUE:
			System.out.println("The Color Is BLUE.");
			break;
		}
		
		for (Color color : Color.values()) {
			System.out.println(color);
		}
		

	}

}
