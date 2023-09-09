/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Time;

/**
 *
 * @author francisjameslagang
 */
public class Time {
    private int hour;
    private int minute;
    private int second;
    private boolean meridian;

    public Time() {
        this.hour = 12;
        this.minute = 0;
        this.second = 0; 
        this.meridian = true;
    }

    public Time(int hour) {
        this.hour = hour;
        this.minute = 0;
        this.second = 0; 
        this.meridian = true;
    }

    public Time(int hour, int minute, int second, boolean meridian) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.meridian = meridian;
    }
    
    public void tickBySecond() {
        this.second += 1;
        if (this.second == 60) {
            this.second = 0;
            this.minute += 1;
            if (this.minute == 60) {
                this.minute = 0;
                this.hour += 1;
                if (this.hour == 13) {
                    this.hour = 1;
                }
            }
        }
    }

    public void tickByMinute() {
        this.minute += 1;
        if (this.minute == 60) {
            this.minute = 0;
            this.hour += 1;
            if (this.hour == 13) {
                this.hour = 1;
            }
        }
    }

    public void tickByHour() {
        this.hour += 1;
        if (this.hour == 13) {
            this.hour = 1;
        }
    }

    public void advanceTime(int seconds) {
        this.second += seconds;
        if (this.second > 59) {
            this.minute += this.second / 60; 
            this.second %= 60; 
            if (this.minute > 59) {
                this.hour += this.minute / 60; 
                this.minute %= 60; 
            }
        }
    }

    public void display12Hour() {
        System.out.println("\n12-HOUR FORMAT: ");
        String dayPeriod = meridian ? "AM" : "PM";
        int displayHour = (hour == 0 || hour == 12) ? 12 : hour % 12;
        System.out.printf("%02d:%02d:%02d\n", displayHour, this.minute, this.second, dayPeriod);
    }

    public void display24Hour() {
        System.out.println("\n24-HOUR FORMAT:");
        System.out.printf("%02d:%02d:%02d\n", this.hour, this.minute, this.second);
    }

    @Override
    public String toString() {
        return String.format("\nCURRENT TIME: %02d:%02d:%02d", this.hour, this.minute, this.second);
    }
}
