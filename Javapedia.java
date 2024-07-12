import java.util.Scanner;

public class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("\n**********Javapedia**********");
        System.out.println("How many historical figures will you register?");
        int numOfFigures = scan.nextInt(); 
        
        String[][] encyclopedia = new String[numOfFigures][3];

        scan.nextLine();
        for (int i=0; i < encyclopedia.length; i++) {
            
            System.out.println("\n\tFigure " + (i+1)); 

            System.out.print("\t - Name: ");
            encyclopedia[i][0] = scan.nextLine();
            System.out.print("\t - Date of birth: ");
            encyclopedia[i][1] = scan.nextLine();
            System.out.print("\t - Occupation: ");
            encyclopedia[i][2] = scan.nextLine();

            System.out.print("\n");

        }
        
        System.out.println("These are the values you stored:"); 
        System.out.print("\n");
        print2DArray(encyclopedia);

        System.out.print("\nWho do you want information on? ");  
        String name = scan.nextLine();
        for (int i=0; i<encyclopedia.length; i++) {
            if (encyclopedia[i][0].equals(name)) {
                System.out.println("\tName: " + encyclopedia[i][0]);
                System.out.println("\tDate of Birth: " + encyclopedia[i][1]);
                System.out.println("\tOccupation: " + encyclopedia[i][2]);
            }
        }
        scan.close();
    }

    /**
     * Function name: print2DArray
     * @param array (String[][])
     * 
     * Inside the function
     *  1. print the database
     *     • a tab of space precedes each row.
     *     • each value in database has one space from the other value. 
     *     • print a new line.
     */
    public static void print2DArray(String[][] array) {
        for (int i=0; i<array.length; i++) {
            System.out.print("\t");
            for (int j=0; j<array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.print("\n");
        }
    }

}
