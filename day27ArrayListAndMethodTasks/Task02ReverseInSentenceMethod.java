package day27ArrayListAndMethodTasks;

import java.util.ArrayList;

public class Task02ReverseInSentenceMethod {

	public static void main(String[] args) {
	    
//	    Create a method that accepts an arraylist of string, and a word to search 
//	    if the word exists return the index position of the word.
//	            
//	    Input: ArrayList: ["apple", "banana", "orange", "grape"], Element to search: "orange"
//	    Output: Index of "orange": 2
        
        ArrayList<String> list = new ArrayList<>(Arrays.asList("apple", "banana", "orange", "grape"));
        
        System.out.println(list);
    
        System.out.println(getIndexPositionOfTheGivenWord(list , "mango"));
        System.out.println(getIndexPositionOfTheGivenWord(list , "apple"));
        System.out.println(getIndexPositionOfTheGivenWord(list , "orange"));

    }
    
    
    public static int getIndexPositionOfTheGivenWord(ArrayList<String> list , String word) {

        int indexPosition = -1;
        
        for (int i = 0 ; i < list.size() ; i++) {
            if (list.get(i).equalsIgnoreCase(word)) {
                indexPosition =  i;
            }
        }
        
        return indexPosition ;
        
    }
    
}

