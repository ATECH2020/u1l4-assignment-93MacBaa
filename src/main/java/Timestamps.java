import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        //my code
        //convert hours1 and hours2 to seconds
        int deltaHours, deltaMinutes, deltaSeconds, totalSeconds;
        hours1 = hours1 * 3600;
        hours2 = hours2 * 3600;

        //convert minutes1 and minutes2 to seconds
        minutes1 = minutes1 * 60;
        minutes2 = minutes2 * 60;

        //find deltaHours
        deltaHours = hours2 - hours1;

        //find deltaMinutes
        deltaMinutes = minutes2 - minutes1;

        //find deltaSeconds
        deltaSeconds = seconds2 - seconds1;

        //find totalSeconds
        totalSeconds = deltaHours + deltaMinutes + deltaSeconds;

        //print totalSeconds
        System.out.print(totalSeconds);

        // closing the scanner object
        scanner.close();
    }
}