package Lec15;

import java.util.ArrayList;

import Lec14.PathSum.TreeNode;

public class KthSmallestElement {
	
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
	    ArrayList<Integer> a = new ArrayList<>();
	    public int kthSmallest(TreeNode root, int k) {
	        inorder(root);
	        return a.get(k-1);
	    }
	    public void inorder(TreeNode root) {
	        if(root==null)
	            return;
	        inorder(root.left);
	        a.add(root.val);
	        inorder(root.right);
	    }
	}

}
