class Sample{
public static void demo()
{
System.out.println("Demo Starts");
program();
System.out.println("Demo Ends");
}
public static void main(String [] args)
{
System.out.println("Main Starts");
demo();
demo();
System.out.println("Main Ends");
}
public static void program()
{
System.out.println("Program Starts");
System.out.println("Program Ends");
}



}