package basic;

public class StringBufferDemo {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   StringBuffer sb = new StringBuffer("hello");
   sb.append("world");
   System.out.println(sb);
   
   sb.reverse();
   System.out.println(sb);
   
   sb.deleteCharAt(4);
   System.out.println(sb);
   
   sb.delete(4, 7);
   System.out.println(sb);
   
	}

	
}
