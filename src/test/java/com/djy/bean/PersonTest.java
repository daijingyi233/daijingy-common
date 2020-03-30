package com.djy.bean;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import com.djy.utils.DateUtil;
import com.djy.utils.RandomUtil;
import com.djy.utils.StringUtil;

public class PersonTest {

	@Test
	public void testToString() {
		SimpleDateFormat f=new SimpleDateFormat("yyyy-MM-dd");
		for (int i=1;i<=10000;i++) {
			Person p=new Person(
				StringUtil.generateChineseName(),
				RandomUtil.random(1,120),
				StringUtil.randomChineseString(140),
				f.format(DateUtil.randomDate(
						new Date(2010-1-1),new Date()
						)));
			System.out.println(p);
		}
		
	}

}
