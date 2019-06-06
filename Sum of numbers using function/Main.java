import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
     int sum = sum_of_numbers(num);
      System.out.println(sum);
	}
  public static int sum_of_numbers(int num)
  {
 if(num !=0)
  return num + sum_of_numbers(num-1) ;
    else 
     return num;
  }
}