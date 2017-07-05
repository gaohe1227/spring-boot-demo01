package com.aop;

import java.util.Date;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class TimeLimitAop {
	ThreadLocal<Long> timer=new ThreadLocal<Long>();
	@Before("execution(* com.*.*.*(..))")
	public void beforeMethod(){
		timer.set(System.currentTimeMillis());
	}
	 
	@After("execution(* com.*.*.*(..))")
	public void afterMethod(JoinPoint point){
		Long start=timer.get();//结束时间
		Long end=System.currentTimeMillis();
		System.out.println("方法:"+point.getSignature().getName()+"执行时间为"+(end-start));
	}

}
