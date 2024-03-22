package day13_nestedLoop;

public class Timer {

	public static void main(String[] args) throws InterruptedException {
		//Develop a simple timer application in Java that utilizes nested for loops and 
//      the Scanner class to implement a countdown functionality. 
//      The timer will display a countdown from a user-specified starting time to zero, 
//      with each second represented by an iteration of the outer loop and each millisecond represented
//      by an iteration of the inner loop.
      
      
//      Input:
//          The user is prompted to input the countdown time in minutes. 
//          The input should be an integer representing the number of minutes for the countdown.
//
//      Output:
//          The application displays the countdown timer on the console window in the format mm:ss, 
//          where mm represents minutes and ss represents seconds. Each second of the countdown is 
//          displayed sequentially until the timer reaches zero. After the countdown finishes, 
//          the application prints a message indicating that the countdown has finished.
      
      
      
//      Input:
//          Enter the countdown time in minutes: 2
//
//          Output:
//          Starting countdown...
//          02:00
//          01:59
//          01:58
//          ...
//          00:02
//          00:01
//          00:00
//          Countdown finished!

 int countdown = 2;
 int second =59;
 
 for(int mm=countdown-1; mm>=0;mm--) {
//	 System.out.println(mm);
	 for(int ss = second;ss>=0;ss-- )
		 System.out.println(mm+":"+ss);
	Thread.sleep(10);
 }
		
 System.err.println("Countdown finished!");
	}

}
