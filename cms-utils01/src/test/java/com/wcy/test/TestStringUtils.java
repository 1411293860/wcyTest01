package com.wcy.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.wangchaoyue.StringUtils01;

/**
 * @author 王超越
 *
 * 2019年11月8日
 */
public class TestStringUtils {
	
	@Test
	public void testIsBlank() {
		
		assertTrue(StringUtils01.isBlank("  "));
		
	}
	
	@Test
	public void testIsBlank2() {
		//断言
		assertFalse(StringUtils01.isBlank("aaa"));
	}
}
