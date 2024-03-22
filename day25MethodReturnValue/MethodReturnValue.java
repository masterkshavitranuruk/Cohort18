 package day25MethodReturnValue;
 import java.util.Arrays;

 public class MethodReturnValue {

     public static int addition(int a , int b) {
         int result = a + b;
         return result;
     }
     
     public static void intArraySort(int arr[]) {        
         Arrays.sort(arr);
     }
     
     public static int getMaxValueFromAnIntArray(int arr[]) {
         intArraySort(arr);
         return arr[arr.length -1];
     }
     
     
     public static String getFullName(String first , String last) {
         String str1 = first.toUpperCase();
         String str2 = first.toLowerCase();
         
         String str3 = last.toUpperCase();
         String str4 = last.toLowerCase();
         
         String fullName = str1.charAt(0)+str2.substring(1)+ " "+str3.charAt(0)+str4.substring(1);
         
         return fullName;
     }
     
     
     
     
     
     
 }


 

