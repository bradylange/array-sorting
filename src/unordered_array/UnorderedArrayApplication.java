package unordered_array;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: UnorderedArrayApplication
 * Language: Java
 * Date: 2/3/18
 * Description: This program tests the functionality and the algorithms of the UnorderedArray class.
 */

// This program tests the algorithms and functionality of the unordered array
public class UnorderedArrayApplication
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args)
	{
		// Local variables
		int maxSize = 100;            							// Unordered array capacity 
		UnorderedArray unorderedArray;                			// Reference to the unordered array
		unorderedArray = new UnorderedArray(maxSize); 			// Create the unordered array
		
		System.out.println("***************************************** Unordered Array: *******************************************");
		
		// Insert values into the unordered array
		unorderedArray.insert(77);              
		unorderedArray.insert(99);
		unorderedArray.insert(44);
		unorderedArray.insert(55);
		unorderedArray.insert(22);
		unorderedArray.insert(88);
		unorderedArray.insert(11);
		unorderedArray.insert(00);
		unorderedArray.insert(66);
		unorderedArray.insert(33);
		
		// Display the items in the unordered array
		System.out.println("Displaying the Contents of the Unordered Array: ");
		System.out.println("********************************************************************************************************");
		unorderedArray.display();                						
		
		// Search for an item in the unordered array
		int searchKey = 35;     
		System.out.println("********************************************************************************************************\n");
		System.out.println("Searching for an Item in the Unordered Array: ");
		System.out.println("********************************************************************************************************");
		if (unorderedArray.find(searchKey))
		{
			System.out.println("Found " + searchKey);
		}
		else
		{
			System.out.println("Can't find " + searchKey);
		}
		
		// Delete items from the unordered array
		unorderedArray.delete(00);               						
		unorderedArray.delete(55);
		unorderedArray.delete(99);
		
		// Display the items in the unordered array
		System.out.println("********************************************************************************************************\n");
		System.out.println("Removed Three Items from the Unordered Array: ");
		System.out.println("********************************************************************************************************");
		unorderedArray.display();    
		   
		// Get the maximum value in the unordered array
		long max = unorderedArray.getMax();
		System.out.println("********************************************************************************************************\n");
		System.out.println("The Largest Number in the Unordered Array: ");
		System.out.println("********************************************************************************************************");
		System.out.println(max);
		System.out.println("********************************************************************************************************");
		
		// Get the minimum value in the unordered array
		long min = unorderedArray.getMin();
		System.out.println("\nThe Smallest Number in the Unordered Array: ");
		System.out.println("********************************************************************************************************");
		System.out.println(min);
		System.out.println("********************************************************************************************************");
		
		// Test if the unordered array is empty that it will return -1 
		System.out.println("\nEmpty Unordered Array: ");
		System.out.println("********************************************************************************************************");
		UnorderedArray array2 = new UnorderedArray(maxSize);
		long max2 = array2.getMax();
		System.out.println("Maximum Value: " + max2);
		long min2 = array2.getMin();
		System.out.println("Minimum Value: " + min2);
		System.out.println("********************************************************************************************************");
	}  
// ------------------- End Main Method -------------------
} // End of class UnorderedArrayApplication
