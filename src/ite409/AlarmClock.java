package ite409;

/**
 * Created by Hussein on 2/14/17.
 */
public class AlarmClock {
    private Time currentTime;
    private Time alarmTime;
    private static int clockCount;

    public AlarmClock(Time currentTime, Time alarmTime) {
        this.currentTime = currentTime;
        this.alarmTime = alarmTime;
        clockCount++;
    }

    public int getCount() {
        return clockCount;
    }

    public String toString() {
        return String.format("Current Time: %s%nAlarm Time: %s%n", currentTime, alarmTime);
    }
}
