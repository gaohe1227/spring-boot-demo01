package com.service;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;

import com.jpadao.DemoRepository;
import com.model.Demo;

@Service
public class DemoService {
	@Autowired
	private DemoRepository demoRepository;
   /**
 * @throws Exception 
    * 事务处理案例
    * @Title: save
    * @Description: TODO
    * @param @param demo
    * @return void
    * @throws
    */
	@Transactional
	public void save(Demo demo) throws Exception {
		try { 
			demoRepository.save(demo);
			//demoRepository.save(demo);
		//	System.out.println("***************************"+1/0);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();//事务回滚
			throw new Exception(e.getMessage());
		}
	}
}
