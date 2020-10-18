package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;

public class InsertionSort {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		printArray(intArray, "original");
		insertionSort(intArray);
		printArray(intArray, "Insertion sorted");
	}
	
	public static int[] insertionSort(int[] intArray)
	{
		for (int fui=1; fui<intArray.length; fui++)
		{
			int newElement = intArray[fui], i;
			for (i=fui; i>0 && intArray[i-1]>newElement; i--)
			{
				intArray[i] = intArray[i-1];
			}
			intArray[i] = newElement;
		}
		return intArray;
	}
	
	public static int[] shellSort(int[] intArray)
	{
		for (int gap=intArray.length/2; gap>0; gap=gap/2)
		{
			for (int i=gap; i<intArray.length; i++)
			{
				int newElement = intArray[i];
				int j = i;
				while(j>=gap && intArray[j-gap] > newElement)
				{
					intArray[j] = intArray[j-gap];
					j = j-gap;
				}
				intArray[j] = newElement;
			}
		}
		return intArray;
	}
}
