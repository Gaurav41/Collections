
public class Throws_clause {

	public static void main(String[] args)/*throws Exception */{
		try {
			divide();
		} catch (Exception e) {
			System.out.println("Throws exception is hadled here");
			System.out.println(e);
			e.printStackTrace();
		}

	}
	
	static void divide() throws Exception{ // thows exception must be handled in mwthod call block
		int x = 5/0;
		System.out.println("value of x= "+x);
	}

}
