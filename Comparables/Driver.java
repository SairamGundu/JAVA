package Comparables;

public class Driver {
public static void main(String[] args) {
	laptop a = new laptop("dell", 6900, "Vastro", "i3");
	laptop b = new laptop("HP", 8900, "astro", "i5");
	laptop c = new laptop("dell", 6900, "Vastro", "i3");
	
	System.out.println(a.equals(c));
	System.out.println(a.equals(b));
	System.out.println(a.compareTo(c));
	System.out.println(a.compareTo(b));
}
}
