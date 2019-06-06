import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here 
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
     int square = cal_square(num);
      System.out.println(square);
	}
  public static int cal_square(int num)
  {
return num*num;
     // return square;
  }
}
