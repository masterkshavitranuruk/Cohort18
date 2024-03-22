package day15_StringTask;

public class AccessingEachCharacterOfString {

	public static void main(String[] args) {
//      0123
		String str = "java";

		System.out.println(str.charAt(0)); // j
		System.out.println(str.charAt(1));
		System.out.println(str.charAt(2));
		System.out.println(str.charAt(3));
//         01234
		String str2 = "Apple";
		System.out.println(str2.charAt(0));
		System.out.println(str2.charAt(1));
		System.out.println(str2.charAt(2));
		System.out.println(str2.charAt(3));
		System.out.println(str2.charAt(4));

		for (int i = 0; i < 4; i++) {
//System.out.println(i); //  0 1 2 3
			System.out.println(str.charAt(i));

		}

		System.out.println("------------------------");

		for (int i = 0; i < str.length(); i++) {
//System.out.println(i); //  0 1 2 3
			System.out.println(str.charAt(i));

		}

		System.out.println("------------------------");

		for (int i = 0; i < 5; i++) {
			System.out.println(i); // 0 1 2 3 4
		}

		System.out.println("------------------------");

		for (int i = 0; i < str2.length(); i++) {
			System.out.println(i); // 0 1 2 3 4
		}

		System.out.println("------------------------");

		for (int i = 0; i < str2.length(); i++) {
			System.out.println(str2.charAt(i));
		}

	}

}
