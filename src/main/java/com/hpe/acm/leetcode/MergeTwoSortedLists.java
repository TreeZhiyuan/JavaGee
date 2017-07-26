/**
 * https://leetcode.com/problems/merge-two-sorted-lists/#/description
 */
package com.hpe.acm.leetcode;

/**
 * @author cuizh
 *
 */

public class MergeTwoSortedLists {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode header1 = l1, header2 = l2;
		while (null != l1 && null != l2) {
			if (l1.val == l2.val) {
				// not adding new node
			} else if (l1.val > l2.val) {
				// 
			} else {

			}
		}
		return null;
	}
}
