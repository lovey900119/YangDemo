package com.calculator_strategy.computinginterface.impl;

import com.calculator_strategy.computinginterface.Subtraction;

/**
 * ����ʵ��
 * 
 * @author YY
 * 
 */
public class Subtractionimpl implements Subtraction {

	@Override
	public int subtraction(int number, int number2) {
		return number - number2;
	}

}
