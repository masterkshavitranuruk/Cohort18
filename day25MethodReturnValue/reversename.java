package day25MethodReturnValue;

import java.util.Arrays;

public class reversename {
	public static void main(String[] args) {
		String input[] = { "MasterK", "Enya", "Keira", " Som" };// Non Primitive
		String printOut[] = new String[input.length];

		int index = 0;
		for (String name : input) {
			printOut[index] = reverseNameMethodArray(name);
			index++;
		}
		System.out.println(Arrays.toString(printOut));
	}

	
	
	
	public static String reverseNameMethodArray(String name) {
		String input = name;
		String output = "";
		for (int i = input.length() - 1; i >= 0; i--) {
			output += input.charAt(i); // Primitive dataType: char
		}
		System.out.println(output);
		return output;
	}

}
