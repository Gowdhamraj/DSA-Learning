package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;
import static algorithms.sort.UtilClass.swap;

public class SelectionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		printArray(intArray, "original");
		selectionSort(intArray);
		printArray(intArray, "Selection sorted");
	}
	
	public static int[] selectionSort(int[] intArray)
	{
		int largest = 0;
		
		for (int lui=intArray.length-1; lui>=0; lui--)
		{
			for (int i=1; i<=lui; i++)
			{
				if (intArray[i] > intArray[largest])
				{
					largest = i;
				}
			}
			swap(intArray, largest, lui);
		}
		return intArray;
	}
}
