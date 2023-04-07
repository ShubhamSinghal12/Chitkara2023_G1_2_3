package lec18;

import java.util.Collections;
import java.util.PriorityQueue;

public class FindMedianInDataStream {
	
	 PriorityQueue<Integer> maxhp = new PriorityQueue<>(Collections.reverseOrder());
	    PriorityQueue<Integer> minhp = new PriorityQueue<>();
	    
	    public void addNum(int num) {
	        
	        if(maxhp.size() == 0 || num < maxhp.peek())
	        {
	            maxhp.add(num);
	        }
	        else
	        {
	            minhp.add(num);
	        }
	        
	        
	        if(maxhp.size()-minhp.size() >= 2)
	        {
	            minhp.add(maxhp.remove());
	        }
	        
	        // maxhp.add(num);
	        // minhp.add(maxhp.remove());
	        
	        if(minhp.size() > maxhp.size())
	        {
	            maxhp.add(minhp.remove());
	        }
	        
	    }
	    
	    public double findMedian() {
	        
	        if(maxhp.size() == minhp.size())
	        {
	            return (maxhp.peek()+minhp.peek())/2.0;
	        }
	        else
	        {
	            return maxhp.peek();
	        }   
	    }

}
