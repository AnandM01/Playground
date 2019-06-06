import java.util.Scanner;
class Main{
	public static void main(String[] args) 
  	{ 
      // Type your code here  
      Scanner sc = new Scanner(System.in);
       String str = sc.nextLine();
         String str1 = sc.nextLine();
   String str2 = sc.nextLine();
         // Replace all the 'dog' with 'cat'.
        String new_str = str.replaceAll(str1, str2);
       
         // Display the strings for comparison.
   
        System.out.println( new_str);
    }
}