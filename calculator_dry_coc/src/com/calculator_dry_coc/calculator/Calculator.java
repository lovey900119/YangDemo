package com.calculator_dry_coc.calculator;

import com.calculator_dry_coc.computinginterface.impl.ComputinginterfaceImpl;
import com.calculator_dry_coc.constants.Constants;

public class Calculator {

	// 计算
	public static void main(String[] args) {

		ComputinginterfaceImpl computinginterface = new ComputinginterfaceImpl();
		computinginterface.compute(10, 0, "+");
		computinginterface.SimplCompute(10, 0, "+");	//多余方法不符合dry
		
		/*就是将一些公认的配置方式和信息作为内部缺省的规则来使用。例如，Hibernate的映射文件，如果约定字段名和类属性一致的话，基本上就可以不要这个配置文件了*/
		/*类似于此方法  当知道name代表名字的时候  也就不用注释了*/
		System.out.print(Constants.NAME="杨阳");
	}
}
