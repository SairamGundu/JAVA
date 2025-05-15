package comparator;

import java.util.Comparator;

public class SortByModel implements Comparator {
	
	@Override
	public int compare(Object o1, Object o2) {
		
		Mobile m1 = (Mobile) o1;
		Mobile m2 = (Mobile) o2;
		
//		if (m1.model.compareTo(m2.model)>0)
//			return 1;
//		else if (m1.model.compareTo(m2.model)<0)//String type implements comparable i.e. .equals()
//			return -1;
//		else 
//			return 0;
		
		return m2.model.compareTo(m1.model);


		
	}
	
	

}
