
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab02fishl;

/**
 *
 * @author logan
 */

import java.util.*;
import java.util.Scanner;

public class Lab02Fishl {

public static final String START_STRING = "abc def";
/**
* Prints the provided ‘errorMessage‘, then reminds the
* user what all the commands are and how to use them.
* You do not need to edit this function.
*/
public static void printHelp(String errorMessage)
{
	System.err.println(errorMessage);
	System.err.println("Usage - enter one of the following Commands:");
	System.err.println();
	System.err.println("searchText [text]: prints the index of [text] in "
	+ "the String, leaves it unchanged.");
	System.err.println("removeText [text] - deletes all occurences of "
	+ "[text] in the String.");
	System.err.println("addText [i] [text] - first argument is an integer "
	+ "between 0 and and the length of the string; "
	+ "adds [text] at that location in the string.");
	System.err.println("reverseText [no argument] - makes the string into "
	+ "its mirror image.");
	System.err.println("reverseEachWord [no argument] - like reverseText "
	+ "but applies to each command word individually.");
	System.err.println("printString [no argument] - prints the current "
	+ "value of the string.");
	System.err.println("enterNewString [text] - overwites whatever the "
	+ "string was with [text] instead.");
	System.err.println("quit [no argument] - exits the program.");
	System.err.println("");
}

/**
* Implements the "printString" command. This command doesn’t change
* theString, so we just return what it was.
*/
public static String printString(String oldString, String[] commandWords)
{
	System.out.println(oldString);
	return oldString;
}

/**
* A useful function, combines all of the words in ‘words‘ starting from
* ‘index‘. You do not need to edit this function.
*/
private static String combineWordsFrom(String[] words, int index)
{
	String newString = "";
	for(int i = index; i < words.length; i+=1)
	{
		if(i > index)
		{
			newString += " ";
		}
		newString += words[i];
	}
	return newString;
}

public static String searchText(String oldString, String[] commandWords)
{
    
    
    // TODO: You should search the string "oldString" for the text found in 
    //"commandWords" starting from index 1 to the end of the string array
  

    
    // 1. First check if the length of commandWords is less than 2. If it is, then print an error using printHelp and return null.
    
   
        if(commandWords.length < 2)
        {
            printHelp("Error enter a longer search value");
            
            return null;
        }
    
         // 2. Get the text you need to search oldString for. Use combineWordsFrom(commandWords,1) to get the appropriate text.
        String Search = combineWordsFrom(commandWords,1);
        // 3. Remove the text from oldString using the String function replaceAll.
        System.out.println(oldString.indexOf(Search));
    // 4. Return null (since searchText does not change the current string).
    return null;
     
}

public static String removeText(String oldString, String[] commandWords)
{
	// TODO: You should remove from "oldString" all instances of the text found in "commandWords" starting from index 1 to the end of the string array
	// 1. First check if the length of commandWords is less than 2. If it is, then print an error using printHelp and return null.
    
    
        if(commandWords.length < 2)
        {
            printHelp("Error Command WOrds less than 2");
            return null; 
        }
    // 2. Get the text you need to remove from oldString. Use combineWordsFrom(commandWords,1) to get the appropriate text.
        String removedWord = combineWordsFrom(commandWords,1);
    
    // 3. Remove the text from oldString using the String function replaceAll.
        String Replace = (oldString.replaceAll(removedWord, ""));
        
       
        // 4. Return the String that is returned from the replaceAll function.
        return Replace;
    
}
    
    
    
public static String addText(String oldString, String[] commandWords)
{
	// TODO: You should add text to "oldString" at a specific index
	// 1. First check if the length of commandWords is less than 3. If it is, then print an error using printHelp and return null.
   
        if(commandWords.length < 3)
        {
            printHelp("Error length of commandWords is not less 3");
            return null; 
        }
        
    
        // 2. Get the text you need to add to oldString. Use combineWordsFrom(commandWords,2) to get the appropriate text.
        String text = combineWordsFrom(commandWords,2);
        
	// 3. Get the index using "Integer.parseInt(commandWords[1])".
        int index = Integer.parseInt(commandWords[1]);
	// 4. Check if the index is in the correct range (greater than 0, and less than or equal to oldString’s length). If not, print an error using printHelp and return null.
        
        if(index > 0 && index <= oldString.length())
        {
            // 5. Return oldString.substring(parameters) + text + oldString.substring(parameters) using the correct parameters for substring.
           return oldString.substring(0,index) + text + oldString.substring(index);
                  
            
        }
        else
        {
        printHelp("Index needs to be greater than 0 and less than oldStrings length");
        return null;
        }
	
        
        
}

private static String reverseString(String s)
{
	// TODO: Make the utility function reverseString which reverses a single string
	// 1. Create a new StringBuilder object, and initialize it with "s"
    StringBuilder str = new StringBuilder(s);
   
	// 2. Call reverse() on the StringBuilder object, then toString()
          StringBuilder reversesStr = str.reverse();
	// 3. Return the resulting String from step 2
    return reversesStr.toString();
	// Note: An alternative way of doing this is to traverse the string in reverse using a for loop and the function charAt, and to build the string in reverse character by character
}

public static String reverseText(String oldString, String[] commandWords)
{
	// This function is already completed, as long as reverseString is correctly implemented.
	// Note: It was a design choice to not error out if arguments were erroneously included.
return reverseString(oldString);
}

public static String reverseEachWord(String oldString, String[] commandWords)
{
	// TODO: Reverse each individual word in oldString using the reverseString function which you filled in
	// 1. Call split(" ") on oldString (split up the string on space), and store the result in a String array
        String array[] = oldString.split(" ");
	// 2. Create a new empty string called result (i.e., String result = "")
        String result = " ";
	// 3. Create a for loop and iterate over each element of the String array from step 1
        
    for(int i = 0;i<array.length; i++)
    {
        
        if(i < 0)
        {
            // 4. Within the loop, if the index is greater than 0, add a blank space to result (i.e., result += " ")
            result += " ";
            
        }
        // 5. Within the loop, add the reversed version of the array String to result (i.e., result += reverseString(array[i]));
        result += reverseString(array[i]);

    }
	// 6. Return result
        return result;
    
	// Note: It was a design choice to not error out if arguments were erroneously included.
}

/**
* Implements the "enterNewString" command. You probably want to
* create a similar function for each string command. Note that
* ‘oldString‘ is ignored by this particular command/function.
*/
public static String enterNewString(String oldString, String[] commandWords)
{
	// This command needs an argument after the command; if it’s missing
	// that’s an error.
	if (commandWords.length < 2)
	{
		printHelp("enterNewString - requires an argument");
		return null;
	}
	return combineWordsFrom(commandWords, 1);
}

/**
* This method should return the result of applying the string command
* represented by ‘commandWords‘, or else null (if the command was not
* recognized or the wrong arguments were supplied). When returning
* null, an appropriate error message should first be printed (use
* printHelp()).
*/
public static String handleStringCommand(String oldString, String[] commandWords)
{
	if ("searchText".equals(commandWords[0]))
	{
		return searchText(oldString, commandWords);
	}
	else if ("removeText".equals(commandWords[0]))
	{
		return removeText(oldString, commandWords);
	}
	else if ("addText".equals(commandWords[0]))
	{
		return addText(oldString, commandWords);
	}
	else if ("reverseText".equals(commandWords[0]))
	{
		return reverseText(oldString, commandWords);
	}
	else if ("reverseEachWord".equals(commandWords[0]))
	{
		return reverseEachWord(oldString, commandWords);
	}
	else if ("printString".equals(commandWords[0]))
	{
		return printString(oldString, commandWords);
	}
	else if ("enterNewString".equals(commandWords[0]))
	{
		return enterNewString(oldString, commandWords);
	}
	else
	{
		printHelp("Unknown command: "+commandWords[0]);
		return null;
	}
}

public static void main(String args[])
{
	String theString = START_STRING;
	Scanner s = new Scanner(System.in);
	boolean run = true;
	do
	{
		System.out.print("Enter Command: ");
		String line = s.nextLine();
		String[] commandWords = line.split(" ");
		// Handle "quit" specially.
		if ("quit".equals(commandWords[0]))
		{
			run = false;
		}
		else
		{
			// Everything besides quit should be a command that alters
			// ‘theString‘.
			String newString = handleStringCommand(theString, commandWords);
			if (newString != null)
			{
				theString = newString;
			}
		}
	} while(run == true);
}
}
