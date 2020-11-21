package insertion_sort;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: InsertionSortArray
 * Language: Java
 * Date: 2/3/18
 * Description: This class contains attributes related to the algorithm of the insertion sort of an array. 
 */

// Class that contains the insertion sort algorithm 
public class InsertionSortArray
{
	private long [] insertSortArr;                 								// Reference to the array
	private int numElems;               										// Number of data items
// ------------------- Alternate Constructor -------------------
	// Alternate Constructor - Maximum Items
	public InsertionSortArray(int max)          				
	{
		// Instantiate properties with parameter values 
		insertSortArr = new long[max];                 							// Create the array
		numElems = 0;                        									// No items 
	}
// ------------------- End Alternate Constructor -------------------
	
// ------------------- Insert Method -------------------
	// Method that inserts an item into the array
	public void insert(long value)    										
	{
		insertSortArr[numElems] = value;             							// Insert the item
		numElems++;                      										// Increase the size of array
	}
// ------------------- End Insert Method -------------------
	
// ------------------- Display Method -------------------
	// Method that displays the contents of the array
	public void display()         
	{
		
		for (int j = 0; j < numElems; j++)       								// Iterate through each item
		{
			System.out.print(insertSortArr[j] + " ");  							// Print the item
		}
		System.out.println("");													// Print blank line 
	}
// ------------------- End Display Method -------------------
	
// ------------------- Insertion Sort Method -------------------
	// Method that uses the insertion sort algorithm to sort an array
	public void insertionSort()
	{
		// Local variables 
		int in, out;															// Index used to swap items, current item index 
		int copy = 0; 															// Number of copies
		int compare = 0;														// Number of comparisons
		
		for (out = 1; out < numElems; out++)     								// Out is the dividing line
		{
			long temp = insertSortArr[out];            							// Remove marked item
			in = out;                      										// Start shifts at out
			
			while (true) 														// Infinite loop until base case is met 														
			{
				if (!(in > 0 && insertSortArr[in - 1] >= temp))					// Current item is smaller than previous item
				{
					break;  													// Exit while loop
				}

				insertSortArr[in] = insertSortArr[in - 1];            			// Shift item to the right
				compare++;														// Increase comparison as a comparison was made 
				copy++;															// Increase copy as a copy was made 
				--in;                       									// Go left one position
			}		
			insertSortArr[in] = temp;   										// Insert marked item
			copy++;																// After swap is made, increase copy count   
		} 
	   
		System.out.println("Total Comparisons Made: " + compare);				// Displays the number of comparisons
		System.out.println("Total Copies Made: " + copy);						// Displays the number of copies
	}  	
// ------------------- End Insertion Sort Method -------------------
}  // End  of class InsertionSortArray