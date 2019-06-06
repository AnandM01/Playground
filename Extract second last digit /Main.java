import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int num = in.nextInt();
      int Last_2_Digit = ((num/10)%10);
      System.out.println(Last_2_Digit);
	}
}