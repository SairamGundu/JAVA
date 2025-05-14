package Multi_level_inheritance;

public class Son extends Father {

 String name ="sai";
 
 public void fam() {
	 System.out.println("Grandfather name is:" + sname);
	 System.out.println("Father name is "+ super.name);
	 System.out.println("Son name is " + name);
	 
	 
 }
}
