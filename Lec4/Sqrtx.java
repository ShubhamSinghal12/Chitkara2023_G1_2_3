package Lec4;

public class Sqrtx {

	public int mySqrt(int x) {
        if(x<2)return x;
        
        long start=2;
        long end = x/2;
        long mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(mid*mid == x)
                return (int)mid;
            else if(mid*mid<x){
                start=mid+1;
            }
            else
                end=mid-1;
        }
        return (int)end;
    }
	
}
