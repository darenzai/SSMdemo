package com.darenzai.controller;


import java.util.List;
import java.util.NavigableSet;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.darenzai.pojo.Swb;
import com.darenzai.pojo.User;
import com.darenzai.service.SwbService;
import com.darenzai.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.Session;


// 告诉spring mvc这是一个控制器类
@Controller
@RequestMapping("")
public class SwbController {
	@Autowired
	SwbService SwbService;
	
//	@RequestMapping("listSwb")
//	@ResponseBody
//	public PageInfo  listCategory1(@RequestParam(value="pn",defaultValue ="1")Integer pn, Model model){
//		
//		List<Swb> cs= SwbService.list();
//		PageInfo page =new PageInfo(cs);
//		
//		
//		return page;
//	}
	
	
	
	
	
	 
	@RequestMapping("listSwb")
	public ModelAndView listCategory(Page page){
	
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),7);
		// 放入转发参数
		List<Swb> cs= SwbService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
         
        page.caculateLast(total);
		mav.addObject("cs", cs);
		// 放入jsp路径
		mav.setViewName("listSwb");
		return mav;
	}
	
	
	@RequestMapping("editSwb")
	public ModelAndView editSwb(HttpServletRequest req){
		ModelAndView mav = new ModelAndView();
		//PageHelper.offsetPage(page.getStart(),7);
		String ss=req.getParameter("dorm");
		int dd=Integer.parseInt(ss);
		
			
		
		List<Swb> cs= SwbService.get(dd);
		//int total = (int) new PageInfo<>(cs).getTotal();
		//page.caculateLast(total);
		mav.addObject("cs", cs);
		mav.setViewName("editSwb");
		return mav;
		

		/*
		 * 
		
		int total = (int) new PageInfo<>(cs).getTotal();
		page.caculateLast(total);
		mav.addObject("cs", cs);
		mav.setViewName("editSwb");
		return mav;
		
		 * 
		 */
	}
	
	@RequestMapping("addSwb")
	public ModelAndView addSwb(Swb swb){
		SwbService.add(swb);
		ModelAndView mav = new ModelAndView("addSwb");
	    return mav;
	}	
	@RequestMapping("deleteSwb")
	public ModelAndView deleteSwb(int id ){
		SwbService.delete(id);
		ModelAndView mav = new ModelAndView("redirect:/listSwb");
		return mav;
	}
	
	@RequestMapping("/login")
	public String login(){
		return "login1";
	}
	@RequestMapping("checkLogin")
	public String chckLogin(User user,Model model,HttpSession session) {
		user = SwbService.checkLogin(user.getUsername(), user.getPassword());
		
		if(user !=null) {
			model.addAttribute("user",user);
			session.setAttribute("user", user);
			return "success";
		}
		return "fail";
	}
	
	@RequestMapping("anotherpage")
	public String hrefpage() {
		return "anotherpage";
	}
	@RequestMapping("outLogin")
	public String outLogin(HttpSession session) {
		
		session.invalidate();
		return "login1";
	}
	
	@RequestMapping("updateSwb")
	public ModelAndView updateCategory(Swb swb){
		SwbService.update(swb);
		ModelAndView mav = new ModelAndView("redirect:/listSwb");
		return mav;
	}
	@RequestMapping("charts")
	public String charts() {
		return "charts";
	}
	

}
