import java.util.ArrayList;
import java.util.Scanner;

/**
* @author - Sohail Shaik
* @Date - Apr 6, 2020
* @Assignment - Searching
*/
public class Searching {

	public static void main(String[] args) {
		ArrayList<Integer> L = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		Scanner in  = new Scanner(System.in);
		int target;
		/*
		 * with an unsorted array or a small array it is much faster and effective to use the Linear search seen in test 1 and test 3
		 * but with a sorted array if it is small it would still be a better choice to just use a Linear search seen in test 2
		 * if the array is long then using the binary search is much better and it is very fast and effective since it doesn't 
		 * try to look at every single element in the array it is much faster seen in test 4 when searching for 45678 the linear search 
		 * iterate 26 time before it finds a match but the binary search recursively calls it self 5 times
		 */
		
//		L.add(new Integer(20));
//		L.add(new Integer(21));
//		L.add(new Integer(36));
//		L.add(new Integer(50));
//		L.add(new Integer(31));
//		L.add(new Integer(4));
//		L.add(new Integer(25));
//		L.add(new Integer(35));
//		L.add(new Integer(32));
//		L.add(new Integer(26));
//		System.out.println("Original List" + L);
//		target = errorCheck(L, in);
//		LinearSearch(L, target);
//		
//		B.add(new Integer(20));
//		B.add(new Integer(21));
//		B.add(new Integer(36));
//		B.add(new Integer(50));
//		B.add(new Integer(31));
//		B.add(new Integer(4));
//		B.add(new Integer(25));
//		B.add(new Integer(35));
//		B.add(new Integer(32));
//		B.add(new Integer(26));
//		System.out.println();
//		binarySearch(B,0,8,target);
		
//	<--------------- sorted array test------------------>

//		L.add(new Integer(4));
//		L.add(new Integer(20));
//		L.add(new Integer(21));
//		L.add(new Integer(25));
//		L.add(new Integer(26));
//		L.add(new Integer(31));
//		L.add(new Integer(32));
//		L.add(new Integer(35));
//		L.add(new Integer(36));
//		L.add(new Integer(50));
//		
//		System.out.println("Sorted List" + L);
//		target = errorCheck(L, in);
//		LinearSearch(L, target);
//		
//		B.add(new Integer(4));
//		B.add(new Integer(20));
//		B.add(new Integer(21));
//		B.add(new Integer(25));
//		B.add(new Integer(26));
//		B.add(new Integer(31));
//		B.add(new Integer(32));
//		B.add(new Integer(35));
//		B.add(new Integer(36));
//		B.add(new Integer(50));
//		System.out.println();
//		binarySearch(B,0,9,target);
		
//  <-------------short array test--------------------------->
		
//		L.add(new Integer(45));
//		L.add(new Integer(28));
//		L.add(new Integer(31));
//		L.add(new Integer(25));
//		L.add(new Integer(9));
//		
//		System.out.println("Short List" + L);
//		target = errorCheck(L, in);
//		LinearSearch(L, target);
//		
//		B.add(new Integer(45));
//		B.add(new Integer(28));
//		B.add(new Integer(31));
//		B.add(new Integer(25));
//		B.add(new Integer(9));
//		
//		System.out.println();
//		binarySearch(B,0,4,target);
		
//  <-------------------long array test------------------------>
		
//		L.add(new Integer(2));
//		L.add(new Integer(3));
//		L.add(new Integer(4));
//		L.add(new Integer(7));
//		L.add(new Integer(7));
//		L.add(new Integer(7));
//		L.add(new Integer(7));
//		L.add(new Integer(9));
//		L.add(new Integer(12));
//		L.add(new Integer(20));
//		L.add(new Integer(21));
//		L.add(new Integer(25));
//		L.add(new Integer(25));
//		L.add(new Integer(26));
//		L.add(new Integer(28));
//		L.add(new Integer(31));
//		L.add(new Integer(31));
//		L.add(new Integer(32));
//		L.add(new Integer(35));
//		L.add(new Integer(36));
//		L.add(new Integer(45));
//		L.add(new Integer(50));
//		L.add(new Integer(52));
//		L.add(new Integer(786));
//		L.add(new Integer(22627));
//		L.add(new Integer(2827));
//		L.add(new Integer(45678));
//
//		
//		System.out.println("sorted long list List" + L);
//		target = errorCheck(L, in);
//		LinearSearch(L, target);
//		
//		B.add(new Integer(2));
//		B.add(new Integer(3));
//		B.add(new Integer(4));
//		B.add(new Integer(7));
//		B.add(new Integer(7));
//		B.add(new Integer(7));
//		B.add(new Integer(7));
//		B.add(new Integer(9));
//		B.add(new Integer(12));
//		B.add(new Integer(20));
//		B.add(new Integer(21));
//		B.add(new Integer(25));
//		B.add(new Integer(25));
//		B.add(new Integer(26));
//		B.add(new Integer(28));
//		B.add(new Integer(31));
//		B.add(new Integer(31));
//		B.add(new Integer(32));
//		B.add(new Integer(35));
//		B.add(new Integer(36));
//		B.add(new Integer(45));
//		B.add(new Integer(50));
//		B.add(new Integer(52));
//		B.add(new Integer(786));
//		B.add(new Integer(22627));
//		B.add(new Integer(2827));
//		B.add(new Integer(45678));
//		
//		System.out.println();
//		binarySearch(B,0,26,target);
		
	}
	
