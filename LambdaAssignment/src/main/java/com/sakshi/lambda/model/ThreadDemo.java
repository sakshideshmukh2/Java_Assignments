package com.sakshi.lambda.model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ThreadDemo {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Consumer<Integer> display = (i) -> System.out.println(i);
				list.forEach(display);
			}

		});
		thread.start();
	}

}
