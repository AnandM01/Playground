import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int N = in.nextInt();
      int First_No = N/10;
      int Second_No = N%10;
      int sum = First_No + Second_No ;
      System.out.println(sum);
	}
}