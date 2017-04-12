package com.hpe.acm;

/**
 * binary search Given an array A of n elements with values or records A0 ...
 * An−1, sorted such that A0 ≤ ... ≤ An−1, and target value T, the following
 * subroutine uses binary search to find the index of T in A.[7]
 * 
 * Set L to 0 and R to n − 1. If L > R, the search terminates as unsuccessful.
 * Set m (the position of the middle element) to the floor (the largest previous
 * integer) of (L + R) / 2. If Am < T, set L to m + 1 and go to step 2. If Am >
 * T, set R to m – 1 and go to step 2. Now Am = T, the search is done; return m.
 * This iterative procedure keeps track of the search boundaries via two
 * variables. Some implementations may place the comparison for equality at the
 * end of the algorithm, resulting in a faster comparison loop but costing one
 * more iteration on average.
 * 
 * @author cuizh
 *
 */
public class BinarySearch {
	/**
	 * find the index in no-repeat value array
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public int findIndex(int[] array, int target) {
		int index = -1, start = 0, end = array.length - 1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[mid] == target) {
				index = mid;
				break;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return index;
	}

	/**
	 * find the lower index in repeated key array { 1, 2, 3, 4, 4, 4, 6, 7, 8}
	 * will return 3
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public int findLowerIndex(int[] array, int target) {
		int index = -1, start = 0, end = array.length - 1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[mid] < target) {
				start = mid + 1;
			} else if (array[mid] > target) {
				end = mid - 1;
			} else {
				end = mid - 1;
				index = mid;
			}
		}
		return index;
	}

	/**
	 * find the higher index in repeated key array { 1, 2, 3, 4, 4, 4, 6, 7, 8}
	 * will return 5
	 * 
	 * @param array
	 * @param target
	 * @return
	 */
	public int findHigherIndex(int[] array, int target) {
		int index = -1, start = 0, end = array.length - 1, mid;
		while (start <= end) {
			mid = (start + end) / 2;
			if (array[mid] > target) {
				end = mid - 1;
			} else if (array[mid] < target) {
				start = mid + 1;
			} else {
				start = mid + 1;
				index = mid;
			}
		}
		return index;
	}
}
