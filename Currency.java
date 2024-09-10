
public class Currency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double amountInUSD = 100.0;
	        
	        double amountInEUR = Currency.EUR.convertFromUSD(amountInUSD);
	        double amountInJPY = Currency.JPY.convertFromUSD(amountInUSD);
	        double amountInGBP = Currency.GBP.convertFromUSD(amountInUSD);
	        
	        System.out.println(amountInUSD + " USD is " + amountInEUR + " EUR");
	        System.out.println(amountInUSD + " USD is " + amountInJPY + " JPY");
	        System.out.println(amountInUSD + " USD is " + amountInGBP + " GBP");
	}

}
