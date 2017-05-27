package lets.play.tdd;

public class OcrAlaramClock {

    public String generateOcrAlarmSounds(String s) {
        int timeInMins = Integer.valueOf(s.substring(3, 5));
        int timeInHour = Integer.valueOf(s.substring(0, 2));
        if(timeInHour == 7 && timeInMins == 0) return "wake up";
        else if(timeInMins == 0) return "beep";
        else return "tick";
    }
}
