package com.kiss.main;

/**
 * kissԭ��  �ַ����ۼ� ʹ��StringBuffer
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
	 * ��ͨ����
	 */
	public static void ordinary() {
		String i = "";
		for (int j = 0; j < 1000; j++) {
			i = i + j;
		}
		System.out.println(i);
	}

	/**
	 * kissԭ��
	 */
	public static void kissPrinciple() {
		StringBuffer sb = new StringBuffer();
		for (int j = 0; j < 1000; j++) {
			sb.append(j);
		}
		System.out.println(sb.toString());
	}
}
