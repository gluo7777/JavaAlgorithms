package org.william.sorting;

import java.util.LinkedList;
import java.util.List;

/**
 * More efficient with a doubly linked list
 * @author gluo7
 *
 */
public class Mergesort {
	/**
	 * 
	 * @param list to be sorted
	 * @return a sorted list
	 */
	public static int [] sort(int [] arr, int l, int r){
		if(arr.length <= 1){
			return arr;
		}
		
		int m = (l + r) / 2;
		
		sort(arr,l,m);
		sort(arr,m + 1,r);
		
		return merge(arr,l,m,r);
	}
	
	/**
	 * Orders and combines two lists
	 * @param list
	 * @return merged, sorted list
	 */
	private static int[] merge(int [] arr, int l, int m, int r){
		int [] merged = new int[arr.length];
		
		while(l < m && m < r){
			
			
			
			l++;
			m++;
		}
		
		return merged;
	}
}
















