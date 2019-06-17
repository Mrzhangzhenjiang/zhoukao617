package com.zhengzhenjiang.common.utils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;
/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
 * <br>Date:2019年6月17日
 */
public class RandomUtil {
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 * @param min
	 * @param max
	 * @return
	 */
	public static int getOneRandom(int min,int max) {
		Random random=new Random();
		return random.nextInt(max-min+1)+min;
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 * @param min
	 * @param max
	 * @param subs
	 * @return
	 */
	public static Set<Integer> subRandom(int min,int max,int subs){
		Set<Integer> set=new HashSet<Integer>();
		while(set.size()!=subs) {
			Random random=new Random();
			int result = random.nextInt(max-min+1);
			set.add(result+min);
		}
		return set;
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 * @return
	 */
	public static char randomCharacter() {
		String src="123456789zxcvbnmasdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP";
		int index = getOneRandom(0,src.length()-1);
		return src.charAt(index);
	}
	/**
	 * 
	 * <br>Description:TODO 方法功能描述
	 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
	 * <br>Date:2019年6月17日
	 * @param length
	 * @return
	 */
	public static String randomString(int length) {
		String midstring="";
		for(int i=0;i<length;i++) {
			char randomCharacter = randomCharacter();
			String string = String.valueOf(randomCharacter);
			midstring+=string;
		}
		return midstring;
	}
}
