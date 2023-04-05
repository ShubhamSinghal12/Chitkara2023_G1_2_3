package Lec12;

public class RemoveNthNodeFromLast {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	 
	class Solution {
	    public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode temp = new ListNode(-1);
	        temp.next = head;
	        ListNode p1 = temp;
	        for(int i = 1; i<= n; i++)
	            p1 = p1.next;
	        ListNode p2 = temp;
	        while(p1.next != null)
	        {
	            p1= p1.next;
	            p2 = p2.next;
	        }
	        p2.next = p2.next.next;
	        return temp.next;
	    }
	}






}
