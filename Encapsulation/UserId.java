package Encapsulation;

public class UserId {
public static void main(String[] args) {
	Atm a = new Atm();
	
	a.setId(1010);
	a.setLocation("vashi");
	a.setCash(20000);
	System.out.println(a.getId());
	System.out.println(a.getLocation());
	System.out.println(a.getCash());


}

}
