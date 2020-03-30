package com.djy.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class RandomUtilTest {

	@Test
	public void testRandom() {
		for (int i = 0; i <100; i++) {
			int num=RandomUtil.random(1, 3);
			System.out.println(num);
		}
	}

	@Test
	public void testSubRandom() {
		int[] sub = RandomUtil.subRandom(1,14,10);
		for (int i : sub) {
			System.out.println(i);
		}
	}

	@Test
	public void testRandomCharacter() {
		for (int i = 0; i <100; i++) {
			char zf = RandomUtil.randomCharacter();
			System.out.println(zf);
		}
		
	}

	@Test
	public void testRandomString() {
		String str = RandomUtil.randomString(10);
		System.out.println(str);
	}

}
