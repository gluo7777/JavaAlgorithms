package org.william.leetcode;

import java.util.Arrays;

public class ArrayPairSum {
	
	/**
	 * Group nums in such a way that Sum(min(Ai,Bi)) is maximized 
	 * Strategy:
	 * 1) Sort array first
	 * 2) Rationale: Sorted array ensures that  the second largest element will always be included in the sum
	 * 3) Add to result
	 * @param nums
	 * @return
	 */
	public int arrayPairSum(int[] nums) {
		int result = 0;
		
		Arrays.sort(nums);
		
		for(int i=0 ; i<=nums.length-2 ; i+=2){
			result += Math.min(nums[i], nums[i+1]);
		}
		
		return result;
	}
}
