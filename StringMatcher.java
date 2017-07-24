package org.william.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringMatcher {
	public static List<Integer> match_string(String pattern, String text){
		List<Integer> listOfPos = new ArrayList<>();
		int P = pattern.length();
		int T = text.length();
		
		// Generate an LPS for pattern
		int lps[] = new int[P];
		computeLPSArray(pattern, P, lps);
		
		int i = 0; // index for text
		int j = 0; // index for pattern
		
		while(i<T){
			if(pattern.charAt(j) == text.charAt(i)){
				j++;
				i++;
			}
			if(j == P){ // reached end of pattern means found a match
				listOfPos.add(i-j);
				j = lps[j-1];
			}
			else if(i<T && pattern.charAt(j) != text.charAt(i)){
				if(j != 0)
					j = lps[j-1];
				else
					i++;
			}
		}
		
		return listOfPos;
	}
	
	static void computeLPSArray(String pat, int patLen, int lps[])
    {
        int longest = 0;
        
        // skip 0 as it always contains 0
        int i = 1;
        lps[0] = 0;
        
        System.out.println("i: "+i+"\tlongest: "+longest+"\tLPS:"+Arrays.toString(lps));
        // i = 1 to patLen-1
        while (i < patLen)
        {
            if (pat.charAt(i) == pat.charAt(longest))
            {
                longest++;
                lps[i] = longest;
                i++;
            }
            /**
             * Decrements longest until a match with a smaller LPS or reach conclusion that no sub LPS exists for pat.substr(0,i+1)
             */
            else
            {
                if (longest != 0)
                {
                    longest = lps[longest-1];
                }
                else
                {
                    lps[i] = 0;
                    i++;
                }
            }
            System.out.println("i: "+i+"\tlongest: "+longest+"\tLPS:"+Arrays.toString(lps));
        }
    }
}
