package day31accessModifiers;

public class StringUtils {
	 // Reverse String
    public static String reverseStr(String input) {
        StringBuilder sb = new StringBuilder(input);
        return sb.reverse().toString();
    }

    // IsPalindrome
    public static boolean isPalindrome(String input) {
        return input.equalsIgnoreCase(reverseStr(input));
    }

    // CharCount
    public static int stringCharCount(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // UniqueChars
    public static String uniqueChars(String input) {
        String unique = "";
        for (int i = 0; i < input.length(); i++) {
            if (!unique.contains(Character.toString(input.charAt(i)))) {
                unique += input.charAt(i);
            }
        }
        return unique;
    }
    
    // ExtractDigitsFromAString
    
    public static String extractDigitFromAString(String input) {
        String output = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                output += input.charAt(i);
            }
        }
        
        return output;
    }

    
public static void displayNumberOfOccurenceOfEachCharacter(String input ) {
        
        String unique = uniqueChars(input);
        String output = "";
        for (char c : unique.toCharArray()) {
            output += c;
            output +=stringCharCount(input,c);
        }
        
        System.out.println(output);
    }
      
    
    

}
