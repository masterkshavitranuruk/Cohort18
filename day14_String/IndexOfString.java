package day14_String;

public class IndexOfString {

	public static void main(String[] args) {
//                     012345678910     17 
		String name = "President George Washington";

		System.out.println(name.indexOf('G')); // 10
		System.out.println(name.indexOf('W')); // 17
		System.out.println(name.indexOf('x')); // -1

		System.out.println(name.indexOf('e')); // 2
		System.out.println(name.indexOf('e', 8));// 11
		System.out.println(name.indexOf('e', 17));// -1
		System.out.println(name.lastIndexOf('e')); // 15//last 

		System.out.println(name.indexOf("eor")); // 11

		System.out.println(name.indexOf("Bob")); // -1

		System.out.println(name.indexOf("dent"));//5

	}

}
