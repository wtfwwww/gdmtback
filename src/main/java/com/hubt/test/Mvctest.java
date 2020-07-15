package com.hubt.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;


@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations= {"classpath:applicationContext.xml","file:src/main/resources/springmvc.xml"})
public class Mvctest {
	WebApplicationContext Context;
	MockMvc mockMvc;
	public void initMockMvc() {
		mockMvc = MockMvcBuilders.webAppContextSetup(Context).build();
	}
	
	@Test
	public void test() {
		

//请求成功以后，请求域中会有pageInfo,我们可以取出pageInfo进行验证
  System.out.println(Context);
		
	}
}
