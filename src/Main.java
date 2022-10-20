import java.util.Scanner;

public class Main
{
    //class variables go here and are visible to the methods below main
    public static void main(String[] args) //public means accessible, static means that when create objects they are not static, void is return type of method
            // scanner.nextInt returns an int
            // method static when don't belong to object
            // void means doesn't return anything

    {

        Scanner console = new Scanner(System.in);
/*
        //for(int rep = 0; rep <10; rep++)
            sayHello(); // prints hello one time
        System.out.println();

        sayHello(10); // prints hello ten times
        System.out.println();

        sayMsg("Life sucks!", 35);
        System.out.println();


        int myFav = 7;
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is : " + myFavDoubled);


        int myFav = getRangedInt(console, "Enter your favorite int", 1, 100);
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is : " + myFavDoubled);
        System.out.println();

        int year = getInt (console, "Enter a year of birth");
        System.out.println("You said the year is: " + year);
        */

        //Scanner in = new Scanner(System.in);

        //int favNum = SafeInput.getRangedInt(in, "enter your fav num ", 1, 100);

        //int anyInt = getInt(in, "enter an int");

        //double salary = getDouble(in, "enter your salary");
        //System.out.println("you said your salary was: " + salary);

        //double tax = getRangedDouble(in, "enter your tax ", 100, 1000);
        //System.out.println("You said your tax was: " + tax);

        //String msg = getNonZeroLength(in, "enter any string other than zero length: ");
        //System.out.println("Msg is: " + msg);

        boolean isRaining = getYNConfirm(console, "Is it raining");
        System.out.println("it is raining: " + isRaining);

    }
    //user defined Methods go here and are static


    public static void sayHello()//first line is method signature
    {
        System.out.println("Hello");
    }


    public static void sayHello(int times)//first line is method signature
            //when you have two versions that do the same thing, it is called overloaded
    {
        for(int rep = 0; rep < times; rep++)
            System.out.println("Hello");
    }

    public static void sayMsg(String msg, int times)//first line is method signature
    //when you have two versions that do the same thing, it is called overloaded
    {
        for(int rep = 0; rep < times; rep++)
            System.out.println(msg);
    }

    public static int doubleIt(int toBeDoubled)
    {
        int doubledVal = toBeDoubled * 2;

        return doubledVal;

        //return toBeDoubled * 2;
    }

// below is the java doc block
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
            } else  //did not have a double
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

    /**
     *
     * @param pipe
     * @param prompt
     * @param pattern
     * @return
     */
    public static String getRegExString(Scanner pipe, String prompt, String pattern)
    {
        String retVal = "";
        boolean done = false;

        do {
            System.out.print(prompt + ": ");

            retVal = pipe.nextLine();
            if(retVal.matches(pattern))
            {
                done = true;
            }
            else
            {

                System.out.println("What you entered does not match the pattern: " + pattern);
            }
        }while(!done);

        return retVal;
    }

    /**
     * gets a Y or N from the user and returns a True or False repsectively
     *
     * @param pipe
     * @param prompt
     * @return
     */
    public static boolean getYNConfirm(Scanner pipe, String prompt)
    {
        String respYN = "";
        boolean retVal = false;
        boolean done = false;

        do{
            System.out.print(prompt + " [Y/N]: ");
            respYN = pipe.nextLine();

            if(respYN.equalsIgnoreCase("Y"))
            {
                retVal = true;
                done = true;
            }
            else if (respYN.equalsIgnoreCase("N"))
            {
                retVal = false;
                done = true;
            }
            else{
                System.out.println("you must enter [Y/N]: ");
            }

        } while(!done);

        return retVal;
    }




}