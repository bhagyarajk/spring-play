package com.learn.InnerBeans;

public class InnerBeans {
	private final JustAnotherClass another;

	InnerBeans(JustAnotherClass another) {
		this.another = another;
	}

	public void eatBreakFast() {

		System.out.println("Eating the breakfast");
	}

	public JustAnotherClass getAnother() {
		return another;
	}

}
