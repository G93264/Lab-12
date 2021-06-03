package com.company;

public class AlarmClock extends Clock{
    private int alarmHour;
    private int alarmMinute;

    public AlarmClock(int hour, int minute, int second, int alarmHour, int alarmMinute) {
        super(hour, minute, second);
        this.alarmHour = alarmHour;
        this.alarmMinute = alarmMinute;
    }

    public AlarmClock() {
        super();
        this.alarmHour = 5;
        this.alarmMinute = 30;
    }


}
