package com.zhangkuo.test;

import java.util.HashMap;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.zhangkuo.entity.User;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年12月9日 上午9:43:59 

*/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:redis.xml")
public class CunUser {
	
	@Autowired
	RedisTemplate redisTemplate;
	
	@Test
	public void testHashSeri() {
		//开始时间
		long start = System.currentTimeMillis();
		HashMap<String, User> map = new HashMap<String, User>();
		for (int i = 1; i <= 50000; i++) {
			User user = CreateTest.getUser();
			map.put("user"+i, user);
//			redisTemplate.opsForValue().set("user"+i, user);
		}
		redisTemplate.opsForHash().putAll("users", map);
		long end = System.currentTimeMillis();
		System.out.println("使用的是hash的序列化方式");
		System.out.println("共使用了:"+(end-start)+" 时间");
		System.out.println("共保存了5w个数据");
	}
	
	@Test
	public void testJSONeri() {
		//开始时间
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			User user = CreateTest.getUser();
			redisTemplate.opsForValue().set("user"+i, user);
		}
		long end = System.currentTimeMillis();
		System.out.println("使用的是jdk的序列化方式");
		System.out.println("共使用了:"+(end-start)+" 时间");
		System.out.println("共保存了5w个数据");
	}
	
	@Test
	public void testJDKSeri() {
		//开始时间
		long start = System.currentTimeMillis();
		for (int i = 1; i <= 50000; i++) {
			User user = CreateTest.getUser();
			redisTemplate.opsForValue().set("user"+i, user);
		}
		long end = System.currentTimeMillis();
		System.out.println("使用的是jdk的序列化方式");
		System.out.println("共使用了:"+(end-start)+" 时间");
		System.out.println("共保存了5w个数据");
	}
}
