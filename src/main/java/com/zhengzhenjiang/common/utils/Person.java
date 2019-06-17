package com.zhengzhenjiang.common.utils;
/**
 * 
 * <br>Title:TODO 类标题
 * <br>Description:TODO 类功能描述
 * <br>Author:Mr.ZhangZhenJiang(2395132803@qq.com)
 * <br>Date:2019年6月17日
 */
public class Person {
	private String name;
	private int age;
	private String content;
	private String createtime;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public Person(String name, int age, String content, String createtime) {
		super();
		this.name = name;
		this.age = age;
		this.content = content;
		this.createtime = createtime;
	}
	public Person() {
		super();
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", content=" + content + ", createtime=" + createtime + "]";
	}
	
}
