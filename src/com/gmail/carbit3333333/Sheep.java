package com.gmail.carbit3333333;

public class Sheep implements Runnable {
	private String name;
	private int box = 10;

	public Sheep(String name, int box) {
		super();
		this.name = name;
		this.box = box;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBox() {
		return box;
	}

	public void setBox(int box) {
		this.box = box;
	}

	@Override
	public void run() {
		do {
			box -= 1;
			System.out.println(getName() + " разгрузил груз " + box + "\n");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} while (box > 0);
		System.out.println(getName()+ " разгрузил весь груз");
	}

}
