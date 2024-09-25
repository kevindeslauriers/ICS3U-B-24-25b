package day4;

public class ExtraHelp {
    public static void main(String[] args) {
        int totalSeconds = 5000;
        final int HOUR = 3600;
        final int MINUTE = 60;

        int hours = totalSeconds / HOUR;
        int totalSeconds_min = totalSeconds % (hours * 3600);
        int minutes = totalSeconds_min / 60;
        int totalSeconds_sec = totalSeconds_min % (minutes * 60);
        int seconds = totalSeconds_sec;

        
        // int minuteH = totalSeconds - (HOUR * hourT); 
        // int minuteT = minuteH / MINUTE;
        // int secondsT = minuteH - (MINUTE * minuteT);

        // System.out.println(5000 / 60 % 60);
    }
}
