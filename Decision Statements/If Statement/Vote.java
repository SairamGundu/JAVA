import java.util.Scanner;

public class Vote{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.print("Enter your name:");
String name = sc.next();
System.out.print("Enter your age:");
int age = sc.nextInt();
if(age >= 18)
System.out.println(name+" is eligible to vote, as his/her age is: "+ age);
System.out.println("Thank you");
}}