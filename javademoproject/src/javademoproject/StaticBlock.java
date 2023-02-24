package javademoproject;

public class StaticBlock {
	public StaticBlock()
	{
		System.out.println("this is a constructor");
	}
static
{
System.out.println("This is a static block");	
}
{
	System.out.println("this is a non static block");	
}
public static void main(String[] args) {
	System.out.println("this is a main block");
	StaticBlock block=new StaticBlock();
}
}
