package algorithms.sort;

import static algorithms.sort.UtilClass.printArray;
import static algorithms.sort.UtilClass.swap;

public class ShellSortWithBubble {

	public static void main(String[] args) {
		
		int[] intArray = {20, 35, -15, 7, 55, 1, -22};

		printArray(intArray, "original");
		shellBubbleSort(intArray);
		printArray(intArray, "Shell Bubble sorted");
	}
	
	public static int[] shellBubbleSort(int[] intArray)
	{
		for (int gap=intArray.length/2; gap>0; gap/=2)
		{
			for (int lui=intArray.length-1; lui>0; lui-=gap)
			{
				for (int i=0; i<lui; i+=gap)
				{
					if (intArray[i] > intArray[i+gap])
					{
						swap(intArray, i, i+gap);
					}
				}
			}
		}
		return intArray;
	}
}
