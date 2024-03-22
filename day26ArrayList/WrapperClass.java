package day26ArrayList;
import java.util.ArrayList;
public class WrapperClass {

	public static void main(String[] args) {
	       /*
        Autoboxing: Converting a primitive value into an object of the corresponding wrapper class is called autoboxing. For example, converting int to Integer class. The Java compiler applies autoboxing when a primitive value is:
            Passed as a parameter to a method that expects an object of the corresponding wrapper class.
            Assigned to a variable of the corresponding wrapper class.
            
        Unboxing: Converting an object of a wrapper type to its corresponding primitive value is called unboxing. For example conversion of Integer to int. The Java compiler applies unboxing when an object of a wrapper class is:
            Passed as a parameter to a method that expects a value of the corresponding primitive type.
            Assigned to a variable of the corresponding primitive type.
            
            Primitive Types        ObjectType
            char                   Character
            byte                   Byte
            short                  Short
            int                    Integer
            long                   Long
            float                  Float
            double                 Double
            boolean                Boolean
            
            char --> Character called autoboxing
            Character --> char called unboxing
            
            
            
        */

        ArrayList<Integer> list = new ArrayList<>();
        
        
//        Autoboxing: Converting a primitive value into an object of the corresponding wrapper class
        
        int num = 1000;
        System.out.println(num); //10
//        System.out.println(num);
        
        Integer num2 = num; // autoboxing
        
        System.out.println(num2);
        System.out.println(num2.toString().length()); //
        
        
        double value = 9.99;
        Double value2 = value;
        
        System.out.println(value);
        System.out.println(value2);
        System.out.println(value2.toString().charAt(1));// 
        System.out.println(value2.toString().substring(1)); // .99
        
        
        char letter = 'a';
        
        Character letter2 = letter;
        
        System.out.println(letter);
        System.out.println(letter2);
        System.out.println(letter2.isUpperCase(letter));

        
//        Converting an object of a wrapper type to its corresponding primitive value is called unboxing.
        
        Float num3 = new Float(9.99);
        
        float num4 = num3.floatValue();
        
        System.out.println(num4);
        
        
        

	}

}
