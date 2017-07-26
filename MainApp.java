
import java.util.Arrays;

import org.william.leetcode.*;
import org.william.sorting.*;

/**
 * @author gluo7
 *
 */
public class MainApp {
	public static void main (String [] args){
		int [] arr = {1,3,5,7,2,4,6,8,10,10,9,-33};
		//Mergesort.merge(arr, 0, arr.length/2, arr.length);
		Mergesort.sort(arr);
		System.out.println(Arrays.toString(arr));
	}
	
	
}
