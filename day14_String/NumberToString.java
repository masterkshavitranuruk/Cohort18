package day14_String;

public class NumberToString {

	public static void main(String[] args) {
        int num1 = 10;
        int num2 = 30;
        double num3 = 9.99;
        
        System.out.println(num1 + num2);//40
        
// 3 ways to convert Numbers to Strings
		
// 1. String s = ""+num;
        String strNum1 = ""+num1;
        String strNum2 = ""+num2;
        System.out.println(strNum1);//10
        System.out.println(strNum2);//30
        
        System.out.println(strNum1 + strNum2); //1030	
        String strNum3 = ""+num3;
        System.out.println(strNum3);//9.99
        System.out.println(strNum3.length());//4
        System.out.println(strNum3.substring(2));//99  
        
//2. String s = String.valueOf(num);
        
        String str3 = String.valueOf(num1);
        String str4 = String.valueOf(num2);
        String str5 = String.valueOf(num3);

        String result = str3.concat(str4).concat(str5);
        System.out.println(result);//10309.99
        
//3. String a = Integer.toString(num); Wrapper Class( PREFERRED)!!!!!
        /*
        PrimitiveType        WrapperClass
        
        boolean              Boolean
        byte                 Byte
        char                 Character
        int                  Integer
        short                Short
        long                 Long
        float                Float
        double               Double
        */
        
        String str6 = Integer.toString(num1);
        String str7 = Integer.toString(num2);
        String str8 = Double.toString(num3);
        String result2 = str6+str7+str8;
        System.out.println(result2);//10309.99
   
	}

}
