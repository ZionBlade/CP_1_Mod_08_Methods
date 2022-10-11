import java.util.Scanner;

public class Main
{
    //class variables go here and are visible to the methods below main
    public static void main(String[] args) //public means accessible, static means that when create objects they are not static, void is return type of method
            // scanner.nextInt returns an int
    {
        Scanner console = new Scanner(System.in);
        //for(int rep = 0; rep <10; rep++)
            sayHello(); // prints hello one time
        System.out.println();

        sayHello(10); // prints hello ten times
        System.out.println();

        sayMsg("Life sucks!", 35);
        System.out.println();

        /*
        int myFav = 7;
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is : " + myFavDoubled);

         */

        int myFav = getRangedInt(console, "Enter your favorite int", 1, 100);
        int myFavDoubled = doubleIt(myFav);
        System.out.println("Doubled is : " + myFavDoubled);
        System.out.println();

        int year = getInt (console, "Enter a year of birth");
        System.out.println("You said the year is: " + year);
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
                    System.out.println("\nYou said your fav num is: " + retVal);
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
            } else  //did not have an int
            {
                trash = pipe.nextLine();
                System.out.println("you entered: " + trash + ". You must enter a valid val!");
            }
        }while(!done);

        return retVal;
    }

}