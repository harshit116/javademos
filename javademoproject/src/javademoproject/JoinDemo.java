package javademoproject;

import java.util.Scanner;

public class JoinDemo {
public static void main(String[] args) {
	System.out.println("Enter a value");
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	Calculator calc=new Calculator(n);
	calc.start();
	try {
		calc.join();
	} catch (InterruptedException e) {
		e.printStackTrace();
	}
	System.out.println(Thread.currentThread().getName()+" "+calc.getSum());
	
}
}
class Calculator extends Thread
{
	int n;
	int sum;
	Calculator(int n)
	{
		this.n=n;
	}
	public void run()
	{
	for(int i=0;i<=n;i++)
	{
		this.sum+=i;
	}
	}
	public int getSum()
	{
    return this.sum;
}
}
