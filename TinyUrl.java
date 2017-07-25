package org.william.leetcode;

import java.util.Stack;

/**
 * Alphabet [a-z0-9]
 * All lowercase and numbers to remember easier
 * Use base 36
 * @author gluo7
 *
 */
public class TinyUrl {
	
	private static final int BASE = 26;
	private static final int OFFSET = 97;
	
	private int id;
	private static int count=1000;
	
	public TinyUrl(){
		this.id = count++;
	}
	
	// Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        Stack<Integer> digits = new Stack<>();
        
        int num = id, remainder;
        while(num > 0){
        	remainder = num % BASE;
        	digits.push(remainder + OFFSET);
        	num = num / BASE;
        }
        
        String url = "";
        
        while(!digits.empty()){
        	int digit = digits.pop();
        	url += (char) digit;
        }
        
        return url;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return "";
    }
}
