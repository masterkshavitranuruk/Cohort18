package day12_LoopReview;

public class ControlFlowStatementReview {

	public static void main(String[] args) {
//		# Java Control Flow Statements
//
//		Control flow statements in Java are used to control the execution flow of a program based on certain conditions. They allow you to make decisions, iterate over collections, and execute code blocks multiple times.
//
//		## 1. Conditional Statements
//
//		### 1.1. `if` Statement
//		```java
//		if (condition) {
//		    // code to execute if condition is true
//		}```
//		### 1.2.  'if-else' Statement
//		```java
//		if (condition) {
//		    // code to execute if condition is true
//		} else {
//		    // code to execute if condition is false
//		}```
//
//		### 1.3. `else-if` Ladder
//		```java
//		if (condition1) {
//		    // code to execute if condition1 is true
//		} else if (condition2) {
//		    // code to execute if condition2 is true
//		} else {
//		    // code to execute if all conditions are false
//		}
//		```
//		## 2. Looping Statements
//		### 2.1. 'for' Loop
//		```java
//		for (initialization; condition; update) {
//		    // code to execute repeatedly
//		}
//		```
//		### 2.2. 'while' Loop
//		```java
//		while (condition) {
//		    // code to execute repeatedly as long as condition is true
//		}
//		```
//		### 2.3. 'do-while' Loop
//		```java
//		do {
//		    // code to execute at least once
//		} while (condition);
//		```
//
//		## 3.  Jump Statements
//		### 3.1. 'break' Statement
//		Used to terminate the loop or 'switch' statement it is in.
//
//		### 3.2. 'continue' Statement
//		Skips the current iteration of a loop.
//
//		### 3.3.  'return' Statement
//		Used to exit from a method and optionally 'return' a value.
//
//		### 4. Switch Statement
//		```java
//		switch (expression) {
//		    case value1:
//		        // code to execute if expression equals value1
//		        break;
//		    case value2:
//		        // code to execute if expression equals value2
//		        break;
//		    // more cases...
//		    default:
//		        // code to execute if expression doesn't match any case
//		}```

		
		
		  // While Loop

	    /*

	    while (boolean_condition) { // if condition true
	      // code that repeated
	      // until the condition return false
	    }

	    */

	    int counter = 0;
	    //         A
	    while (counter < 5) {
	      // B
	      System.out.println("Hi");
	      System.out.println("Hello World");
	      System.out.println("Counter is: " + counter);
	      counter = counter + 1;  // same as counter++;
	    }
	    // C
	    System.out.println("loop has stopped");
	    System.out.println("Counter is finished at: " + counter);

	    // A (true) -> B -> A (true) -> B -> A (true) -> B -> A (false) -> C


	    System.out.println("========");


	    // if loop have 1 line of code
	    int i = 0;
	    while (i < 3) {
	      System.out.println("Hey !! " + (i++));
	    }
	    System.out.println("end~~@!");
	}

}
