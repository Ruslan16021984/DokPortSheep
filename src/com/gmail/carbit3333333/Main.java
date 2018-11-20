package com.gmail.carbit3333333;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		Sheep sheep1 = new Sheep("Паром", 10);
		Sheep sheep2 = new Sheep("Фрегат", 10);
		Sheep sheep3 = new Sheep("Торговое судно", 10);
		
		ExecutorService dok = Executors.newFixedThreadPool(2);
		dok.execute(sheep1);
		dok.execute(sheep2);
		dok.execute(sheep3);
		dok.shutdown();
		

	}

}
