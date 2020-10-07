package kr.itedu.ex10.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import kr.itedu.ex10.Calc;

class CalTest {

	@Test
	void test() {
		Assert.assertEquals(3, Calc.sum(1, 2));
		Assert.assertEquals(4, Calc.sum(2, 2));
		Assert.assertEquals(5, Calc.sum(3, 2));
	}
}
