package com.calculator_dry_coc.computinginterface;

/**
 * ����ӿ�
 * 
 * @author YY
 * 
 */
public interface Computinginterface {

	public void SimplCompute(int number, int number2, String symbol);

	// addΪ����ļӷ�����������DRY
	public void add(int number, int number2, String symbol);

	// ����
	public void compute(int number, int number2, String symbol);
}
