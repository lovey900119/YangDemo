package com.calculator_dry_coc.calculator;

import com.calculator_dry_coc.computinginterface.impl.ComputinginterfaceImpl;
import com.calculator_dry_coc.constants.Constants;

public class Calculator {

	// ����
	public static void main(String[] args) {

		ComputinginterfaceImpl computinginterface = new ComputinginterfaceImpl();
		computinginterface.compute(10, 0, "+");
		computinginterface.SimplCompute(10, 0, "+");	//���෽��������dry
		
		/*���ǽ�һЩ���ϵ����÷�ʽ����Ϣ��Ϊ�ڲ�ȱʡ�Ĺ�����ʹ�á����磬Hibernate��ӳ���ļ������Լ���ֶ�����������һ�µĻ��������ϾͿ��Բ�Ҫ��������ļ���*/
		/*�����ڴ˷���  ��֪��name�������ֵ�ʱ��  Ҳ�Ͳ���ע����*/
		System.out.print(Constants.NAME="����");
	}
}
