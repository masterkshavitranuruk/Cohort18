package day31accessModifiers;

public class StringUtilTest {

	public static void main(String[] args) {
		System.out.println(StringUtils.reverseStr("abcd")); // dcba
        System.out.println(StringUtils.reverseStr("a")); // a
        System.out.println(StringUtils.reverseStr(" ")); //  

        
        System.out.println(StringUtils.isPalindrome("abc")); // false
        System.out.println(StringUtils.isPalindrome("aba")); // true
        System.out.println(StringUtils.isPalindrome("ciVIC")); // true
        System.out.println(StringUtils.isPalindrome("HANNAH")); // true
        System.out.println(StringUtils.isPalindrome("123")); // false

        System.out.println(StringUtils.stringCharCount("Hello",'e'));
        System.out.println(StringUtils.stringCharCount("Hello",'l'));
        System.out.println(StringUtils.stringCharCount("Hello",'d'));

        ///
//        input: apple
//        output: a1p2l1e1
        
        String input = "apple";
        
        StringUtils.displayNumberOfOccurenceOfEachCharacter(input);
        StringUtils.displayNumberOfOccurenceOfEachCharacter("level");
        StringUtils.displayNumberOfOccurenceOfEachCharacter("java");

	}

}
