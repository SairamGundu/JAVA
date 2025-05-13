import java.util.Scanner;
class Cases
{
public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter any number between 1 to 4: ");
	int a = sc.nextInt();
switch(a){
//case 1 : System.out.print("hi");
//case 2 : System.out.print("hello");

case 1 :{ 
System.out.print("hi");
}
break;
case 2 : {
	System.out.print("hello");
	}
	break ;
	case 3 : {
	System.out.print("Bye");
	}
	break ;
	case 4 : {
	System.out.print("GoodMorning");
	}
	break ;
	
default	: {
	System.out.print("Enter valid number");
}
}
}
}