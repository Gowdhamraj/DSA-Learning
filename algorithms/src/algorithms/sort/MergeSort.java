package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;

public class MergeSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		printArray(intArray, "original");
		mergeSort(intArray, new int[intArray.length], 0, intArray.length-1);
		printArray(intArray, "Merge sorted");
	}
	
	public static void mergeSort(int[] intArray, int[] temp, int startIndex, int endIndex)
	{
		if (startIndex >= endIndex)
		{
			return;
		}
		
		int mid = (startIndex + endIndex)/2;
		mergeSort(intArray, temp, startIndex, mid);
		mergeSort(intArray, temp, mid+1, endIndex);
		
		merge(intArray, temp, startIndex, mid, endIndex);
	}
	
	private static void merge(int[] intArray, int[] temp, int startIndex, int mid, int endIndex)
	{
		for (int i=startIndex; i<=endIndex; i++)
		{
			temp[i] = intArray[i];
		}
		
		int leftStart = startIndex;
		int rightStart = mid+1;
		int index = startIndex;
		
		while(leftStart<=mid && rightStart<=endIndex)
		{
			if (temp[leftStart] <= intArray[rightStart])
			{
				intArray[index] = temp[leftStart];
				leftStart++;
			}
			else
			{
				intArray[index] = temp[rightStart];
				rightStart++;
			}
			index++;
		}
		
		while(leftStart<=mid)
		{
			intArray[index] = temp[leftStart];
			leftStart++;
			index++;
		}
	}
}
