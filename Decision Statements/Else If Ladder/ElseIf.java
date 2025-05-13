import java.util.Scanner;

class ElseIf{
public static void main (String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter First number: ");
int first= sc.nextInt();
System.out.print("Enter Second number: ");
int second= sc.nextInt();
if(first == second)
{
System.out.print(first + "is equal to " + second);
}
else if(first > second)
{
System.out.print(first + "is greater than  " + second);
}
else
{
System.out.print(second + "is greater than  " + first);
}


}
}
