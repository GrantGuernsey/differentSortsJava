//**********************
//* Grant Guernsey     *
//* Period D           *
//* Lab 7.1            *
//**********************

import java.util.Random;

public class SortLab
{
	public static void main(String [] args)
	{
		int [] a = new int[500000];
		populate(a);
		display(a);
		selectionSort(a);
		display(a);

		int [] b = new int[500000];
		populate(b);
		display(b);
		bubbleSort(b);
		display(b);
	}

	public static void populate(int [] a)
	{
		Random gen = new Random();

		for(int index = 0; index < a.length; index++)
		{
			a[index] = gen.nextInt(100)+1;
		}
	}

	public static void display(int [] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			System.out.println("[" + a[index] + "]");
		}
	}

	public static int findMinimum(int [] a, int first)
	{
		int minIndex = first;
		for(int i = first + 1; i < a.length; i++)
		{
			if(a[i] < a[minIndex])
			{
				minIndex = i;
			}
		}
		return minIndex;
	}

	public static void swap(int[] a, int x, int y)
	{
		int temp = a[x];
		a[x] = a[y];
		a[y] = temp;
	}

	public static void selectionSort(int [] a)
	{
		for(int index = 0; index < a.length; index++)
		{
			int minIndex = findMinimum(a,index);
			if(minIndex != index)
			{
				swap(a, index, minIndex);
			}
		}
	}

	public static void bubbleSort(int [] a)
	{
		int k = 0;
		boolean exchangeMade = true;

		while((k < a.length - 1) && exchangeMade)
		{
			exchangeMade = false;
			k++;
			for(int j = 0; j < a.length - k; j++)
			{
				if (a[j] > a[j+1])
				{
					swap(a,j,j+1);
					exchangeMade=true;
				}
			}
		}
	}




}