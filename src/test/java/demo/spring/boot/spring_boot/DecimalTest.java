package demo.spring.boot.spring_boot;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.Test;

public class DecimalTest {

	@Test
	public void testSetScale(){
		System.out.println(new BigDecimal(1234555).setScale(-2, RoundingMode.DOWN).toString());
	}
	
}
