package Lec12;

public class ReverseK {
	
	 public class ListNode {
	      int val;
	      ListNode next;
	      ListNode() {}
	      ListNode(int val) { this.val = val; }
	      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	  }
	class Solution {
	    public ListNode reverseKGroup(ListNode h, int k) {
	        if(h == null)
			{
				return null;
			}
			else
			{
				ListNode temp = h;
				for(int i = 1; i <= k; i++)
				{
					if(temp == null)
					{
						return h;
					}
					temp = temp.next;
				}
				ListNode prev = reverseKGroup(temp, k);
				ListNode cur = h;
				while(cur != temp)
				{
					ListNode ahead = cur.next;
					cur.next = prev;
					
					prev = cur;
					cur = ahead;
				}
				return prev;
			}
	    }
	}

}
