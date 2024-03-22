package day15_StringTask;

public class VowelCount {

	public static void main(String[] args) {

		
		//Solution #1
		String srt = "java";

		int vowelCount = 0;
		int consonantCount = 0;
		
		for (int i = 0; i <srt.length(); i++) {
	
			if (srt.charAt(i) == 'a' || srt.charAt(i) == 'e' || srt.charAt(i) == 'i' || srt.charAt(i) == 'o'
					|| srt.charAt(i) == 'u') {
				vowelCount++;
			}else {
				consonantCount++;
			}
		
		}	
		System.out.println(vowelCount);
		System.out.println(consonantCount);

// Solution #2
		String vowels ="aeiou";
//		System.out.println(vowels.indexOf('a'));//0
//		System.out.println(vowels.indexOf('i'));//2
//		System.out.println(vowels.indexOf('t'));//-1
//		System.out.println(vowels.indexOf('r'));//-1
		
		for (int i = 0; i <srt.length(); i++) {
			
			if (vowels.indexOf(srt.charAt(i)) >-1 ) {
				vowelCount++;
			}else {
				consonantCount++;
			}
		}
	}

}
