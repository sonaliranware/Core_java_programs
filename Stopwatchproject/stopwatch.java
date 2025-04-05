package Stopwatchproject;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class stopwatch {
	static Scanner sc=new Scanner(System.in);
	static boolean running=true;
	static boolean paused=false;
	static String userinput;
	public static void main(String[] args) {
		System.out.println("Press 'S'  to start ,'Q' to quit");
		userinput=sc.next();
		if(userinput.equalsIgnoreCase("S"))
		{
			startStopwatch() ;
		}
		else if(userinput.equalsIgnoreCase("Q"))
		{
			System.out.println("Quit.....");
		}
		else
		{
			System.out.println("invalid input ");
		}
		}

    private static void startStopwatch() {
        final long startTime = Instant.now().toEpochMilli();
        final long[] elapsedTime = {0};
        final long[] pauseDuration = {0};
        Thread stopwatchThread = new Thread(() -> {
            while (running) {
                if (!paused) {
                    elapsedTime[0] = Instant.now().toEpochMilli() - startTime - pauseDuration[0];
                }
                Duration duration = Duration.ofMillis(elapsedTime[0]);
                long HH = duration.toHours();
                long MM = duration.toMinutesPart();
                long SS = duration.toSecondsPart();
                long MS = duration.toMillisPart();
                String timer = String.format(" \r Elapsed time: %02d:%02d:%02d:%03d ", HH, MM, SS, MS);
                try {
                    System.out.write(timer.getBytes());
                } catch (Exception e) {
                    e.printStackTrace();
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        stopwatchThread.start();
        System.out.println("Press 'p' to pause 'R ' to resume 'Enter' to stop");
        while(running)
        {
        	userinput=sc.next();
        	if(userinput.equalsIgnoreCase("p"))
    		{
    			paused=true;
    			pauseDuration[0]=Instant.now().toEpochMilli() - startTime- elapsedTime[0];
    			System.out.println("paused");
    			
    		}
    		else if(userinput.equalsIgnoreCase("R"))
    		{
    			paused=false;
    			pauseDuration[0]=Instant.now().toEpochMilli() - startTime- elapsedTime[0];
    			System.out.println("Resume");
    		}
    		else
    		{
    			running=false;
    			System.out.println("Stopped");
    		}
        	
        }

				
				
		
	  }

}
