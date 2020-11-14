package basic;

public class Max2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		int [] x= {1,2,3,4,5,6,7,8};
		int maxOne=0;
		int maxTwo=-1;
		for (int i=0; i<x.length; i++) {
			if (x[i]> maxOne) {
				maxTwo = maxOne;
				maxOne = x[i];
			}//end of if
			else if (x[i]> maxTwo)
				maxTwo = x[i];
		}//end of for
		System.out.println(maxOne);
		System.out.println(maxTwo);

	}

}
