package com.dugu.acc.dev.calculator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dugu.acc.dev.calculator.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorTest3 {

	private int input1;
	private int input2;
	private int expectMulResult;
	private Calculator calculator;

	@Before
	public void init() {
		input1 = 8;
		input2 = 4;
		expectMulResult = 32;
		calculator = new Calculator();
	}

	@Test
	public void mulTest() {
		Assert.assertEquals(expectMulResult,
				calculator.multiple(input1, input2));
	}

}
