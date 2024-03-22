package day06_Operators;

public class Logical {

	public static void main(String[] args) {
	       // && (AND) , || (OR) , ! (NOT)
        
//      && 
      
//      CondiditionA conditionB  result
      
//      true          true        true
//      
//      true          false       false
//      
//      false         true        false
//      
//      false         false        false
      
      
      boolean conditionA = true;
      boolean conditionB = false;
      boolean conditionC = true;
      
      System.out.println(conditionA && conditionB); // 
      System.out.println(conditionA && conditionC); // true
      System.out.println(conditionA && conditionB && conditionC);
      
      int a = 5;
      int b = 10 ;
      int c = 15;
      
      System.out.println(a < b && c - a == b);
      
      System.out.println(a * b < c/3 && c / a == 3);
      
      
      // || (OR)
      
//      CondiditionA conditionB  result
//      true          true        true 
//      true          false       true
//      false         true        true 
//      false         false       false 
      System.out.println(conditionA && conditionB);
      System.out.println(conditionA || conditionB);
      
      System.out.println(c - a == b || b > c);
      
      System.out.println(c - a >= b || b > c);
      
      
      // ! (NOT)
      
//      conditionA = true;
//      conditionB = false;
      
//      !conditionA = false
//      !conditionB = true
      
      conditionA = true;
      conditionB = false;
      
      
      System.out.println(conditionA);
      System.out.println(!conditionA);
      System.out.println(!conditionB);
      
      System.out.println(conditionA);
      System.out.println(!conditionA);
      System.out.println(!!!!!!!!!!conditionA);		
	}

}
