package com.zhengzhenjiang.common.utils;

import static org.junit.Assert.*;

import java.util.Set;

import org.junit.Test;
/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
 * <br>Date:2019年6月17日
 */
public class RandomUtilTest {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testGetOneRandom() {
		for(int i=0;i<10;i++) {
			int random = RandomUtil.getOneRandom(0, 10);
			System.out.println(random);
		}
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testSubRandom() {
		for(int i=0;i<10;i++) {
			Set<Integer> set = RandomUtil.subRandom(0, 10, 5);
			System.out.println(set);
		}
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testRandomCharacter() {
		for(int i=0;i<10;i++) {
			char character = RandomUtil.randomCharacter();
			System.out.println(character);
		}
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 */
	@Test
	public void testRandomString() {
		for(int i=0;i<10;i++) {
			String string = RandomUtil.randomString(5);
			System.out.println(string);
		}
	}

}
