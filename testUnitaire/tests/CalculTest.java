package tests;

import static org.junit.Assert.*;
import math.Calcul;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculTest {
	
	private Calcul calcul;

	@Before
	public void setUp() throws Exception {
		this.calcul = new Calcul();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testAddition() {
		double result = this.calcul.addition((double)2.89, (double)3.55);
		assertEquals((double)6.44, result, 0.001);
	}

	@Test
	public void testSoustraction() {
		double result = this.calcul.soustraction((double)-3.55, (double)3.55);
		assertEquals((double)-7.1, result, 0.001);
		
		result = this.calcul.soustraction((double)3.55, (double)3);
		assertEquals((double)0.55, result, 0.001);
		
		result = this.calcul.soustraction((double)3.55, (double)-3);
		assertEquals((double)6.55, result, 0.001);
	}

	@Test
	public void testMultiplication() {
		double result = this.calcul.multiplication((double)3.4, (double)-2.5);
		assertEquals(-8.5, result, 0.001);
		
		result = this.calcul.multiplication((double)-3.4, (double)-2.5);
		assertEquals(8.5, result, 0.001);
		
		result = this.calcul.multiplication((double)3.4, (double)2.5);
		assertEquals(8.5, result, 0.001);
	}

	@Test
	public void testDivision() {
		double result = this.calcul.division((double)3.4, (double)-2.5);
		assertEquals(-1.36, result, 0.001);
		
		result = this.calcul.division((double)-3.4, (double)-2.5);
		assertEquals(1.36, result, 0.001);
		
		result = this.calcul.division((double)2.5, (double)3.4);
		assertEquals(0.73529412, result, 0.001);
		
		result = this.calcul.division((double)2.5, (double)0);
		assertEquals(0, result, 0.001);
	}

	@Test
	public void testRacine() {
		double result = this.calcul.racine((double)9);
		assertEquals(3, result, 0.001);
	}
}
