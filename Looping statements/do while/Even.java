import java.util.Scanner;
class Even
{
public static void main(String [] args)
{
Scanner sc= new Scanner(System.in);
System.out.print("Enter the start number: ");
int a= sc.nextInt();
System.out.print("Enter the end number: ");
int b= sc.nextInt();

do
{
if(a % 2 == 0 )
{
System.out.println( a +" is an even number ");
}
a++;
}while(a<=b);


}
}