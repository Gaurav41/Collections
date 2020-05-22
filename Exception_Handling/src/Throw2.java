
public class Throw2 {
	
	static void calculate(){
		int x = 10;
		if(x>=10)
		{
			System.out.println("X == 10");
				try {
					throw new MyException();
				} catch (MyException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
	
	public static void main(String args[])
	{
		calculate();
	}

}
