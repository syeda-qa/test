package green;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Lambada {

	//public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	//@Test
	
	public void reguler() {
	
	
	
ArrayList<String> m= new ArrayList<String>();

m.add("Syeda");
m.add("Fatemah");
m.add("Suha");
m.add("Sakin");
m.add("Mou");
int count =0;

for(int i=0; i<m.size();i++) {
	String n = m.get(i);

	if(n.startsWith("S"))	
	{
count++;
	}
}
System.out.println(count);
	}

 // @Test
  public void streamfilter() { 
	  ArrayList<String> mom = new ArrayList<String>();
  
  
  mom.add("Syeda"); 
  mom.add("Fatemah"); 
  mom.add("Suha"); 
  mom.add("Sakin");
  mom.add("Mou");
  
  long c= mom.stream().filter(b->b.startsWith("S")).count();
  
  System.out.println(c); 
   long d =Stream.of("Syeda","Mou","Sakin","Suha","Fatemah").filter(b-> 
   {
  b.startsWith("S"); 
  return true; }).count();
   System.out.println(d);
  
  mom.stream().filter(b->b.length()>4).forEach(b->System.out.println(b));
  
  mom.stream().filter(b->b.length()>4).limit(2).forEach(b->System.out.println(b
  )); 
  }
  
  //@Test 
  public void streammap() {
	  
	  ArrayList<String> mo = new ArrayList<String>();
	  mo.add("Kotkoti"); 
	  mo.add("Buri"); 
	  
  Stream.of("Syeda","Mou","Sakin","Suha","Fatemah").filter(b->b.endsWith("h")).map(b->b.toUpperCase()).
  forEach(b->System.out.println(b));
 
List <String> l = Arrays.asList("Syeda","Mou","Sakin","Suha","Fatemah");
l.stream().filter(b->b.startsWith("S")).sorted().map(b->b.toUpperCase()).
forEach(b->System.out.println(b));

Stream <String> newS= Stream.concat(mo.stream(), l.stream());
newS.sorted().forEach(b->System.out.println(b));

boolean flag = newS.anyMatch(b->b.equalsIgnoreCase("Buri"));
System.out.println(flag);
Assert.assertTrue(flag);
	
  }
  
  @Test
  public void streamcollect() {
	  
	  List <String> lc=Stream.of("Syeda","Mou","Sakin","Suha","Fatemah").filter(b->b.endsWith("a")).map(b->b.toUpperCase())  
	  .collect(Collectors.toList());
	  System.out.println(lc.get(0));
	  System.out.println(lc.get(1));
	  
	  
	  List <Integer> li = Arrays.asList(1,4,5,5,6,7,7,9,8);
	  li.stream().distinct().sorted().forEach(b->System.out.println(b));
	  
	  List<Integer> values=li.stream().distinct().sorted().collect(Collectors.toList());
	  System.out.println(values.get(3));
	  
	  
  }
}