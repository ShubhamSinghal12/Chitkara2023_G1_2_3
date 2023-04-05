package Lec15;



public class ConstructBSTUsingSortedArray {
	
	public class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	     TreeNode() {}
	      TreeNode(int val) { this.val = val; }
	      TreeNode(int val, TreeNode left, TreeNode right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	      }
	  }
	
	class Solution {
	    public TreeNode sortedArrayToBST(int[] nums) {
	        return toBst(nums,0,nums.length-1);
	    }
	    public TreeNode toBst(int[] nums,int l, int r) {
	        if(l>r)
	            return null;
	        int m = (l+r)/2;
	        TreeNode root = new TreeNode(nums[m]);
	        root.left = toBst(nums,l,m-1);
	        root.right = toBst(nums,m+1,r);
	        return root;
	    }
	}

}
