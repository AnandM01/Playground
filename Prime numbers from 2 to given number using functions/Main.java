import java.util.Scanner;
class Main{
	public static void main (String[] args){
   int limit = new Scanner(System.in).nextInt();
   for(int number = 2; number<=limit; number++){
                  if(isPrime(number)){
              System.out.println(number);
          }
      }
    }
 public static boolean isPrime(int number){
        for(int i=2; i<number; i++){
           if(number%i == 0){
               return false; 
           }
        }
        return true; 
}
}