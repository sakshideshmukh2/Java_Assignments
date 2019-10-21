package com.sakshi.lambda.model;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {

	public static void main(String[] arg) {
		Map<Integer, String> car = new HashMap<Integer, String>();

		car.put(1, "Suzuki");
		car.put(2, "Tata");
		car.put(3, "Hyundai");
		car.put(4, "Honda");

		System.out.println(car);

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<Integer, String> keyvalue : car.entrySet()) {
			sb.append(keyvalue.getKey());
			sb.append(keyvalue.getValue());
		}
		System.out.println(sb.toString());
	}
}
