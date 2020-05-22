// This is example of finally block
public class Except {

	
	public static void main(String args[])
	{
		try{
			int x=0;
			int y=5/x;
			
		}catch(ArithmeticException e)
		{
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("this block statement executed in any condition");
		}
	}
}
