package javademoproject;

import java.io.*;
public class FileHandling {
public static void main(String[] args) {
	fileInputStreamDemo();
}
static void fileInputStreamDemo() {
	int i;
	File myfile=new File("C:\\Users\\harmishra\\Documents\\check.txt");
	
	try {
		FileInputStream fis=new FileInputStream(myfile);
		System.out.println("file opened");
		while((i=fis.read())!=-1)
		{
			System.out.print((char)i);
		}
		fis.close();
	} catch (IOException e) {
		System.out.println("exception occured "+e.getMessage());
	}
}
}
