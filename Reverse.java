/*4. Design method public int getReverseNumber(int num) which return int 
value to that method and result print into main method.*/

public class Reverse
{
	
	public int getReverseNumber(int num) 
	{
		
		int reversed=0;
		for (;num>0; num/=10) ///1234
		{
			int digit= num % 10;
			reversed= reversed * 10 + digit;
		}
		return reversed;
	}
	
	public static void main(String args[])
	 {
		
		Reverse reverse=new Reverse();
		int res=reverse.getReverseNumber(1234);
		System.out.print(res);
		
	}
	
	

	
	
}
