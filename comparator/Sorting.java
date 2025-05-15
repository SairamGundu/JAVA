package comparator;

import java.util.Arrays;

public class Sorting {
public static void main(String[] args) {
	
	Mobile [] m = { new Mobile("Samsung", 50000, "s23", 8),
			new Mobile("Apple", 70000, "Iphone16", 12),
			new Mobile("Oppo", 25000, "f20", 6),
			new Mobile("vivo", 29000, "v40", 12),
	};
	
	System.out.println("Mobile Objects Before Sorting");
	System.out.println("**********************");
	for(int i=0; i< m.length; i++) {
		System.out.println(m[i].brand +" "+m[i].price+" "+m[i].model+ " " +m[i].ram );
	}
	
	System.out.println( );
	
	SortByPrice s1 = new SortByPrice();
	Arrays.sort(m, s1);
	
	System.out.println("Mobile Objects After Sorting  By Price");
	System.out.println("**********************");
	for(int i=0; i< m.length; i++) {
		System.out.println(m[i].brand +" "+m[i].price+" "+m[i].model+ " " +m[i].ram );
	}
	
System.out.println( );
	
	SortByBrand s2 = new SortByBrand();
	Arrays.sort(m, s2);
	
	System.out.println("Mobile Objects After Sorting  By Brand");
	System.out.println("**********************");
	for(int i=0; i< m.length; i++) {
		System.out.println(m[i].brand +" "+m[i].price+" "+m[i].model+ " " +m[i].ram );
	}

System.out.println( );
	
	SortByModel s3 = new SortByModel();
	Arrays.sort(m, s3);
	
	System.out.println("Mobile Objects After Sorting  By Model");
	System.out.println("**********************");
	for(int i=0; i< m.length; i++) {
		System.out.println(m[i].brand +" "+m[i].price+" "+m[i].model+ " " +m[i].ram );
	}
	
System.out.println( );
	
	SortByRam s4 = new SortByRam();
	Arrays.sort(m, s4);
	
	System.out.println("Mobile Objects After Sorting  By Ram");
	System.out.println("**********************");
	for(int i=0; i< m.length; i++) {
		System.out.println(m[i].brand +" "+m[i].price+" "+m[i].model+ " " +m[i].ram );
	}
}
	
}
