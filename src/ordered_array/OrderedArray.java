package ordered_array;

/*
 * Problem 2
 * OrderedArray class has algorithms for merging 2 arrays together, deleting, and finding elements in an orderedArray.
 * Brady Lange
 * Date: 2/3/18
 */

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: OrderedArray
 * Language: Java
 * Date: 2/3/18
 * Description: This class contains attributes and algorithms related to an ordered array such as insertion, searching, and deletion.
 */

// Class that contains attributes and algorithms related to an ordered array
public class OrderedArray
{
	// Instance variables 
	private long [] orderedArray;                 								// Reference to the ordered array
	private int numElems;               										// Number of data items in the ordered array
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Maximum Items 
	public OrderedArray(int max)         
	{
		// Instantiate properties with parameter values
		orderedArray = new long[max];             								// Create the ordered array
		numElems = 0;															// No data items 
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Size Method -------------------
	// Method that returns the size of the ordered array
	public int size()
	{ 
		return numElems; 														// Return the ordered array's number of items 
	}
// ------------------- End Size Method -------------------
	
// ------------------- Find Method -------------------
	// Method that finds the specified value using a binary search algorithm 
	public int find(long searchKey)
	{
		// Local variables 
		int lowerBound = 0;														// Lower bound position of the array - first item
		int upperBound = numElems-1;											// Upper bound position of the array - last item
		int currItem;															// Current item 
			
		while (true)															// Continue to loop through the items until a base case is met 
		{
			currItem = (lowerBound + upperBound ) / 2;							// Divide the total number of items in half - binary search 							
			
			if (orderedArray[currItem] == searchKey)							// Found the item 
			{
				return currItem;              									// Return the item 
			}
			else if (lowerBound > upperBound)									// Base Case: Searched all of the items and did not find it 
			{
				return numElems;             									// Return the number of items 
			}
			else            													// Divide the range using binary searching               
			{
				if (orderedArray[currItem] < searchKey)							// In the upper half 
				{
					lowerBound = currItem + 1; 									// Increment the lower bound 
				}
				else															// In the lower half 
				{
					upperBound = currItem - 1; 									// Decrease the upper bound 
				}
			} 
		} 
	}  
// ------------------- End Find Method -------------------
	
// ------------------- Insert Method -------------------
	// Method that places a data item into the ordered array
	public void insert(long value)    
	{
		// Local variables 
		int j;																	// Index of the insertion point 
		
		for (j = 0; j < numElems; j++)   										// Find where the item goes with a linear search    
		{
			if (orderedArray[j] > value)   										// Item is larger than the item is being inserted									      
			{
				break;															// Exit the loop
			}
		}

		for (int k = numElems; k > j; k--)   									// For each item while the number of items is larger than the index to be inserted 
		{
			orderedArray[k] = orderedArray[k - 1];								// Move the larger items up to make space 
		}
		
		orderedArray[j] = value;   												// Insert the item 
		numElems++;                      										// Increase the ordered array size 
	}  	
// ------------------- End Insert Method -------------------
	
// ------------------- Delete Method -------------------
	// Method that deletes a specified item from the ordered array
	public boolean delete(long value)
	{
		int j = find(value);													// Find the value and store it 
		
		if (j == numElems)   													// Can't find the value             
		{
			return false;														// Unsuccessfully removed item 
		}
		else 																	// Found the value                         
		{
			for (int k = j; k < numElems; k++)									// For each item while the item to be deleted is less than the total items
			{
				orderedArray[k] = orderedArray[k + 1];							// Move the larger items down
			}
			numElems--;    														// Decrement size               
			return true;														// Successfully removed item 
		}
	} 
// ------------------- End Delete Method -------------------
	
// ------------------- Display Method -------------------
	// Method that displays the ordered arrays content 
	public void display()             
	{
		for (int j = 0; j < numElems; j++)     									// Iterate through each item   
		{
			System.out.print(orderedArray[j] + " "); 							// Print out the item 
		}
		System.out.println("");													// Print out a blank line 
	}
// ------------------- End Display Method -------------------
	
// ------------------- Merge Method -------------------
	// Method that merges two ordered arrays together 
	public OrderedArray merge(OrderedArray src1, OrderedArray src2)
	{
		// Local variables
		long [] src1Arr = src1.orderedArray;									// First Ordered Array
		long [] src2Arr = src2.orderedArray;									// Second Ordered Array
		long [] destinArr = new long[src1.numElems + src2.numElems];			// Destination Ordered Array - Merge 

		int i = 0, j = 0, k = 0;												// Index's of First Ordered Array, Second Ordered Array, Destination Ordered Array 
			
		// Both of the ordered arrays contain elements and is less then the elements in the ordered arrays
		while (i < src1.numElems && j < src2.numElems) 
		{
			// Sort the elements in both of the ordered arrays to order them
			// First ordered array's current position is less than or equal to the second ordered array's current position
			if (src1Arr[i] <= src2Arr[j]) 
			{
				// Place the first array's current position into the destination ordered array
				destinArr[k] = src1Arr[i];
				i++;
			}
			// First ordered array's current position is greater than the second ordered array's current position 
			else
			{
				// Place the second ordered array's current position into the destination ordered array
				destinArr[k] = src2Arr[j];
				j++;
			}
			// Increase the destination ordered arrays size 
			k++;
		}
		
		// First ordered array runs out of elements 
		if (i >= src1.numElems )
		{
			// Copy all remaining elements from second ordered array to the destination ordered array
			while (j < src2.numElems)
			{
				destinArr[k] = src2Arr[j];
				j++;
				k++;
			}
		}
		// Second ordered array runs out of elements
		if (j > src2.numElems)
		{
			// Copy all remaining elements from first ordered array to the destination ordered array
			while (i < src1.numElems) 
			{
				destinArr[k] = src1Arr[i];
				i++;
				k++;
			}
		}
		
		// Create the destination ordered array
		OrderedArray destination = new OrderedArray(destinArr.length);
		// Initialize elements in the destination ordered array
		destination.numElems = src1.numElems + src2.numElems; 
		
		// Copy the contents from the temporary destination ordered array to the final ordered array merged together 
		for (int d = 0; d < destination.numElems; d++) 
		{   
			destination.orderedArray[d] = destinArr[d];
		}
		
		// Return the merged ordered arrays
		return destination;		
	}
// ------------------- End Merge Method -------------------
}  // End of class OrderedArray