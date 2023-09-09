/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Time;

/**
 *
 * @author francisjameslagang
 */
public class Main {
    public static void main(String[] args) {
        Time myTime = new Time(14,50,59,true);

        System.out.println(myTime);
        
        // Tick by one second
        myTime.tickBySecond();
        System.out.println("\nTick the time by 1 second");
        myTime.display12Hour();
        myTime.display24Hour();

        // Tick by one minute
        myTime.tickByMinute();
        System.out.println("\nTick the time by 1 minute");
        myTime.display12Hour();
        myTime.display24Hour();
        
        // Tick by one hour
        myTime.tickByHour();
        System.out.println("\nTick the time by 1 hour");
        myTime.display12Hour();
        myTime.display24Hour();
        
        // Advance time
        myTime.advanceTime(40);
        System.out.println("\nAdvance the time by 40 seconds");
        myTime.display12Hour();
        myTime.display24Hour();
    }
}
