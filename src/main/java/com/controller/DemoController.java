package com.controller;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.model.Demo;
import com.service.DemoService;

@RestController
@RequestMapping("/demo")
public class DemoController {
	@Autowired
    private DemoService demoService;
   
    /**
     * 测试保存数据方法.
     * @return
     * @throws Exception 
     */
    @RequestMapping(value="/save",method=RequestMethod.POST)
    public String save( Demo demo) throws Exception{
 
       demoService.save(demo);//保存数据.
       return"返回";
    }
}
