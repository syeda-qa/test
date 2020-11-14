package assignment2;

public class Functions {
	void multiple(int e, int f) {
		int m=e*f;
		System.out.println(m);
	}
	
	double sub (double g,double h) {
		double s;
		if (g>h) {
			s=g-h;
		}
		else {
			s=h-g;
		
		}
		
		return s;

	}

	public static void main(String[] args) {
		Functions R1= new Functions();
		R1.multiple(10, 10);
		
		double s=R1.sub(30.5,10.5);
		System.out.println(s);
		
		
		
	}
	
	

}
