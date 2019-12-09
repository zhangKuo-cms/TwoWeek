package com.zhangkuo.test;

import org.junit.Test;

import com.zhangkuo.entity.User;
import com.zhangkuo.util.StringUtils;
import com.zhangkuo.utils.CmsRandom;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年12月9日 上午8:51:55 

*/
public class CreateTest {
	
	@Test
	public void forUser() {
		for (int i = 0; i < 50000; i++) {
			User user = getUser();
			System.out.println(user);
		}
	}
	
	public static User getUser() {
		User user = new User();
		int id = CmsRandom.getRandomInt(1, 50000);
		user.setUid(id);
		String name = StringUtils.getRandomCn(3);
		user.setUname(name);
		String sex = getRandomSex();
		user.setSex(sex);
		String phone = getRandomPhont();
		user.setPhone(phone);
		String emile = getRandomEmile();
		user.setEmile(emile);
		String birthday = getRandomBirthday();
		user.setBirthday(birthday);
		return user;
	}

	//随机性别
	public static String getRandomSex() {
		int i = CmsRandom.getRandomInt(1, 2);
		if (i==1) {
			return "女";
		}else {
			return "男";
		}
	}
	
	public static String getRandomPhont() {
		String pho = "13";
		String randomNumber = StringUtils.getRandomNumber(9);
		return pho+randomNumber;
	}
	
	public static String getRandomEmile() {
		String emileOffic = "@qq.com,@163.com,@sian.com,@gmail.com,@sohu.com,@hotmail.com,@foxmail.com";
		String[] split = emileOffic.split(",");
		
		int i = CmsRandom.getRandomInt(3, 20);
		String emi = StringUtils.getRandomStr(i);
		
		int j = CmsRandom.getRandomInt(0, 6);
		
		String emile = emi + split[j];
		return emile;
	}
	
	public static String getRandomBirthday() {
		int year = CmsRandom.getRandomInt(1949, 2001);
		int month = CmsRandom.getRandomInt(1, 12);
		int day = CmsRandom.getRandomInt(1, 30);
		String birth = year+"-"+month+"-"+day;
		return birth;
	}
}
