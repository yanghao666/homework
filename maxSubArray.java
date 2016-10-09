package com.gxc.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
/**
 * ±©¡¶À„∑®
 * @author star
 *
 */
@RunWith(Parameterized.class)
public class TestDemo1 {

		float expected =0;
		float[] input={};
		
		public TestDemo1(float expected,float[] input)
		{
			this.expected = expected;
			this.input =input;
		}
		
		@Parameters
		public static Collection<Object[]> t()
		{
			float[] a1={-2,5,3,-6,-8,6};
			float[] a2={1,-2,3,5,-1,2};
			float[] a3={-88,-35,0,-67,3,-48,-12,-23,-76};
			return Arrays.asList(
					new Object[][]{
						{8,a1},
						{9,a2},
						{75,a3}
						});
		}
		
		@Test
		public void testShowMax()
		{
			assertEquals(expected,Test1.maxSubSumCubic(input),0.0);
		}
}
