package com.java.inheritance;

public class Tester extends Employee {
	String[] tools;

	public Tester(int id, String name, String dept, double salary, String[] tools) {
		super(id, name, dept, salary);
		this.tools = tools;
	}

	@Override
	protected void work() {
		super.work();
		System.out.println("Tester:");

		for (int i = 0; i < tools.length; i++) {
			System.out.println(tools[i]);
		}
	}
}
