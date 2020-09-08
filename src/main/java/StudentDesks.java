import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int class1 = scanner.nextInt();
        int class2 = scanner.nextInt();
        int class3 = scanner.nextInt();

        //my code
        //initialize variables
        int totalDesks, desk1, desk2, desk3;

        //find the total number of desks needed for each class
        desk1 = class1 / 2;
        if ( (class1 % 2) > 0) 
        {
            desk1++;
        }

        desk2 = class2 / 2;
        if ( (class2 % 2) > 0) 
        {
            desk2++;
        }

        desk3 = class3 / 2;
        if ( (class3 % 2) > 0) 
        {
            desk3++;
        }

        //find the total number of desks
        totalDesks = desk1 + desk2 + desk3;

        //print totalDesks
        System.out.print(totalDesks);

        // closing the scanner object
        scanner.close();
    }
}