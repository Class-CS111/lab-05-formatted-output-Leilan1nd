// COLLABORATORS: <tutors, instructor, or anyone else who helped you>

// DESCRIPTION: <a sentence about what the purpose of this program is>

public class Main
{
	public static void main(String[] args)
	{
    //DECLARATION + INITIALIZATION SECTION
    double dollarAmount = 1.68; //hardcoded for now
    int centRemaining, numQuarters, numNickels, numDimes, numPennies; 

    //CALCULATION SECTION
    centRemaining = (int)(dollarAmount *100); //have to typecast: force output to be int by using (int)
    numQuarters = centRemaining/25; //int division whole number only
    centRemaining %= 25; //gets the remaining cents after taking out quarters
    //System.out.println(centRemaining);
    System.out.println("quarters: " + numQuarters);
    //find Dimes
    numDimes = centRemaining/10;
    centRemaining %= 10;
    System.out.println("dimes " +numDimes);
    //find Nickels 
    numNickels = centRemaining/5;
    centRemaining %= 5;
    System.out.println("nickel " + numNickels);
    //find Pennies
    numPennies = centRemaining; 
    System.out.println("pennies " + numPennies);
    
    //OUTPUT SECTION
System.out.printf("$%.2f can be converted to %d quarters, %d dimes, %d nickels, and %d pennies.", dollarAmount, numQuarters, numDimes, numNickels, numPennies); 
    // % = place to put value .2 means 2 decimal places and f means flating variable

  }

}
