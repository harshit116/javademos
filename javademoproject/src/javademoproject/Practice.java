
package javademoproject;

public class Practice {
public static void main(String[] args) {
   A a=new B();
	a.start();
}
	
}
class A
{
	public void start()
	{
	System.out.println("in the parent class");	
	}
}
class B extends A
{
	public void start()
	{
	System.out.println("in the child class");	
	}
}

