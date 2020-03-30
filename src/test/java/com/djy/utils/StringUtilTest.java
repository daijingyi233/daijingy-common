package com.djy.utils;

import static org.junit.Assert.*;

import java.io.UnsupportedEncodingException;

import org.junit.Test;

public class StringUtilTest {

	@Test
	public void testHasLength() {
		boolean bo = StringUtil.hasLength(" ");
		System.out.println(bo);
		boolean bo1 = StringUtil.hasLength("");
		System.out.println(bo1);
	}

	@Test
	public void testHasText() {
		boolean bo = StringUtil.hasText(" ");
		System.out.println(bo);
		boolean bo1 = StringUtil.hasText("");
		System.out.println(bo1);
		boolean bo2 = StringUtil.hasText("1");
		System.out.println(bo2);
	}

	@Test
	public void testRandomChineseString(){
		String str = StringUtil.randomChineseString(12);
		System.out.println(str);
	}

	@Test
	public void testGenerateChineseName() {
		for (int i = 0; i < 100; i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
