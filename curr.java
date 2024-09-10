
public enum curr {
	USD,
	EUR,
	JPY,
	GBP,
	
	private static final double USD_TO_EUR = 0.85;
    private static final double USD_TO_JPY = 110.0;
    private static final double USD_TO_GBP = 0.75;
    
    public double convertFromUSD(double amount) {
        switch (this) {
            case EUR:
                return amount * USD_TO_EUR;
            case JPY:
                return amount * USD_TO_JPY;
            case GBP:
                return amount * USD_TO_GBP;
            case USD:
            default:
                return amount;

}
    }
}
