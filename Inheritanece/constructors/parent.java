package Inheritanece.constructors;

public class parent {
	// Parent class (Super Class)
	
	    static {
	        System.out.println("Parent Static Block");
	    }

	    // Non-Static Block
	    {
	        System.out.println("Parent Non-Static Block");
	    }

	    // Constructor
	    public parent() {
	        System.out.println("Parent Constructor");
	    }
	
}

