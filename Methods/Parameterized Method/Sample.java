class Sample{
public static void main(String [] args)
{
System.out.println("Main Starts");
sub(50,10,12);
System.out.println("Main Ends");
}
public static void sub(int a, int b, int c){
System.out.println("Subtraction Starts");
System.out.println("The subtraction of two numbers is " + (a-b-c));
System.out.println("Subtraction Ends");
}
}