package com.kiss.main;

/**
 * kiss原则  字符串累加 使用StringBuffer
 * 
 * @author YY
 * 
 */
public class kiss {

	public static void main(String[] args) {
		ordinary();
		kissPrinciple();
	}

	/**
	 * 普通方法
	 */
	public static void ordinary() {
		String i = "";
		for (int j = 0; j < 1000; j++) {
			i = i + j;
		}
		System.out.println(i);
	}

	/**
	 * kiss原则
	 */
	public static void kissPrinciple() {
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < 1000; j++) {
			sb.append(j);
		}
		System.out.println(sb.toString());
	}
}
