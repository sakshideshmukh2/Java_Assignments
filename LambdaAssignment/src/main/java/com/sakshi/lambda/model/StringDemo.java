package com.sakshi.lambda.model;

import java.util.ArrayList;
import java.util.List;

public class StringDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sakshi");
		list.add("Dhruv");
		list.add("Shivam");
		list.add("Diksha");

		StringBuilder sb = new StringBuilder();
		list.forEach((n) -> {
			sb.append(n.charAt(0));
		});

		System.out.println(sb.toString());
	}

}
