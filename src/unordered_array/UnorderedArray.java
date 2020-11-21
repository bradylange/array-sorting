package unordered_array;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: UnorderedArray
 * Language: Java
 * Date: 2/3/18
 * Description: This class contains attributes and algorithms related to an unordered array.
 */

// This class contains algorithms to iterate, search, find the maximum/minimum value in an unordered array
public class UnorderedArray
{
	// Instance variables
	private long [] unorderedArray;               							// Reference to unordered array 
	private int numElems;              										// Number of data items 
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Maximum Items 
	public UnorderedArray(int max)         
	{
		// Instantiate properties with parameter values
		unorderedArray = new long[max];                 					// Create the array
		numElems = 0;                        								// No items yet
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Find Method -------------------
	// Method that searches for the specified value 
	public boolean find(long searchKey)
	{     
		// Local variables
		int j;
		
		for (j = 0; j < numElems; j++) 										// Iterate through each item         
		{
			if (unorderedArray[j] == searchKey)    							// Item is found      
			{
				break;      
			}
		}
		
		if (j == numElems)   												// Iteration made it to the end and cannot find it                  
		{
			return false;          											// Cannot find it    
		}
		else																// Found the item 
		{
			return true;                  
		}
	} 
// ------------------- End Find Method -------------------
	
// ------------------- Insert Method -------------------
	// Method that places data into the unordered array 
	public void insert(long value)    
	{
		unorderedArray[numElems] = value;             						// Insert it
		numElems++;                      									// Increment size
	}
// ------------------- End Insert Method -------------------
	
// ------------------- Delete Method -------------------
	// Method that removes a specified value from the unordered array 
	public boolean delete(long value)
	{
		// Local variables 
		int j;
		
		for (j = 0; j < numElems; j++)      								// Iterate through each item  
		{
			if (value == unorderedArray[j])									// Item is found 
			{
				break;
			}
		}
		
		if (j == numElems)    												// Iteration made it to the end and cannot find it   
		{
			return false;
		}
		else     															// Found the item                   
		{
			/* Choice 1: Move elements forward */
			for (int k = j; k < numElems; k++)								// Move higher ones down
			{
				unorderedArray[k] = unorderedArray[k + 1];
			}
			
			/* Choice 2: Put the last element to the gap */
			// unorderedArray[j] = unorderedArray[numElems - 1];
			
			numElems--;                   									// Decrement size
			return true;
		}
	}  
// ------------------- End Delete Method -------------------
	
// ------------------- Display Method -------------------
	// Method that displays the contents of the unordered array
	public void display()            
	{
		for (int j = 0; j < numElems; j++)									// Iterate through each item
		{
			System.out.print(unorderedArray[j] + " "); 						// Print out the item 
		}
		System.out.println("");												// Print another blank line 
	}
// ------------------- End Display Method -------------------
	
// ------------------- Get Maximum Method -------------------
	// Method that returns the largest number in the unordered array
	public long getMax()			  
	{
		// Local variables
		long max = unorderedArray[0];
		
		for (int i = 1; i < numElems; i++)									// Iterate through each item
		{
			if (unorderedArray[i] > max)									// Current item is larger than the maximum item 
			{
				max = unorderedArray[i];									// Set it as the new maximum
			}
		}
			
		if (numElems > 0)													// There are items in the unordered array 
		{	
			return max;														// Return the maximum value 
		}
		else																// The unordered array is empty 
		{
			return -1;														// Return -1 to decipher empty array
		}
	}
// ------------------- End Get Maximum Method -------------------
	
// ------------------- Get Minimum Method -------------------
	// Method that returns the smallest number in the unordered array
	public long getMin()		      
	{
		// Local variables 
		long min = unorderedArray[0];
		
		for (int i = 1; i < numElems; i++)									// Iterate through each item
		{
			if (unorderedArray[i] < min)									// Current item is smaller than the minimum item 
			{
				min = unorderedArray[i];									// Set it as the new minimum item
			}
		}
			
		if (numElems > 0)													// If there are items in the unordered array 
		{
			return min;														// Return the minimum value 
		}
		else 																// The unordered array is empty 
		{	
			return -1;														// Return -1 to decipher empty array
		}
	}
// ------------------- Get Minimum Method -------------------
}  // End of class UnorderedArray
