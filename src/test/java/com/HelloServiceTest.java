package com;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import com.service.HellowService;
/**
 * 
 * Title:HelloServiceTest
 * Description:测试案例
 * Company:chaoxing
 * @author:高鹤
 * @date:2017年7月3日
 */
////SpringJUnit支持，由此引入Spring-Test框架支持！
@RunWith(SpringJUnit4ClassRunner.class)

////指定我们SpringBoot工程的Application启动类
@SpringApplicationConfiguration(classes = App.class)

///由于是Web项目，Junit需要模拟ServletContext，因此我们需要给我们的测试类加上@WebAppConfiguration。
@WebAppConfiguration
public class HelloServiceTest {
	   @Resource
	    private HellowService hellowService;
	   @Test
	    public void testGetName(){
		   System.out.println("测试");
	       Assert.assertEquals("hello",hellowService.getName());
	    }
	 
}
