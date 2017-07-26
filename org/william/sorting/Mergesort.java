package org.william.sorting;

import java.util.LinkedList;
import java.util.List;

/**
 * More efficient with a doubly linked list
 * 
 * @author gluo7
 *
 */
public class Mergesort {

	public static void sort(int[] arr) {
		if (arr.length < 2) {
			return;
		}

		int mid = arr.length / 2;

		int[] L = new int[mid];
		int[] R = new int[arr.length - mid];

		for (int i = 0; i < mid; i++)
			L[i] = arr[i];
		for (int j = mid; j < arr.length; j++)
			R[j - mid] = arr[j];

		sort(L);
		sort(R);

		merge(L, R, arr);
	}

	/**
	 * Assumes that left and right halves are sorted
	 * 
	 * @param arr
	 *            base array
	 * @param l
	 *            beginning index
	 * @param m
	 *            middle index / split
	 * @param r
	 *            right index
	 */
	public static void merge(int[] left, int[] right, int[] arr) {
		int len1 = left.length, len2 = right.length;
		int i = 0, j = 0, k = 0;
		while (i < len1 && j < len2) {
			if (left[i] <= right[j]) {
				arr[k] = left[i];
				i++;
			} else {
				arr[k] = right[j];
				j++;
			}
			k++;
		}
		while (i < len1) {
			arr[k] = left[i];
			i++;
			k++;
		}
		while (j < len2) {
			arr[k] = right[j];
			j++;
			k++;
		}
	}

}
