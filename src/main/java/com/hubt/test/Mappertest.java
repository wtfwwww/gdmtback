package com.hubt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import com.hubt.mapper.OrganMapper;
import com.hubt.mapper.ResourceMapper;
import com.hubt.mapper.RoleMapper;
import com.hubt.mapper.RoleOrganMapper;
import com.hubt.mapper.UserMapper;
import com.hubt.model.Duty;
import com.hubt.model.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations= {"classpath:applicationContext.xml"})
public class Mappertest {

		@Autowired
		UserMapper rMapper;
		
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
			//rMapper.insert(new role("8","1","1"));
			//rMapper.getParent("9");
			//rMapper.getResources();
			//rMapper.getParentById("17");
			//rMapper.findChildren("42554f47c8614d7f8da370d8c7803f41");
			//rMapper.selectByPrimaryKey(1);
			//rMapper.findRoleNameByUuid("1");
			
			rMapper.findOrgan("襄阳电厂");
		}
}