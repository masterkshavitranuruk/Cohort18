package day26ArrayList;

import java.util.ArrayList;

public class StudentNameList {

	public static void main(String[] args) {

		ArrayList<String> names = new ArrayList<>();
        
        System.out.println(names);//[]
        
        System.out.println(names.size());//0
        
        names.add("Leng");
        names.add("SK");
        names.add("Bilal");
        
        System.out.println(names.size());//3

        System.out.println(names);//[Leng, SK, Bilal]
        
        
        names.add("Leng");
        names.add("SK");
        names.add("Bilal");
        
        
        System.out.println(names.size()); // 6
//                                      0     1    2     3     4    5
        System.out.println(names); // [Leng, SK, Bilal, Leng, SK, Bilal]
                                   
        
        names.set(3, "Gulfire");
        System.out.println(names);// [Leng, SK, Bilal, Gulfire, SK, Bilal]
        
        names.remove(4);
        
        System.out.println(names);//[Leng, SK, Bilal, Gulfire, Bilal]
        
        names.remove("Bilal");
        
        System.out.println(names);


        names.remove("Bilal");
        
        System.out.println(names);
        
        names.remove("Bilal");
        
        System.out.println(names);



	}

}
