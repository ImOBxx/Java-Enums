
public enum TS {
    RED,
    YELLOW,
    GREEN;
    
    public TS next() {
        switch (this) {
            case RED:
                return GREEN;
            case GREEN:
                return YELLOW;
            case YELLOW:
                return RED;
            default:
                throw new IllegalArgumentException("Unexpected value: " + this);
        }
    }
}
public class TSClass {

    public static void main(String[] args) {
        TS currentSignal = TS.RED;
        
        for (int i = 0; i < 6; i++) { // Loop to demonstrate the signal changes
            System.out.println("Current Signal: " + currentSignal);
            currentSignal = currentSignal.next();
        }
    }
}
