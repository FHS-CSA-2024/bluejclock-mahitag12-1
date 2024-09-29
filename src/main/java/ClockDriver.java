package src.main.java;


public class ClockDriver
{
    public static void main(String[] args){
        //Implement tests for your ClockDisplay
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32 to 03:33
        //  * Tick test for 03:09 to 03:10
        //  * Tick test for 01:59 to 02:00
        //  * Tick test for 09:59 to 10:00
        //  * Tick test for 23:59 to 00:00
        
        System.out.println("Testing Clock Display:");
        ClockDisplay test1 = new ClockDisplay();
        String outputTest1 = test1.getTime();
        System.out.println("\tEmpty Con. Test - " + test1Output);
        
        ClockDisplay test2 = new ClockDisplay(2, 45);
        String outputTest2 = test2.getTime();
        System.out.println("\t2 Arg Con. Test - " + test2Output);
        
        test2.setTime(5, 15);
        String outputTeast3 = test2.getTime();
        System.out.println("\t Set Time Test - " + test3Output);
        
        //TODO; Read time and Tick Time test
        System.out.println("Clock Display:");
        ClockDisplay tickTest1 = new ClockDisplay(3,32);
        String outputTickTest1 = tickTest1.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTestOutput);
        tickTest1.timeTick();
        tickTestOutput = tickTest1.getTime();
        System.out.println("\tTickTest1 After increment -" + tickTestOutput);
        
        //Implement tests for your ClockDisplaySeconds
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        //      * Constructor w/ time given & read time
        //      * Set time
        //      * Read time
        //      * Tick time
        //  * Tick test for 03:32:59 to 03:33:00
        System.out.println("Clock Display Seconds:");
        ClockDisplaySeconds tickTest1Seconds = new ClockDisplaySeconds(3, 32, 59);
        String outputTickTesteconds = tickTest1Seconds.getTime();
        System.out.println("\tTickTest1 Before increment - " + tickTestOutputSeconds);
        tickTest1Seconds.timeTick();
        tickTestOutputSeconds = tickTest1Seconds.getTime();
        System.out.println("\tTickTest1 After increment -" + tickTestOutputSeconds);
        //  * Tick test for 01:00:59 to 01:01:00
        ClockDisplaySeconds tickTest2Seconds = new ClockDisplaySeconds(1,0,59);
        String outputTickTestSeconds2 = tickTest2Seconds.getTime();
        System.out.println("\tTickTest2 Before increment - " + tickTestOutputSeconds2);
        tickTest2Seconds.timeTick();
        tickTestOutputSeconds2 = tickTest2Seconds.getTime();
        System.out.println("\tTickTest2 After increment -" + tickTestOutputSeconds2);
        //  * Tick test for 01:59:59 to 02:00:00
        ClockDisplaySeconds tickTest3Seconds = new ClockDisplaySeconds(1,59,59);
        String outputTickTestSeconds3 = tickTest3Seconds.getTime();
        System.out.println("\tTickTest3 Before increment - " + tickTestOutputSeconds3);
        tickTest3Seconds.timeTick();
        tickTestOutputSeconds3 = tickTest3Seconds.getTime();
        System.out.println("\tTickTest3 After increment -" + tickTestOutputSeconds3);
        //  * Tick test for 23:59:59 to 00:00:00
        ClockDisplaySeconds tickTest4Seconds = new ClockDisplaySeconds(23,59,59);
        String outputTickTestSeconds4 = tickTest4Seconds.getTime();
        System.out.println("\tTickTest4 Before increment - " + tickTestOutputSeconds4);
        tickTest4Seconds.timeTick();
        tickTestOutputSeconds4 = tickTest4Seconds.getTime();
        System.out.println("\tTickTest4 After increment -" + tickTestOutputSeconds4);
        /*CHALLENGE*/
        System.out.println("Testing 12 Hour Clock Display:");
        //Implement tests for your ClockDisplay12Hour
        //  * Test that you can do the basics
        //      * Empty constructor & read time
        ClockDisplay12Hour test1_12 = new ClockDisplay12Hour();
        System.out.println("\tEmpty Con. Test - " + test1_12.getTime());
        //      * Constructor w/ time given & read time
        ClockDisplay12Hour test2_12 = new ClockDisplay12Hour(2, 45, false);
        System.out.println("\t2 Arg Con. Test - " + test2_12.getTime());
        //      * Set time
        //      * Read time
        //      * Tick time
        // Tick test for 03:32 PM to 03:33 PM
        ClockDisplay12Hour tickTest1_12 = new ClockDisplay12Hour(3, 32, false);
        System.out.println("\tTickTest1 Before increment - " + tickTest1_12.getTime());
        tickTest1_12.timeTick();
        System.out.println("\tTickTest1 After increment - " + tickTest1_12.getTime());

        // Tick test for 11:59 PM to 12:00 AM
        ClockDisplay12Hour tickTest2_12 = new ClockDisplay12Hour(11, 59, false);
        System.out.println("\tTickTest2 Before increment - " + tickTest2_12.getTime());
        tickTest2_12.timeTick();
        System.out.println("\tTickTest2 After increment - " + tickTest2_12.getTime());

        // Tick test for 11:59 AM to 12:00 PM
        ClockDisplay12Hour tickTest3_12 = new ClockDisplay12Hour(11, 59, true);
        System.out.println("\tTickTest3 Before increment - " + tickTest3_12.getTime());
        tickTest3_12.timeTick();
        System.out.println("\tTickTest3 After increment - " + tickTest3_12.getTime());

        // Tick test for 12:59 PM to 01:00 PM
        ClockDisplay12Hour tickTest4_12 = new ClockDisplay12Hour(12, 59, false);
        System.out.println("\tTickTest4 Before increment - " + tickTest4_12.getTime());
        tickTest4_12.timeTick();
        System.out.println("\tTickTest4 After increment - " + tickTest4_12.getTime());
    }
}
