package com.zhengzhenjiang.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
 * <br>Date:2019年6月17日
 */
public class DateUtil {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 * @param src
	 * @return
	 */
	public static String getRandomDate(Date src) {
		Calendar c = Calendar.getInstance();
		c.setTime(src);
		c.set(RandomUtil.getOneRandom(2010, 2019), RandomUtil.getOneRandom(1, 12), 0, RandomUtil.getOneRandom(1, 24), RandomUtil.getOneRandom(0, 60));
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String string = df.format(c.getTime());
		return string;
	}
}
