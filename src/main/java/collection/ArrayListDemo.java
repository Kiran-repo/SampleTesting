package collection;
import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		
		
		List obj=new ArrayList<>();
		
		obj.add("Karna");
		obj.add(500);
		obj.add(true);
		obj.add(10.1);
		obj.add("Arjuna");
		obj.add("Karna");
		obj.add("Bhima");
		
		
		System.out.println("Size of an Array : "+obj.size());
		System.out.println("Printing array elements : "+obj);
		//Insert element in the arraylist
		obj.add(4, "Dharma");
		System.out.println("Printing array elements : "+obj);
//Remove element from arraylist
		obj.remove(3);
		System.out.println("Printing array elements : "+obj);

		//Modify/replace/change
		
		obj.set(5, "Krishna");
		System.out.println("Printing array elements : "+obj);
		
}
}