package ArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ForEach {
public static void main(String[] args) {
	ArrayList <Integer> a1 = new ArrayList();
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	a1.add(20);
	a1.add(30);
	a1.add(40);
	a1.add(50);
	
	for (Integer i : a1) {
		System.out.println(i);
	}
	
	System.out.println("***************");
	
	for (int i = 0; i < a1.size(); i++) {
		
		System.out.println(a1.get(i));
		
	}
	
	System.out.println("***************");
	
	System.out.println(a1.indexOf(30));
	System.out.println(a1.lastIndexOf(30));
}
}
