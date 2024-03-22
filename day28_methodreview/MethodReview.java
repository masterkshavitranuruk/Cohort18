package day28_methodreview;

public class MethodReview {
  // what is the method - a block of code that will be executed when called.
  /*
  (opt) accessModifier - scope of the method
  (opt) static - this method belong to class , or instance of the class
  returnType - what type the data will this method return, if it does't return anything - void
  methodName - should follow the same rule when naming identifier (variable)
             - verb, or actions
             ex.
             sum, add, show, display, equals, indexOf
  (opt) parameter - variable that can be used thru out of the method.
  methodBody - code that executed when the method is called
   */
  //                --method signature---
  //                V                   V
  public static void main(String[] args) {
    // to call method
    sayHi("Bob", 2); // <-- pass argument(s)
    // method chaining
    String importantWord = makeItImportant("stop").substring(1, 4);
    System.out.println(importantWord);

    String grade = getGrade(2000);
    System.out.println(grade);
  }

  // no return type, parameterize
  public static void sayHi(String fname, int times) {
    System.out.println("Hi,");
    System.out.println(fname.repeat(times));
    System.out.println("!");
  }

  public static String makeItImportant(String word) {
    return word.toUpperCase() + "~!!!";
  }

  // return
  // method with if...else
  // birthyear -> grade that student is in
  public static String getGrade(int birthYear) {
    int age = 2024 - birthYear;
    if (age == 6)
      // the method will stop when return is executed
      return "first grade";
    else if (age == 7)
      return "second grade";
    else if (age == 8)
      return "third grade";

    System.out.println("are you sure this is your birth year?");
    return "the year is incorrect";
  }


}
