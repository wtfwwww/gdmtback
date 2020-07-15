package com.hubt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.hubt.mapper.roleMapper;
import com.hubt.model.role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class Mappertest {

		@Autowired
		roleMapper rMapper;
		
		//roleMapper rmapper;
		
		
		@Test
		public void testCRUD() {
			//1.创建SpringIOC容器
			//ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
			//2.从容器中获取mapper
			//UserMapper bean=ioc.getBean(UserMapper.class);
			System.out.println(rMapper);
			//userMapper.add(new User(1,"1",1,"1","12","12",1));
			
			//System.out.println(rmapper);
			rMapper.insert(new role("3","1","1"));
			
			
		}
}