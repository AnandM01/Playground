import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
   Scanner in=new Scanner(System.in);
		//System.out.print("Enter size of array : ");
		int size=in.nextInt();
		int a[]=new int[size];
		int i=0;
		while(i<a.length)
		{
			//System.out.print("Enter value : ");
			a[i++]=in.nextInt();
		}
		int index=maximum_index(a);
		System.out.println(index);
	  //  System.out.println(a[index]);
} 
	static int maximum_index(int a[])
	{
		int maximum,index=0,i=1;
		maximum=a[0];
		while(i<a.length)
		{
			if(maximum<a[i])
			{
				maximum=a[i];
				index=i;
			}
			i++;
		}
		return index;
}
}
