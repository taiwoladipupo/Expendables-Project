import java.util.Arrays; 
	//Imports the Arrays class from the java.util package 
	import java.util.Scanner; 
	//Imports the Scanner class from the java.util package 

public class Excercise7_20 {
	//Main method 
	public static void main(String[] args) { 
	 
	 // Write a test program that reads in ten double numbers, invokes the 
	 //method, and displays the sorted numbers. 
	 
	//Creates a object in the Scanner class, and allows the user to define the input at the console 
	Scanner input = new Scanner(System.in); 
	double[] array = new double[10]; 
	//Allows the user to enter 10 numbers 
	System.out.print("Please enter 10 numbers: "); 
	for(int i = 0; i < array.length; ++i) 
	{ 
	array[i] = input.nextDouble(); 
	} 
	input.close(); 
	selectionSortLargest(array); 
	System.out.print(Arrays.toString(array)); 
	} 
	 


	 /* The selection-sort method repeatedly finds the smallest number in the 
	 * current array and swaps it with the first. Rewrite this program by 
	 * finding the largest num- ber and swapping it with the last. 
	 */ 
	    private static void selectionSortLargest(double[] array) { 
	    for (int r = array.length - 1; r > 0; --r) 
	{ 
	int largestElementIndex = r; 
	// loop to find the largest element lower than r. 
	for (int l = 0; l < r; ++l) 
	{ 
	if (array[l] > array[largestElementIndex]) 
	largestElementIndex = l; 
	} 
	// once done with loop, replace r element with largestElementIndex 
	// element. 
	double temp = array[r]; 
	array[r] = array[largestElementIndex]; 
	array[largestElementIndex] = temp; 
	} 
	} 
	} 
