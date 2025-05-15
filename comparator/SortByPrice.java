package comparator;

import java.util.Comparator;

public class SortByPrice implements Comparator{
	
	@Override
	public int compare(Object o1, Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2= (Mobile ) o2;
		
//		if(m1.price>m2.price)
//			return 1;
//		else if(m2.price>m1.price)
//			return -1;
//		else
//			return 0;
		
		return(int) (m1.price- m2.price);//Single line and upcasting it
		
	}

}
