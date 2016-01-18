package com.calculator_dry_coc.computinginterface.impl;

import com.calculator_dry_coc.computinginterface.Computinginterface;
import com.calculator_dry_coc.constants.Constants;

/**
 * ����ʵ��
 * 
 * @author YY
 * 
 */
public class ComputinginterfaceImpl implements Computinginterface {

	// ʹ������
	public void SimplCompute(int number, int number2, String symbol) {
		String msg = "";
		if (Constants.ADD == symbol) {
			msg = "�ӷ���Ϊ" + (number + number2);
		} else if (Constants.SUBTRACTION == symbol) {
			msg = "��������Ϊ" + (number - number2);
		} else if (Constants.MULTIPLICATION == symbol) {
			msg = "�˷�����Ϊ" + (number * number2);
		} else if (Constants.DIVISION == symbol) {
			try {
				msg = "������Ϊ" + (number / number2);
			} catch (Exception e) {
				msg = "�������㱻��������Ϊ0";
			}
		} else {
			msg = "������ķ��Ŵ���";
		}
		System.out.println(msg);
	}

	// addΪ����ļӷ�����������DRY
	public void add(int number, int number2, String symbol) {
		String msg = "";
		if ("+" == symbol) {
			msg = "�ӷ���Ϊ" + (number + number2);
		}
		msg = "������ķ��Ŵ���";
		System.out.println(msg);
	}

	public void compute(int number, int number2, String symbol) {
		String msg = "";
		if ("+" == symbol) {
			msg = "�ӷ���Ϊ" + (number + number2);
		} else if ("-" == symbol) {
			msg = "��������Ϊ" + (number - number2);
		} else if ("*" == symbol) {
			msg = "�˷�����Ϊ" + (number * number2);
		} else if ("/" == symbol) {
			try {
				msg = "������Ϊ" + (number / number2);
			} catch (Exception e) {
				msg = "�������㱻��������Ϊ0";
			}
		} else {
			msg = "������ķ��Ŵ���";
		}
		System.out.println(msg);
	}

}
