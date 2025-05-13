class App{
public int sub(int a,int b)
{
return a-b;
}
}

public class Another{
public static void main(String [] args)
{
App c = new App();
int res = c.sub(20,10);
System.out.println(res);
}
}