package javademoproject;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
public static void main(String[] args) {
	Set<String> str=new TreeSet<String>(new StringComparator());
	str.add("harshit");
	str.add("mishra");
	str.add("rahul");
	System.out.println(str);
}

	}
class StringComparator implements Comparator<String>
{

	public int compare(String str1 ,String str2)
	{
		int len1=str1.length();
		int len2=str2.length();
		if(len1<len2)
		{
			return -1;
		}
		else if(len1>len2)
		{
			return 1;
		}
		else
		{
			return str1.compareTo(str2);
		}
	}
}
