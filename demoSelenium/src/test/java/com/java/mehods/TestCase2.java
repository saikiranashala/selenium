package com.java.mehods;

public class TestCase2 {

	public static void main(String[] args) {

		TestClass2 tcObj = new TestClass2("mca", 8);
		String s1 = tcObj.printCourse();
		System.out.println(s1);
		System.out.println(tcObj.printCourse());

		tcObj.addTest();
		tcObj.substractionTest();
		double s2 = tcObj.printSal();
		System.out.println(s2);

		System.out.println(tcObj.printSal());
	}
}
