1. Write a static method named flip that simulates a flip of a weighted coin by returning either "heads" or "tails" each time it is called. The coin is twice as likely to turn up heads as tails. Thus, flip should return "heads" about twice as often as it returns "tails."

public static String flip ()
{
	
	int randNum = (int)(Math.random() + 3);
	if ((randNum == 1) || (randNum == 2))
	{
		return "heads";
	} else
	{
		return tails;
	}


}

2. Write a static method named arePermutations that, given two int arrays of the same length but with no duplicate elements, returns true if one array is a permutation of the other (i.e., the arrays differ only in how their contents are arranged). Otherwise, it should return false.

public static boolean arePermutations (int [] array1, int[] array2)
{
	for (int i = 0; i < array1.length; i++)
	{
		boolean areEqual = false;
		for (int x = 0; x < array2.length; x++)
		{
			if (array1[i] == array2[x]
			{
				areEqual = true;
			}
		}
		
		return areEqual;
	}
}

3. Suppose that the initial contents of the values array in Shuffler.java are {1, 2, 3, 4}. For what sequence of random integers would the efficient selection shuffle change values to contain {4, 3, 2, 1}?
Take the first and swap it with the last, then the second with the second to last, and so on. 





