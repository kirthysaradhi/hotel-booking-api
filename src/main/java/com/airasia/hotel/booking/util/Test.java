package com.airasia.hotel.booking.util;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main1(String[] args) {
		List<String> ls = new ArrayList<>();
		for (int i = 1; i < 101; i++) {
			ls.add(i + "Iteration");
		}
		// System.out.println(ls);
		int maxSize = 20;
		int size = (ls.size() / maxSize);
		if (size == 0)
			size = 1;
		int nextItr = 0;
		StringBuffer sb = new StringBuffer("");
		for (int k = 1; k < size + 1; k++) {
			System.out.println("List:" + k);
			// int z = 0;
			// i = printStr("", ls, i,maxSize);
			/*
			 * for(;i<ls.size();i++) { System.out.print("<"+ ls.get(i) +"> ");
			 * if(z>maxSize-1) { break; } z = z+1;
			 * 
			 * }
			 */

			int resetVal = 1;
			for (; nextItr < ls.size(); nextItr++) {
				if (resetVal > maxSize) {
					break;
				}
				sb.append(" <" + ls.get(nextItr) + "> ");
				// System.out.print("<"+ list.get(nextItr) +"> ");
				resetVal = resetVal + 1;
			}

			System.out.println();
		}
	}

	public static int printStr(String str, List<String> list, int nextItr, int maxSize1) {
		// System.out.println(str);
		// System.out.println("\n");
		int maxSize = maxSize1;
		int resetVal = 1;
		for (; nextItr < list.size(); nextItr++) {
			if (resetVal > maxSize) {
				break;
			}
			System.out.print("<" + list.get(nextItr) + "> ");
			resetVal = resetVal + 1;
		}
		return nextItr;
	}

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		for (int count = 0; count < 161; count++) {
			list.add(count + "Iteration");
		}
		processRecords(list);
	}

	public static void processRecords(List<String> list) {
		int maxSize = 20;
		int nextItr = 0;
		StringBuffer sb = new StringBuffer("");

		int size = (list.size() / maxSize)+1;
		/*if (size == 0) {
			size = 1;
		}*/
		for (int itr = 1; itr < size + 1; itr++) {
			int resetVal = 1;
			sb = new StringBuffer("");
			System.out.println("List:" + itr);
			/*
			 * for (; nextItr < list.size(); nextItr++) { if (resetVal > maxSize) { break; }
			 * sb.append(list.get(nextItr) + " "); resetVal = resetVal + 1; }
			 */
			while(nextItr < list.size()) {
				if (resetVal > maxSize) {
					break;
				}
				sb.append(list.get(nextItr) + " ");
				resetVal = resetVal + 1;
				nextItr++;
			}
			prStr(sb.toString());
		}
	}
	
	public static void prStr(String str) {
		System.out.println(str);
	}
}
