package com.calculator_strategy.computinginterface.impl;

import com.calculator_strategy.computinginterface.Multiplication;

/**
 * �˷�ʵ��
 * 
 * @author YY
 * 
 */
public class Multiplicationimpl implements Multiplication {

	@Override
	public int compute(int number, int number2) {
		return number * number2;
	}

}
