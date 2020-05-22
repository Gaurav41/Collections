
public class Throw_clause {

	static void calculate()
	{try {
		int x=0;
		while(x<=10)
		{
		x++;
			
		}
	
		if(x>=10)
		{
			System.out.println("X == 10");
				throw new Exception();
		}
		} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	
	
	
	public static void main(String args[])
	{
		calculate();
	}
}
