package insertion_sort;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: InsertionSortApplication
 * Language: Java
 * Date: 2/3/18
 * Description: This program tests the algorithm and functionality of the InsertionSortArray class.
 * Insertion Sort Comparisons Made: 31
 * Insertion Sort Copies Made: 40
 */

// This program tests the insertion sort algorithm 
public class InsertionSortApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args)
	{
		int maxSize = 100;            								// Array size
		InsertionSortArray insertSortArray;                 		// Reference to array
		insertSortArray = new InsertionSortArray(maxSize);  		// Create the array
		
		insertSortArray.insert(77);          						// Insert items into the array 					    
		insertSortArray.insert(99);
		insertSortArray.insert(44);
		insertSortArray.insert(55);
		insertSortArray.insert(22);
		insertSortArray.insert(88);
		insertSortArray.insert(11);
		insertSortArray.insert(0);
		insertSortArray.insert(66);
		insertSortArray.insert(33);
		
		System.out.println("***************************************** Insertion Sort: *******************************************");
		
		System.out.println("Unsorted Array: ");
		System.out.println("********************************************************************************************************");     
		insertSortArray.display();                					// Display items 
		System.out.println("********************************************************************************************************\n");     
		
		System.out.println("Insertion Sort Comparisons and Copies Needed: ");
		System.out.println("********************************************************************************************************");     
		insertSortArray.insertionSort();          					// Use insertion sort algorithm to sort the data
		System.out.println("********************************************************************************************************\n");     
		
		System.out.println("Insertion Sorted Array: ");
		System.out.println("********************************************************************************************************");     
		insertSortArray.display();                					// Display the sorted items 
		System.out.println("********************************************************************************************************");     
	}  
// ------------------- End Main Method -------------------
}  // End of class InsertionSortApplication