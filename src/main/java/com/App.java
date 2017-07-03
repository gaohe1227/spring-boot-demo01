package com;

import javax.servlet.MultipartConfigElement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.MultipartConfigFactory;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.service.TaskService;
import com.servlet.DemoServlet;

@EnableTransactionManagement
@SpringBootApplication
// 其中@SpringBootApplication申明让spring boot自动给程序进行必要的配置，
// 等价于以默认属性使用@Configuration，@EnableAutoConfiguration和@ComponentScan
@ServletComponentScan//这个就是扫描相应的Servlet包;
public class App extends SpringBootServletInitializer {
    /**
     * Servlet注册使用
     */
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(this.getClass());
	}
	/**
	 * 代码注册Servlet案例
	 * @Title: MyServlet1
	 * @Description: TODO
	 * @param @return
	 * @return ServletRegistrationBean
	 * @throws
	 *//*
	 @Bean
     public ServletRegistrationBean MyServlet1(){
               return new ServletRegistrationBean(new DemoServlet(),"/demoServlet/*");
     }*/
	/**
	 * 
	 * @Title: multipartConfigElement
	 * @Description: 限制上传文件
	 * @param @return
	 * @return MultipartConfigElement
	 * @throws
	 */
/*	@Bean 
    public MultipartConfigElement multipartConfigElement() { 
        MultipartConfigFactory factory = new MultipartConfigFactory();
        //// 设置文件大小限制 ,超了，页面会抛出异常信息，这时候就需要进行异常信息的处理了;
        factory.setMaxFileSize("128KB"); //KB,MB
        /// 设置总上传数据总大小
        factory.setMaxRequestSize("256KB"); 
        //Sets the directory location where files will be stored.
        //factory.setLocation("路径地址");
        return factory.createMultipartConfig(); 
    } */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SpringApplication.run(App.class, args);
		System.err.println("启动完成");
		 
	}

}
