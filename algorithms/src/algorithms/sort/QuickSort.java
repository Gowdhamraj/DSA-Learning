package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;
import static algorithms.sort.UtilClass.swap;

public class QuickSort {

	public static void main(String[] args) {
		
		int[] intArray = {99, 567, 20, 35, -15, 7, 55, 1, -22, 50, -2, 1, 100, 17};

		printArray(intArray, "original");
		quickSort(intArray, 0, intArray.length-1);
		printArray(intArray, "Quick sorted");
	}
	
	public static void quickSort(int[] intArray, int startIndex, int endIndex)
	{
		if (startIndex < endIndex)
		{
		int pivotIndex = partition(intArray, startIndex, endIndex);
		quickSort(intArray, startIndex, pivotIndex-1);
		quickSort(intArray, pivotIndex, endIndex);
		}
	}
	
	private static int partition(int[] intArray, int startIndex, int endIndex)
	{
		int pivot = startIndex + (endIndex-startIndex)/2;
		int pivotValue = intArray[pivot];
		
		int i = startIndex;
		int j = endIndex;
		
		while (i<=j)
		{
			while (intArray[i] < pivotValue)
			{
				i++;
			}
			while (intArray[j] > pivotValue)
			{
				j--;
			}
			if (i<=j)
			{
				swap(intArray, i, j);
				i++;
				j--;
			}
		}
		return i;
	}
}
