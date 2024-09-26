package day1;

public class Swim {
    private int strokeRate;
    private int lapCount;
    private boolean isUnderwater;

    public Swim() {
        this.strokeRate = 0;
        this.lapCount = 0;
        this.isUnderwater = false;
    }

    public void dive() {
        isUnderwater = true;
        System.out.println("Diving into the water!");
    }

    public void swimLap() {
        lapCount++;
        System.out.println("Completed a lap. Total laps: " + lapCount);
    }

    public void changeStrokeRate(int newRate) {
        strokeRate = newRate;
        System.out.println("Changed stroke rate to " + strokeRate + " strokes per minute.");
    }

    public String getSwimDetails() {
        return "Stroke Rate: " + strokeRate + " spm, Laps: " + lapCount + ", Underwater: " + (isUnderwater ? "Yes" : "No");
    }
}

