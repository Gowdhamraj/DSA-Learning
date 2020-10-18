package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;

public class CountingSort {

	public static void main(String[] args) {
		
		int[] intArray = {2, 5, 3, 7, 2, 6, 6, 2, 9, 4};

		printArray(intArray, "original");
		countingSort(intArray, 2, 15);
		printArray(intArray, "Counting sorted");
	}
	
	// Array of size 10 and values from 1 to 10 inclusive
	public static void countingSort(int[] intArray, int min, int max)
	{
		int[] countingArray = new int[(max-min)+1];

		for (int i = 0; i < intArray.length; i++) 
		{
			countingArray[intArray[i] - min]++;
		}
		for (int i = min, index = 0; i <=max; i++) 
		{
			while (countingArray[i-min] > 0) 
			{
				intArray[index++] = i;
				countingArray[i-min]--;
			}
		}
	}
}
