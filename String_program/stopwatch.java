package String_program;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class stopwatch {

	static Scanner scan = new Scanner(System.in);
    static boolean running = true;
    static boolean paused = false;
    static String userInput;
   public static void main(String[] args) {
        System.out.println("Press 'S' to start, 'Q' to quit");
        userInput = scan.nextLine();
        if (userInput.equalsIgnoreCase("S")) {
            startStopwatch();
        } else if (userInput.equalsIgnoreCase("Q")) {
            System.out.println("Quiting");
        } else {
            System.out.println("Invalid input");
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
                String timer = String.format("\r Elapsed time: %02d:%02d:%02d:%03d ", HH, MM, SS, MS);
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
        System.out.println("Press 'P' to pause, 'R' to resume, 'Enter' to stop");
       while (running) {
            userInput = scan.nextLine();
            if (userInput.equalsIgnoreCase("P")) {
                paused = true;
                pauseDuration[0] = Instant.now().toEpochMilli() - startTime - elapsedTime[0];
                System.out.println("Paused");
            } else if (userInput.equalsIgnoreCase("R")) {
                paused = false;
                pauseDuration[0] = Instant.now().toEpochMilli() - startTime - elapsedTime[0];
                System.out.println("Resumed");
            } else {
                running = false;
                System.out.println("Stopped");
            }
        }
    }
}

