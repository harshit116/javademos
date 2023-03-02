package javademoproject;

public class InnerClass {
public static void main(String[] args) {
	ElectronicDevice.poweron();
	ElectronicDevice.Chips.displyBrand();
	ElectronicDevice.Chips chip=new ElectronicDevice.Chips();
	chip.specs();
	ElectronicDevice laptop =new ElectronicDevice();
	ElectronicDevice.Processor proc=laptop.new Processor();
	ElectronicDevice.Processor.displayprocbrand();
	proc.getvoltage();
}

}
class ElectronicDevice
{
	static void poweron()
	{
		System.out.println("powered on...");
	}
 static class Chips
 {
	 static void displyBrand()
	 {
		 System.out.println("from sony.....");
	 }
	 void specs()
	 {
		 System.out.println("specification on the chips...");
	 }
 }
 class Processor{
	 static void displayprocbrand()
	 {
		 System.out.println("displaying proc brand...");
	 }
	 void getvoltage()
	 {
		 System.out.println("displaying voltage");
	 }
 }
}
