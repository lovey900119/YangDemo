package com.calculator_dry_coc.computinginterface.impl;

import com.calculator_dry_coc.computinginterface.Computinginterface;
import com.calculator_dry_coc.constants.Constants;

/**
 * 计算实现
 * 
 * @author YY
 * 
 */
public class ComputinginterfaceImpl implements Computinginterface {

	// 使用配置
	public void SimplCompute(int number, int number2, String symbol) {
		String msg = "";
		if (Constants.ADD == symbol) {
			msg = "加法和为" + (number + number2);
		} else if (Constants.SUBTRACTION == symbol) {
			msg = "减法法和为" + (number - number2);
		} else if (Constants.MULTIPLICATION == symbol) {
			msg = "乘法法和为" + (number * number2);
		} else if (Constants.DIVISION == symbol) {
			try {
				msg = "除法和为" + (number / number2);
			} catch (Exception e) {
				msg = "除法运算被除数不能为0";
			}
		} else {
			msg = "您输入的符号错误";
		}
		System.out.println(msg);
	}

	// add为多余的加法方法不符合DRY
	public void add(int number, int number2, String symbol) {
		String msg = "";
		if ("+" == symbol) {
			msg = "加法和为" + (number + number2);
		}
		msg = "您输入的符号错误";
		System.out.println(msg);
	}

	public void compute(int number, int number2, String symbol) {
		String msg = "";
		if ("+" == symbol) {
			msg = "加法和为" + (number + number2);
		} else if ("-" == symbol) {
			msg = "减法法和为" + (number - number2);
		} else if ("*" == symbol) {
			msg = "乘法法和为" + (number * number2);
		} else if ("/" == symbol) {
			try {
				msg = "除法和为" + (number / number2);
			} catch (Exception e) {
				msg = "除法运算被除数不能为0";
			}
		} else {
			msg = "您输入的符号错误";
		}
		System.out.println(msg);
	}

}
