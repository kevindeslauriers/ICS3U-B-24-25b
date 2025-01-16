package day3;

public class LEDStripClient {
    public static void main(String[] args) {
        for (String pattern : LEDStrip.AVAILABLE_PATTERNS) {
            LEDStrip strip = new LEDStrip(pattern, 10);
            strip.turnOnLEDs();
            strip.display();
            System.out.println();
        }
    }
}