	/**
	 * checks for wrong input to a promt
	 * @param promt - the promt the program wants to ask the user
	 * @param in - a scanner object that is used to check the user input
	 * @return - an int that is checked for the wrong input to a promt
	 */
	public static int errorCheck(ArrayList<Integer> arr, Scanner in) {
		int userNum;
		do {
			System.out.println("Enter a value to search for: ");
			while (!in.hasNextInt()){
				System.out.println("That was not an int! Try again.");
				in.next();
			}
			userNum = in.nextInt();
			if(userNum  < 0) {
				System.out.println("You can't enter an negative!");
			}
			if(Search(arr, userNum) == -1) {
				System.out.println("That number is not in the array");
			}
		}while(userNum < 0 || Search(arr, userNum) == -1);
		return userNum;
	}
	
	/**
	 * Linear serach
	 * @param arr - the array
	 * @param key - the target we are looking
	 * @return - return the index if found else return -1
	 */
	public static int LinearSearch(ArrayList<Integer> arr, int key) {
		System.out.println("Entering Linear Search");
		for(int i = 0; i < arr.size(); i++) {
			System.out.println("Examining index " + i + " which contains " + arr.get(i));
			if(arr.get(i) == key) {
				System.out.println("Exiting linear search");
				System.out.println("Useing linear search, found index: " + i);
				return i;
			}
		}
		
		return -1;
	}
	
	/**
	 * Linear serach
	 * @param arr - the array
	 * @param key - the target we are looking
	 * @return - return the index if found else return -1
	 */public static int Search(ArrayList<Integer> arr, int key) {
			for(int i = 0; i < arr.size(); i++) {
				if(arr.get(i) == key) {
					return i;
				}
			}
			
			return -1;
		}
	 
	/**
	 * searches the arrayList binary	
	 * @param items - the array to search
	 * @param start - the index to start searching 
	 * @param end - the end index to search to 
	 * @param goal - the atarget we are looking for
	 * @return - return the index if found else return -1
	 */
	public static int binarySearch(ArrayList<Integer> items, int start, int end, double goal) {
		System.out.println("Entering binary search from indices "+ start + " to " + end);
		if(start > end) {
			System.out.println("Exiting binary search from indices "+ start + " to " + end);
			System.out.println("Useing binary search, found index: " + -1);
			return -1;
		}
		int mid = (start + end) / 2;
		System.out.println("Examining index " + mid + " which contains " + items.get(mid)); 
		if(Math.abs(goal - items.get(mid)) < 0.0000000000001) {
			System.out.println("Exiting binary search from indices "+ start + " to " + end);
			System.out.println("Useing binary search, found index: " + mid);
			return mid;
		}else if(goal < items.get(mid)) {
			System.out.println("Recursing on first half"); 
			return binarySearch(items, start, mid-1, goal);
		}else {
			System.out.println("Recursing on secound half"); 
			return binarySearch(items, mid+1, end, goal);
		}
	}

}
