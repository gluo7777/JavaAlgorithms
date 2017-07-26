package org.william.leetcode;

import java.util.*;

public class KeyBoardRow {

	private static final char[] row1 = {'q','w','e','r','t','y','u','i','o','p'};
	private static final char[] row2 = {'a','s','d','f','g','h','j','k','l'};
	private static final char[] row3 = {'z','x','c','v','b','n','m'};

	public String[] findWords(String[] words) {
		List<String> result = new ArrayList<>();
		
		for(String word : words){
			if(isKeyBoard(word.toLowerCase()))
				result.add(word);
		}
		
		return result.toArray(new String[result.size()]);
	}

	private static boolean isKeyBoard(String str) {
		int row;

		if (isInRow(str.charAt(0), 1))
			row = 1;
		else if (isInRow(str.charAt(0), 2))
			row = 2;
		else
			row = 3;

		for (int i = 0; i < str.length(); i++) {
			if (!isInRow(str.charAt(i), row))
				return false;
		}

		return true;
	}

	private static boolean isInRow(char c, int r) {
		char[] row;

		switch (r) {
		case 1:
			row = row1;
			break;
		case 2:
			row = row2;
			break;
		default:
			row = row3;
			break;
		}

		for (int i = 0; i < row.length; i++) {
			if (row[i] == c)
				return true;
		}

		return false;
	}
}
