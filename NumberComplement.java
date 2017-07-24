package org.william.leetcode;

public class NumberComplement {
	
	/**
	 * Convert integer param to binary
	 * 
	 * @param num
	 * @return
	 */
	public int findComplement(int num) {
		int result = 0;
		
		String binNum = Integer.toBinaryString(num), cBinNum = num >= 0 ? "+" : "-";
		
		for(int i=0 ; i<binNum.length() ; i++){
			char c = binNum.charAt(i);
			if(c == '0'){
				cBinNum += '1';
			}else{
				cBinNum += '0';
			}
		}
		
		result = Integer.parseInt(cBinNum, 2);
		
		return result;
	}
}
