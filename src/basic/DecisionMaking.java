package basic;

public class DecisionMaking {

	public static void main(String[] args) {
	
		//x & y
		//x>y, y>x, x=y, ERROR
		
		//if ... else
		
		int x = 125;
		int y = 25;
		
		if(x>y)
			System.out.println("X is bigger");
		else if (y>x)
			System.out.println("Y is bigger");
		else if (x==y)
			System.out.println("X and Y are the same");
		else
			System.out.println("ERROR");
	}

}
