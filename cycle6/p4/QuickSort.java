/*
	Roll no: B20CSB65
	Name: Sreekanth cs
	Name of Experiment: Quick Sort Algorithm  */

import java.util.ArrayList;
import java.util.Scanner;
class QuickSort
{
	
	int partition(ArrayList<String> arr, int low, int high)
	{
		String pivot = arr.get(high);
		int i = (low-1);
		for (int j=low; j<high; j++)
		{
			if (arr.get(j).toLowerCase().compareTo(pivot.toLowerCase()) < 0)
			{
				i++;
				String temp = arr.get(i);
				arr.set(i,arr.get(j));
				arr.set(j,temp);
			}
		}
		
		String temp = arr.get(i+1);
		arr.set(i+1,arr.get(high));
		arr.set(high,temp);

		return i+1;
	}

	void sort(ArrayList<String> arr, int low, int high)
	{
		if (low < high)
		{
			int pi = partition(arr, low, high);
			sort(arr, low, pi-1);
			sort(arr, pi+1, high);
		}
	}

	public static void main(String args[])
	{
		ArrayList<String> arr = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		char ch;
		System.out.println("Enter the names");
		do
		{
			String name = sc.nextLine();
			arr.add(name);
			System.out.println("Enter n to stop");
			ch = sc.nextLine().charAt(0);
		}while(ch!='n'); 
		int n = arr.size();

		QuickSort ob = new QuickSort();
		ob.sort(arr, 0, n-1);

		System.out.println("sorted array");
		System.out.println(arr);
	}
}


