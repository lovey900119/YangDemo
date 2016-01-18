package com.calculator_dry_coc.computinginterface;

/**
 * 计算接口
 * 
 * @author YY
 * 
 */
public interface Computinginterface {

	public void SimplCompute(int number, int number2, String symbol);

	// add为多余的加法方法不符合DRY
	public void add(int number, int number2, String symbol);

	// 计算
	public void compute(int number, int number2, String symbol);
}
