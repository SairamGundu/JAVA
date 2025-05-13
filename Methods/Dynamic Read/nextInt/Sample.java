import java.util.Scanner;

public class Sample{

public static void main(String [] args){

Scanner sc = new Scanner(System.in);
System.out.println("Enter the First Number:");
int first = sc.nextInt();
System.out.println("Enter the Second Number:");
int second = sc.nextInt();

Demo d = new Demo();
System.out.println("The Result is :" + d.add(first,second));

}
}

class Demo{
public int add(int a , int b)
{
return a + b;
}
}
