package ArrayList;

import java.util.*;

public class Generics {

	public static void main(String[] args) {
		//To enter the data in integer format only use <Integer>
		ArrayList <Integer> a1 = new ArrayList<Integer>();
		a1.add(10);
		a1.add(20);
		a1.add(30);
		a1.add(40);
		a1.add(50);
		System.out.println(a1);
		
		//Iterator
		Iterator<Integer> i = a1.iterator();
		
		// 1st method to iterate the object from and array
		//use hasNext() to check weather the object is present in the index or not if yes it will return true 
//		if yes then use next() to display the object
		//System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
//		System.out.println(i.hasNext());
//		System.out.println(i.next());
		
		// To reduce the lines of code use declare the lines in while loop
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		
		System.out.println("****************");
		// to reverse the order use ListIterator
	
		//use Size() to move the cursor Pointer to the end of the ArrayList 
		ListIterator <Integer> l = a1.listIterator(a1.size());
		while(l.hasPrevious()) {//use hasPrevius() to check weather the object is present in the index or not if yes it will return true 
//			if yes then use previous() to display the object
			System.out.println(l.previous());
			
		}
		
		
		
		
		
	}
}
