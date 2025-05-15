package comparator;

import java.util.Comparator;

public class SortByBrand implements Comparator{
	
	@Override
	public int compare(Object o1 , Object o2) {
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;
		
//		if (m1.brand.compareTo(m2.brand)>0)
//			return 1;
//		else if (m1.brand.compareTo(m2.brand)<0)
//			return -1;
//		else 
//			return 0

		return m1.brand.compareTo(m2.brand);
		
	}

}
