package ordered_array;

/*
 * Developer: Brady Lange
 * Course: Data Structures & Algorithms - CSIS 237
 * Class: OrderedArrayApplication
 * Language: Java
 * Date: 2/3/18
 * Description: This program tests the algorithms and functionality of the OrderedArray class.
 */

public class OrderedArrayApplication 
{
// ------------------- Main Method -------------------
	// Method that compiles and runs the program 
	public static void main(String [] args)
	{
		// Local variables 
		int maxSize = 100;             									// Ordered array capacity 
		OrderedArray orderedArray;                  					// Reference to the ordered array
		orderedArray = new OrderedArray(maxSize);   					// Create the ordered array
		
		System.out.println("***************************************** Ordered Array: *******************************************");
		
		// Insert items into the ordered array - these items will be placed from smallest to largest in the array order 
		orderedArray.insert(77);                	
		orderedArray.insert(99);
		orderedArray.insert(44);
		orderedArray.insert(55);
		orderedArray.insert(22);
		orderedArray.insert(88);
		orderedArray.insert(11);
		orderedArray.insert(00);
		orderedArray.insert(66);
		orderedArray.insert(33);
		
		// Search for an item in the ordered array
		int searchKey = 55;  											// Search key 
		System.out.println("Searching for an Item in the Ordered Array: ");
		System.out.println("********************************************************************************************************");         
		if (orderedArray.find(searchKey) != orderedArray.size())		// Found the item		
		{
			System.out.println("Found " + searchKey);
		}
		else															// Did not find the item 
		{
			System.out.println("Can't find " + searchKey);
		}
		System.out.println("********************************************************************************************************\n");
		
		// Display the contents of the ordered array
		System.out.println("Displaying the Contents of the Ordered Array: ");
		System.out.println("********************************************************************************************************");
		orderedArray.display();           
		System.out.println("********************************************************************************************************\n");
		
		// Delete items from the ordered array
		orderedArray.delete(00);                
		orderedArray.delete(55);
		orderedArray.delete(99);
		
		// Display the updated contents of the ordered array
		System.out.println("Removed Three Items from the Ordered Array: ");
		System.out.println("********************************************************************************************************");
		orderedArray.display();   
		System.out.println("********************************************************************************************************\n");
		  
		// Create the ordered arrays
		OrderedArray srcArray1 = new OrderedArray(maxSize);   			// First array
		OrderedArray srcArray2 = new OrderedArray(maxSize);				// Second array
		OrderedArray destinArray = new OrderedArray(maxSize);   		// Array to merge the first and second arrays
		     
		// Fill the first ordered array - Inserts from smallest to largest 
		srcArray1.insert(12);
		srcArray1.insert(2);
		srcArray1.insert(34);
		srcArray1.insert(6);
		srcArray1.insert(60);
		srcArray1.insert(45);
		
		// Fill the second ordered array - Inserts from smallest to largest 
		srcArray2.insert(1);
		srcArray2.insert(19);
		srcArray2.insert(57);
		srcArray2.insert(88);
		srcArray2.insert(14);
		
		// Display both ordered arrays
		System.out.println("Displaying Two Ordered Arrays: ");
		System.out.println("********************************************************************************************************");
		System.out.print("Ordered Array One: ");
		srcArray1.display();											// Display the first array
		System.out.print("Ordered Array Two: ");
		srcArray2.display();											// Display the second array
		System.out.println("********************************************************************************************************\n");
		destinArray = srcArray1.merge(srcArray1, srcArray2);			// Merge the first array and second array 
		      
		// Display the merged ordered arrays 
		System.out.println("Merged the Two Ordered Arrays:");
		System.out.println("********************************************************************************************************");
		destinArray.display(); 											// Display merged arrays
		System.out.println("********************************************************************************************************");
	}
// ------------------- End Main Method -------------------
} // End of class OrderedArrayApplication
