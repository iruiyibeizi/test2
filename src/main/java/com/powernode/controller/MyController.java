package com.powernode.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @auther zhaolixin
 * @creat 2021.06.09.11:38
 */
@Controller
public class MyController {
   @RequestMapping(value ={"/some.do","first.do"})
    public ModelAndView doSome(){
        System.out.println("处理some.do请求");
        ModelAndView mv=new ModelAndView();
        mv.addObject("msg","使用注解的springmvc应用");
        mv.addObject("fun","dosome");
        mv.setViewName("show");
        return mv;
    }
}
