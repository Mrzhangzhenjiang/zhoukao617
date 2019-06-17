package com.zhengzhenjiang.common.utils;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

public class DateUtilTest {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testGetRandomDate() {
		for(int i=0;i<10;i++) {
			String string = DateUtil.getRandomDate(new Date());
			System.out.println(string);
		}
	}

}
