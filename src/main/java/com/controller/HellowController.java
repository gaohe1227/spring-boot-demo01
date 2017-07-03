package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Studemt;
import com.service.TaskService;

@RestController
public class HellowController {
	@Autowired
	private  TaskService taskService;
	/**
	 * 
	 * @Title: hellow
	 * @Description: TODO
	 * @param @param name
	 * @param @return
	 * @return String
	 * @throws
	 */
	@RequestMapping("/hellow/{name}")
   public String hellow(@PathVariable("name")String name){
		System.out.println(taskService.getName());
	   return "Hellow,"+name;
   }
	@RequestMapping("/jsonDemo/{age}/{name}")
	public Studemt getStudent(	@PathVariable("age")Integer age,@PathVariable("name")String name){
		return new Studemt(age, name);
	}
	/**
	 * 
	 * @Title: hellow
	 * @Description: 一场处理
	 * @param @return
	 * @param @throws Exception
	 * @return String
	 * @throws
	 */
	@RequestMapping("/hellow/error")
	   public String hellow()throws Exception{
		int i=100/0;
		   return "Hellow,error";
	   }
}
