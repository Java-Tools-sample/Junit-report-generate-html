package com.dugu.acc.dev.calculator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dugu.acc.dev.calculator.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorTest2 {

	private int input1;
	private int input2;
	private int expectSubResult;
	private Calculator calculator;

	@Before
	public void init() {
		input1 = 8;
		input2 = 4;
		expectSubResult = 4;
		calculator = new Calculator();
	}

	@Test
	public void SubstractionTest() {
		Assert.assertEquals(expectSubResult,
				calculator.substract(input1, input2));
	}
}
