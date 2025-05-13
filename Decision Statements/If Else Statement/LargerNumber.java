import java.util.Scanner;

public class LargerNumber{
public static void main(String [] args)
{

Scanner sc = new Scanner(System.in);
System.out.print("Enter The First Number: ");
int first = sc.nextInt();
System.out.print("Enter The Second Number: ");
int second = sc.nextInt();
if (first>second)
{
System.out.println(first + " Number is greater than " + second);
}
else{
System.out.println(second + " Number is greater than " + first);
}
System.out.println("*****************");

System.out.println("ThankYou");
}

}