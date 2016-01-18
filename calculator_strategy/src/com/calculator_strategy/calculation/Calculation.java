package com.calculator_strategy.calculation;

import com.calculator_strategy.computinginterface.impl.Addimpl;
import com.calculator_strategy.computinginterface.impl.DivisionImpl;
import com.calculator_strategy.computinginterface.impl.Multiplicationimpl;
import com.calculator_strategy.computinginterface.impl.Subtractionimpl;

/**
 * ����
 * 
 * @author YY
 * 
 */
public class Calculation {

	public void compute(int number, int number2, String symbol) {
		String msg = "";
		int sum;
		if ("+" == symbol) {
			sum = new Addimpl().add(number, number2);
			msg = "�ӷ���Ϊ" + sum;
		} else if ("-" == symbol) {
			sum = new Subtractionimpl().subtraction(number, number2);
			msg = "��������Ϊ" + sum;
		} else if ("*" == symbol) {
			sum = new Multiplicationimpl().compute(number, number2);
			msg = "�˷�����Ϊ" + sum;
		} else if ("/" == symbol) {
			try {
				sum = new DivisionImpl().division(number, number2);
				msg = "������Ϊ" + sum;
			} catch (Exception e) {
				msg = "�������㱻��������Ϊ0";
			}
		} else {
			msg = "������ķ��Ŵ���";
		}
		System.out.println(msg);
	}
}
