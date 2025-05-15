package Custom_Exception;

public class Flipkart {

	private String productName;
	private double price;
	private double ratings;
	
	public String getProductName() {
		return productName;
	}
	
	public void setProductName(String productName) {
		this.productName=productName;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		if(price > 0) {
		this.price=price;}
		else {
			throw new PriceException();
		}
	}
	
	public double getRatings() {
		return ratings;
	}
	
	public void setRatings(double ratings) throws RatingException {
		if (ratings >= 0) {
			this.ratings=ratings;}
		else {
			throw new RatingException();
		}
	}
	
	public Flipkart (String productName , double price  , double ratings) throws RatingException {
		setProductName(productName);
		setPrice(price);
		setRatings(ratings);
		
		
	}
}

