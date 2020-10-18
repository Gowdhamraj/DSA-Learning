package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;

public class StableCountingSort {

	public static void main(String[] args) {
		
		int[] intArray = {2, 5, 3, 7, 2, 6, 6, 2, 9, 4};

		printArray(intArray, "original");
		stableCountingSort(intArray, 2, 9);
		printArray(intArray, "Counting sorted");
	}
	
	// Array of size 10 and values from 2 to 9 inclusive
	public static void stableCountingSort(int[] intArray, int min, int max)
	{
		int[] countingArray = new int[max+1];

		for (int i = 0; i < intArray.length; i++) 
		{
			//{3, 1, 1, 1, 2, 1, 0, 1}
			countingArray[intArray[i] - min]++;
		}
		
		int[] stableCountingArray = new int[max+1];
		stableCountingArray[0] = 0;
		for (int i=0; i<countingArray.length-2; i++)
		{
			//{0, 3, 1, 1, 1, 2, 1, 0}
			stableCountingArray[i+1] = countingArray[i];
		}
		
		for (int i=1; i<stableCountingArray.length; i++)
		{
			//{0, 3, 4, 5, 6, 8, 9, 9}
			stableCountingArray[i] += stableCountingArray[i-1];
		}

		int[] output = new int[intArray.length];
		
		for (int i = intArray.length-1; i>=0; i--) 
        {
			int current = intArray[i];
            output[stableCountingArray[current]-1] = current; 
            stableCountingArray[current]--; 
        }
		
		printArray(output, "output");
	}
}
