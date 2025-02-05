public class Pig {

    /*
    * Create a method "pigLatin" that takes a string consisting of one or more 
    * all-lowercase words separated by spaces. It should return a new string 
    * converted to "pig Latin," where each word has its first letter moved to 
    * the back and the letters "ay" are added to the end of the word. However, 
    * words starting with a vowel (a, e, i, o, or u) should not be altered.
    *
    * Examples:
    *
    * pigLatin("something")  should return "omethingsay"
    * pigLatin("awesome")    should return "awesome" (words starting with a vowel should not be altered)
    * pigLatin("latin is a hard language")  should return "atinlay is a ardhay anguagelay"
    * pigLatin("y")  should return "yay"
    * pigLatin("e")   should return "e"
    */
    public static void main(String[] args) {
        // Test cases
        assertEqual(1, pigLatin("something"), "omethingsay");
        assertEqual(2, pigLatin("awesome"), "awesome");
        assertEqual(3, pigLatin("latin is a hard language"), "atinlay is a ardhay anguagelay");
        assertEqual(4, pigLatin("y"), "yay");
        assertEqual(5, pigLatin("e"), "e");
    }

    // Implement your solution here!
    public static String pigLatin(String sentence)
    {
        
        String[] words = sentence.split(" ");

        String result = "";

        for(String word : words)
        {
            result += singleWord(word);
            result += " ";
        }
        
        result = result.substring(0, result.length() - 1);

        return result;

    }

    public static String singleWord(String word)
    {

        String added = "ay";
        String newWord = "";
        
        
        char firstLetter = word.charAt(0);
        if(firstLetter == 'a' || firstLetter == 'e' || firstLetter == 'i' || firstLetter == 'o' || firstLetter == 'u')
        {
            newWord = word;
        }
        else
        {
            String result = word.substring(1);
            result += firstLetter;
            result += added;
            newWord = result;
        }
        
        return newWord;
    }









    // Method to help with testing, you do not need to read this.
    public static void assertEqual(int testNumber, String actual, String expected) {
        if (!expected.equals(actual)) {
        System.out.println("Test " + testNumber + " failed! Expected: '" + expected + "', but got: '" + actual + "'");
        } else {
        System.out.println("Test " + testNumber + " passed!");
        }
    }
    }
  
  