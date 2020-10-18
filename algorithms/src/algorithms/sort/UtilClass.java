package algorithms.sort;

public class UtilClass 
{
	static void swap (int[] intArray, int first, int second)
	{
		if (first == second)
		{
			return;
		}
		int temp = intArray[first];
		intArray[first] = intArray[second];
		intArray[second] = temp;
	}
	
	static void printArray(int[] intArray, String info)
	{
		System.out.println("\n");
		System.out.println(info);
		for (int element: intArray)
		{
			System.out.println(element);
		}
	}
}
