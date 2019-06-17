package com.zhengzhenjiang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringUtilTest {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testHasLength() {
		boolean b = StringUtil.hasLength("");
		System.out.println(b);
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testHasText() {
		boolean b = StringUtil.hasText("");
		System.out.println(b);
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testRandomChineseString() {
		String string = StringUtil.randomChineseString(3);
		System.out.println(string);
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testGenerateChineseName() {
		for(int i=0;i<10;i++) {
			String name = StringUtil.generateChineseName();
			System.out.println(name);
		}
	}

}
