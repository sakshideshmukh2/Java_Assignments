package com.sakshi.lambda.model;

import java.util.ArrayList;
import java.util.List;

public class OddLengthDemo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Sakshi");
		list.add("Dhruv");
		list.add("Shivam");
		list.add("Priya");

		System.out.println("List:" + list);
		list.removeIf(name -> name.length() % 2 != 0);
		System.out.println("The Names without Odd Length :" + list);

	}

}
