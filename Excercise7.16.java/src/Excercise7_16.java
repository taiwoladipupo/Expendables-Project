
public class Excercise7_16 {

//Main Method
	public static void main(String[] args) {
		// Randomly generates an array of 100,000
		//integers and a key
		
		int num;
		int [] numbers = new int [10000];
		
		for (int i = 0; i < numbers.length; i++){
			numbers [i] = getRandomInt ();
		}
		
		int key = getRandomInt ();
		
		//Estimate the execution time of invoking the linearSearch
		int searchResult;
		long startTime = System.currentTimeMillis();
		searchResult = linearsearch(numbers, key);
		long endTime = System.currentTimeMillis();
		long executionTime = endTime - startTime;
		
		System.out.println("Execution time of invoking the linearsearch in  milliseconds: "  + executionTime );
		
		
		//sort Array
		selectionSort(numbers);

		// Estimate the execution time of invoking the linearSearch
		startTime = System.currentTimeMillis();
		searchResult = binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		executionTime = endTime - startTime;
		System.out.println(
			"Execution time of invoking the binarySearch in milliseconds: " 
			+ executionTime + " ");
	}
		
		
		//Returns getRandomInt
	private static int getRandomInt() {
		return 1 + (int)(Math.random() * 100000);
	}
		
		//Returns linearSearch
		private static int linearsearch(int[] array, int key) {
			for (int i = 0; i < array.length; i++) {
				if (key == array[i])
					return i;
			}
		return -1;
		}

		//Returns binarySearch

		private static int binarySearch(int[] array, int key) {
			int low = 0;
			int high = array.length - 1;
			
			while (high >= low) {
				int mid = (low + high) / 2;
				if (key < mid)
					high = mid - 1;
				else if (key == mid)
					return mid;
				else
					low = mid + 1;
			}
			return -low - 1;
		}
		
       //selectionSort
		public static void selectionSort(int[] array) {
			for (int i = 0; i < array.length; i++) {
				// Find the mimum in the array
				int min = array[i];
				int minIndex = i;

				for (int j = i + 1; j < array.length; j++) {
					if (min > array[j]) {
						min = array[j];
						minIndex = j;
					}
				}

				// Swap array[i] with array[minIndex] if necessary
				if (minIndex != i) {
					array[minIndex] = array[i];
					array[i] = min; 
				}
			}
		}
	}
		

	}

}
