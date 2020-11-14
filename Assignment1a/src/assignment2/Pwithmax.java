package assignment2;

public class Pwithmax {

	public static void main(String[] args) {
	
	int x[]= {73,72,04,62,59};
	
	int max1=0;
	int max2=0;
	int max3=0;
	
	for(int i=0;i<x.length;i++) {
		
		if(x[i]>max1) {
			
			max3=max2;
			max2=max1;
			max1=x[i];
			
		}
		else if(x[i]>max2) {
			
			max3=max2;
			max2=x[i];
		
	}
		else if(x[i]>max3) {
			
			max3=x[i];
		}
		
	

}
	System.out.println("Maximumnum 1=" +max1);
	System.out.println("Maximumnum 2=" +max2);
	System.out.println("Maximumnum 3=" +max3);
	
}
}

