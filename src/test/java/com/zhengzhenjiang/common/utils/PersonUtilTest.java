package com.zhengzhenjiang.common.utils;

import static org.junit.Assert.*;

import org.junit.Test;

public class PersonUtilTest {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testGetRandomPerson() {
		for(int i=0;i<100;i++) {
			Person person = PersonUtil.getRandomPerson();
			System.out.println(person);
		}
	}

}
