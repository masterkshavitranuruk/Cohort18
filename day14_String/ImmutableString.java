package day14_String;

public class ImmutableString {

	public static void main(String[] args) {
		String str = "Hello World";
		String str1 = "Hello";
		String str2 = "World";
		String str3 = str1+str2;
		System.out.println(str);//Hello World
		System.out.println(str3);//HelloWorld
		System.out.println(str==str3);//false
		System.out.println(str.toUpperCase());//HELLO WORLD
        System.out.println(str);//Hello World
		
		
		
	}

}
