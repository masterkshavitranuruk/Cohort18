package day28_methodreview;

public class MethodOverloadingReview {
  // method overloading -
  /*
    - methods that in the same class
    - same name
    - but difference signature (diff params)
   */
  public static void main(String[] args) {
    printSum2(2,3);
    printSum3(4,20, -5);
    printSum(2, 3); // run printSum(a,b)
    printSum(2, 3,67); // run printSum(a,b,c)
  }

  // if method overloading doesn't apply
  static void printSum2(int a, int b) {
    System.out.println(a + b);
  }

  // how to add custom document to your method
  /**
   * print the total of 3 number on the console
   * @param a number 1
   * @param b number 2
   * @param c number 3
   */
  static void printSum3(int a, int b, int c) {
    System.out.println(a + b + c);
  }

  // apply method overloading
  static void printSum(int a, int b) {
    System.out.println(a + b);
  }
  static void printSum(int a, int b, int c) {
    System.out.println(a + b + c);
  }
}
