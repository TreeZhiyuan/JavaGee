package com.hpe.acm.leetcode;

/**
 * https://leetcode.com/problems/add-two-numbers/#/description
 * 
 * @author cuizh
 *
 */
class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(-1), result = head;
		int carry = 0, sum = 0;
		while (l1 != null || l2 != null || carry != 0) {
			sum = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + carry;
			carry = sum / 10;
			sum = sum % 10;
			result.next = new ListNode(sum);
			result = result.next;

			l1 = l1 == null ? l1 : l1.next;
			l2 = l2 == null ? l2 : l2.next;
		}
		return head.next;
	}

	/**
	 * 
	 * @param nums
	 * @return
	 */
	public ListNode initList(int[] nums) {
		ListNode l1 = new ListNode(-1), temp = null;
		for (int value : nums) {
			temp = new ListNode(value);
			temp.next = l1.next;
			l1.next = temp;
		}
		temp = l1;
		l1 = l1.next;
		temp.next = null;
		return l1;
	}
}
