package day14_String;

public class Concat {

	public static void main(String[] args) {
		String word1 = "re";
		String word2 = "think";
		String word3 = "ing";
		int num = 2;

		String result1 = word1 + word2 + word3 + num;
		System.out.println(result1);//rethinking2

		String result2 = word1.concat(word2);
		System.out.println(result2); // rethink
		result2 = result2.concat(word3);
		System.out.println(result2);//rethinking

		String result3 = word1.concat(word2).concat(word3);
		System.out.println(result3);//rethinking

		
//--------------------------------------------------//
		String str = "";
		char letter1 = 'a';
		char letter2 = 'b';
		char letter3 = 'c';

		System.out.println(str);
		str += letter1;
		str += letter2;
		str += letter3;
		System.out.println(str); // abc

	}

}
