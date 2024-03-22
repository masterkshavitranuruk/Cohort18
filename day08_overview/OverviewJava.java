package day08_overview;

public class OverviewJava {

	public static void main(String[] args) {
		   /*
        Variables:
        Variables are containers for storing data values.
        
        syntax:
        dataType variableName = value;
        
        dataType --> String or int or byte or short ....
        variableName --> the name of your variables like age, name , year, make or model....
        
        value --> "TechCircle" , 4,6,7 or true or false ,, 'a' or 'z'
        
        String name = "TechCircle";
        int year = 2024;
        boolean result = true;
        
        type of variables
        non primitive type:  String , Array, List , Map
        primitive types
            - boolean 
                --> true or false
            - char 
                --> single character just like 'a' or '5' or '*'....
            - byte 
            - short
            - int
            - long
                --> whole number.
            
            - float
            - double
                --> 9.99 or 3.14...
            
        Operators:
            int A = 10; 
            int B = 2;
            int total = 0
            Arithmetic 
                - addition(+)
                    --> A + B 
                        total = 10 + 2
                        total = 12;
                - subtraction(-)
                      --> A - B
                          total = 10 - 2
                          total = 8;
                - multiplication(*)
                      --> A * B
                          total = 10 * 2
                          total = 20;
                - division(/)
                    --> A / B
                        total = 10 / 2
                        total = 5;
                - Remainder(%)
                    --> A % B
                        total = 10 % 2
                        total = 0;
                - Decrement(--)
                        A--; // A = A -1
                        // value of A is 9
                - Increment(++)
                        B++;  // B  = B + 1;
                        //B = 3
            Relational:
                Relational operator always returns a boolean
                greater than(>)
                less than(<)
                greater than equal(>=)
                less than equal(<=)
                equal(==)
                not equal(!=)
            
            
            Assignment:
                assignment operator(=)
                plus equal(+=)
                minus equal(-=)
                multiplyEqual(*=)
                devide equal(/=)
                
            Logical
                AND(&&)
                OR (|| )
                NOT (!)
            
            
            
        Ternary:
        
        variable = (Condition) ? trueValue : falseValue;
        
        
        PEMDAS: execution Order
        
        Control flow statements:
            if statement
            
            syntax:
            if (booleanCondition){
                //this code will execute when the condition is true
            }else{
                // this code will execute when the condition is false
            }
            
            
            omitting else part
            if (booleanCondition){
                //this code will execute when the condition is true
            }
            
            nested if statement
            if (condition1){
                if (condition2){
                    // this code will execute if both condition1 and condition2 are true
                }else{
                    // this code will execute if the condition1 is the and the condition2 is false
                }
                 
            }else{
                // this code will execute when the condition1 is false
            }
            
            
        */
        
        
        /*
            multi line comment
         */
		
		
		  /*Example in class
		   * 
		   * Given 2 ints, a and b,
	         * return true if one of them is 10
	         * or if their sum is 10.
	         *
	         * makes10(9, 10) → true
	         * makes10(9, 9) → false
	         * makes10(1, 9) → true
	         * makes10(12, -2) → true
	         */
	        
	        int a  = 12;
	        int b = -2;
	        
	        boolean isA10 = a == 10;
	        //System.out.println(isA10);
	        
	        boolean isB10 = b == 10;
	        
	        //System.out.println(isB10);
	        
	        boolean isAPlusB10 = (a + b) == 10;
	        
	        //System.out.println(isAPlusB10);
	        
	        
	        if (isA10 || isB10 || isAPlusB10) {
	            System.out.println(true);
	        }else {
	            System.out.println(false);
	        }
	        
	        
	        if (a == 10 || b == 10 || a+b == 10) {
	            System.out.println(true);
	        }else {
	            System.out.println(false);
	        }   

	}

}
