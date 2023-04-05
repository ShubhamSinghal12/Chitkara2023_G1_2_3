package Lec11;

public class CoinChange2 {
	
	 public int change(int amount, int[] coins) {
	        return changeCoin(amount,coins,0);
	    }
	    public int changeCoin(int amount, int[] coins, int k) {
	        if(amount==0){
	            return 1;
	        }
	        int ans=0;
	        for(int i=k; i<coins.length; i++){
	            if(amount>=coins[i])
	                ans+=changeCoin(amount-coins[i],coins,i);
	        }
	        return ans;
	        
	    }

}
