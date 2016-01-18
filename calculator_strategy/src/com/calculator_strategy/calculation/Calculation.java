package com.calculator_strategy.calculation;

import com.calculator_strategy.computinginterface.impl.Addimpl;
import com.calculator_strategy.computinginterface.impl.DivisionImpl;
import com.calculator_strategy.computinginterface.impl.Multiplicationimpl;
import com.calculator_strategy.computinginterface.impl.Subtractionimpl;

/**
 * 计算
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
			msg = "加法和为" + sum;
		} else if ("-" == symbol) {
			sum = new Subtractionimpl().subtraction(number, number2);
			msg = "减法法和为" + sum;
		} else if ("*" == symbol) {
			sum = new Multiplicationimpl().compute(number, number2);
			msg = "乘法法和为" + sum;
		} else if ("/" == symbol) {
			try {
				sum = new DivisionImpl().division(number, number2);
				msg = "除法和为" + sum;
			} catch (Exception e) {
				msg = "除法运算被除数不能为0";
			}
		} else {
			msg = "您输入的符号错误";
		}
		System.out.println(msg);
	}
}
