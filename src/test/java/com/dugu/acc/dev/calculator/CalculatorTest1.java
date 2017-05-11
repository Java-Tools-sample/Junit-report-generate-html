package com.dugu.acc.dev.calculator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.dugu.acc.dev.calculator.Calculator;

@SuppressWarnings("deprecation")
public class CalculatorTest1 {

	private int input1;
	private int input2;
	private int expectAddResult;
	private Calculator calculator;

	@Before
	public void init() {
		input1 = 9;
		input2 = 4;
		expectAddResult = 12;
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		Assert.assertEquals(expectAddResult, calculator.add(input1, input2));
	}

}