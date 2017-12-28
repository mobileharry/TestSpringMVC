package com.demo.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import com.demo.web.services.GoodsService;

//注解映射
@Controller
@RequestMapping(value = "/MyController1")
public class HelloWorld1Controller {

	@Resource
    GoodsService goodsService;
	
	@RequestMapping(value="/index1", method = {RequestMethod.GET})
    public ModelAndView index1(){
		
		ModelAndView modelAndView = new ModelAndView("helloWordView1");
		modelAndView.addObject("message", "helloWordView1 1!");  
        return modelAndView;
    }
	
	@RequestMapping(value="/index2", method = {RequestMethod.GET})
    public ModelAndView index2(){
		
		ModelAndView modelAndView = new ModelAndView("helloWordView1");
		modelAndView.addObject("message", "helloWordView1 2!");  
        return modelAndView;
    }
	
	@RequestMapping(value="goods/list", method = {RequestMethod.GET})
    public ModelAndView listGoods(){

		int size=5;
		int count  = goodsService.getGoodsCount();
		
		ModelAndView modelAndView = new ModelAndView("helloWordView1");
		modelAndView.addObject("message", Integer.toString(count));  
        return modelAndView;
    }

}
