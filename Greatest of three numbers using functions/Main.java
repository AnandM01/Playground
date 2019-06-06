import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner sc = new Scanner(System.in) ;
      int n1=sc.nextInt();
       int n2=sc.nextInt();
        int n3=sc.nextInt();
      int b = great(n1,n2);
      if( b > n3)
        System.out.println(b);
        else
       System.out.println(n3);
     
	}
  public static int great(int n1, int n2){
  if(n1>n2)
   return n1;
    else
      return n2;
  }
}