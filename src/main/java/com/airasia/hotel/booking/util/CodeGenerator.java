
package com.airasia.hotel.booking.util;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CodeGenerator {

	public static void main(String[] args) {

		randomNumbers(10);
	}

	public static Set<String> randomNumbers(int size) {
		Set<String> ramdomNumSet = new HashSet<String>();
		Date currentDate = new Date();
		DateFormat df = new SimpleDateFormat("yyMM");
		String yearMonth = df.format(currentDate);
		String randomNum = "";
		System.out.println(randomNum);
		Random random = null;
		while (size > ramdomNumSet.size()) {
			random = new Random();
			int num = random.nextInt(10000);
			randomNum = "DC" + yearMonth + ramdomNumSet.size() + num;
			ramdomNumSet.add(randomNum);
			System.out.println(randomNum);
		}
		return ramdomNumSet;
	}
}
