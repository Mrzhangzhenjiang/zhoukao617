package com.zhengzhenjiang.common.utils;

import java.util.Date;
/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
 * <br>Date:2019年6月17日
 */
public class PersonUtil {
	public static Person getRandomPerson() {
		Person p=new Person(StringUtil.generateChineseName(),RandomUtil.getOneRandom(0, 100),StringUtil.randomChineseString(140),DateUtil.getRandomDate(new Date()));
		return p;
	}
}
