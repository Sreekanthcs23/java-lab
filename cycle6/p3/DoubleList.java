/*
	Roll no: B20CSB65
	Name: Sreekanth cs
	Name of Experiment: Linked List Operations  */

import java.util.*;

class DoubleList
{
	public static void main(String args[])
	{
		LinkedList<String> li = new LinkedList<>();
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the elements");
		do
		{
			String item = sc.nextLine();
			li.add(item);
			System.out.println("Enter n to stop");
			ch = sc.nextLine().charAt(0);
		}while(ch!='n');
		System.out.println("List:"+li);
		System.out.println("Enter the item to be deleted");
		String del = sc.nextLine();
		int i=0;
		for(String n : li)
		{
			if(n.equals(del))
			{
				break;
			}
			i++;
		}
		if(i==li.size())
			System.out.println("Element not found");
		else
		{
			li.remove(del);
			System.out.println("After deletion");
		}
		System.out.println("List:"+li);
	}
}
