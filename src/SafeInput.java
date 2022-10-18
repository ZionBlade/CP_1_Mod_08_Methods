import java.util.Scanner;

public class SafeInput
{
    /**
     * Get an integer value within a specified range of low - high
     *
     * @param pipe scanner to use for console input
     * @param prompt string that tells the user what to input
     * @param low low value for a range low - high
     * @param high high value for a range low - high
     * @return an int value within the low - high range
     */
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) //returns an int
    {
        int retVal = low - 1;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + " - " + high +"] : ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); //clear the new line from the buffer
                if (retVal >= low && retVal <= high) {
                    // System.out.println("\nYou said your fav num is: " + retVal);
                    done = true;
                } else {
                    System.out.println("You said the val is " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else  //did not have an int
            {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }


    /**
     * use scanner to get an int from the console with no constraints
     *
     * @param pipe scanner to use for console input
     * @param prompt string prompt that tells the user what to input
     * @return an integer value
     */
    public static int getInt(Scanner pipe, String prompt) //returns an int
    {
        int retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextInt())
            {
                retVal = pipe.nextInt();
                pipe.nextLine(); //clear the new line from the buffer
                done = true;
            }
            else  //did not have an int
            {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }


    /**
     * use scanner to get a double from the console with no constraints
     *
     * @param pipe scanner to use for console input
     * @param prompt string prompt that tells the user what to input
     * @return a double value
     */
    public static double getDouble(Scanner pipe, String prompt) //returns a double
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the new line from the buffer
                done = true;
            }
            else  //did not have a double
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a double not " + trash);
            }
        }while(!done);

        return retVal;
    }


    /**
     * Get a double value within a specified range of low - high
     *
     * @param pipe scanner to use for console input
     * @param prompt string that tells the user what to input
     * @param low low value for a range low - high
     * @param high high value for a range low - high
     * @return a double value within the low - high range
     */
    public static double getRangedDouble(Scanner pipe, String prompt, double low, double high) //returns a double
    {
        double retVal = low - 1;
        String trash = "";

        boolean done = false;
        do {
            System.out.print(prompt + "[" + low + " - " + high +"] : ");
            if(pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                pipe.nextLine(); //clear the new line from the buffer
                if (retVal >= low && retVal <= high) {
                    // System.out.println("\nYou said your fav num is: " + retVal);
                    done = true;
                } else {
                    System.out.println("You said the val is " + retVal + " but that is out of range [" + low + " - " + high + "]");
                }
            } else  //did not have an int
            {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }


    /**
     * Get an arbitrary string of at least one character in length
     *
     * @param pipe scanner to use for input
     * @param prompt prompt msg that tells user what to input
     * @return a string entered by the user of at least one character
     */
    public static String getNonZeroLength(Scanner pipe, String prompt)
    {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");

            retVal = pipe.nextLine();
            if(retVal.length() > 0)
            {
                done = true;
            }
            else
            {

                System.out.println("You must enter at least one character.");
            }
        }while(!done);

        return retVal;
    }


}