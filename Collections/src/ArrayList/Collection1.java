package ArrayList;

import java.util.ArrayList;

public class Collection1 {
	
	public static void main(String[] args) {
		
	//adding the elements
	ArrayList al1 = new ArrayList();
	al1.add(10);
	al1.add(20);
	al1.add(30);
	al1.add(40);
	System.out.println(al1);
	al1.add(true);
	al1.add(false);
	al1.add(50);
	al1.add(true);
	System.out.println(al1);
	
	//copying form one arraylist object to another using addall
	
	ArrayList al2 = new ArrayList();
	al2.addAll(al1);
	System.out.println(al2);
	
	//remove the data from the object using remove

	System.out.println(al1.remove(true));//returns true if removed successfully
	System.out.println(al1.remove("hello"));//returns false if not present in array
	System.out.println(al1);
	
	
	
	//remove the data from object1 which is same from object 2 using removeall
		
	ArrayList al3 = new ArrayList();
	
	al3.add(10);
	al3.add(20);
	al3.add(30);
	al3.add(40);

//		System.out.println(al3);
//		System.out.println(al1.removeAll(al3));
//		System.out.println(al1);
//		
		
	
	//retaining all the uncommon data from object1 

	System.out.println(al1.retainAll(al3));
	
	System.out.println(al1);

//	//clear all the data from object1 
//
//	al3.clear();
//	
//	System.out.println(al3);
	
	//using add(index, object0)
	al1.add(4,"Sairam");
System.out.println(al1);
System.out.println(al2);

//using addAll(index, object0)

al2.addAll(4,al1);
System.out.println(al1);
System.out.println(al2);


System.out.println(al1.size());
System.out.println(al2.size());
//al1.clear();
//System.out.println(al1.isEmpty());
System.out.println(al1.contains(30));
System.out.println(al1.contains(50));

System.out.println(al2.containsAll(al1));
System.out.println(al1.containsAll(al2));

//Converting collection to array using toarray

System.out.println("*******************");
Object[] array =al1.toArray();
for(int i=0;i<array.length; i++) {
	System.out.println(array[i]);
}


	}
}
