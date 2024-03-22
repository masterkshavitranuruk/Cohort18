package day28_methodreview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListReview {
  // ArrayList -
  // - size is changable, not fixed
  // - can only store reference variable (no int, char, boolean)
  // - use index to access the data (0 base index)

  public static void main(String[] args) {
    ArrayList<String> sportList = new ArrayList<>();
    sportList.add("football");
    sportList.add("golf");
    sportList.add("swimming");

    System.out.println("After add: " + sportList);
//    sportList.remove(2);
//    System.out.println("After remove: " + sportList);

    System.out.println("Get the first element: "
        + sportList.get(0));
    System.out.println("Get the last element: "
        + sportList.get(sportList.size()-1));

    // Util method from Collections class
    Collections.sort(sportList);
    System.out.println("Sorted list: " + sportList);
    Collections.reverse(sportList);
    System.out.println("Reverse list: " + sportList);

    // Using List interface to help initialize arraylist
    List<String> list1 = new ArrayList<>(
        List.of("1", "2", "3", "4", "5")
    );
    list1.addAll(List.of("1", "2", "3", "4", "5"));
    System.out.println(list1);


    // Wrapper Class
    /**
     * byte, short, int, long -> Byte, Short, Integer, Long
     * float, double -> Float, Double
     * char -> Character
     * boolean -> Boolean
     */

    ArrayList<Byte> byteList1 = new ArrayList<>();
    ArrayList<ArrayList<String>> booleanList1 = new ArrayList<>();
    booleanList1.add(new ArrayList<>(List.of("1","2")));

    // To loop arraylist
    for (int i = 0; i < sportList.size(); i++) {
      System.out.println(sportList.get(i));
    }

    for (var e :
        booleanList1) {
      System.out.println(e);
    }

    // how to use var
    // var is the keyword that use to copy
    // the dataType of another side of assignment operater

    var word = "my string";
    var number = 45.56;
    var myList = new ArrayList<Integer>();
    var names = new int[10];

    // cannot use it to declare variable
    // var isElligible; // this will not work


  }
}
