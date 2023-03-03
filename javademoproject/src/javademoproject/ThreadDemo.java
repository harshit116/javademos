package javademoproject;

public class ThreadDemo {
public static void main(String[] args) {
	MultiThreaded mt=new MultiThreaded();
	
	mt.start();
	SingleThreaded st=new SingleThreaded();
	st.printNumbers();
}
}
class SingleThreaded
{
void printNumbers()
{
	for(int i=0;i<=100;i++)
	{
		System.out.println(i+" "+Thread.currentThread().getName());
	}
		
}
}
class MultiThreaded extends Thread
{
public void run()
{
	for(int i=0;i<=100;i++)
	{
		System.out.println(i+" "+Thread.currentThread().getName());
	}
		
}
}
