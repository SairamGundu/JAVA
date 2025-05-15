package Custom_Exception;

public class Driver {
	public static void main(String[] args) {
		try {
		Flipkart f1 = new Flipkart ("dell" , 100 , -4.0);
		System.out.println("Name of the product is: "+ f1.getProductName());
		System.out.println("Price of the product is: "+ f1.getPrice());
		System.out.println("Ratings of the product is: "+ f1.getRatings());
		}
		catch(PriceException e) {
			System.out.println("Exception Occured");
			System.out.println("Please enter price greater than zero");
		}
		catch(RatingException e) {
			System.out.println("Error occured");
			System.out.println("Please enter rating greater than equal to zero");
		}
		
	}

}
