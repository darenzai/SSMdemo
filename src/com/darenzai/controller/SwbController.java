package com.darenzai.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.darenzai.pojo.Swb;
import com.darenzai.pojo.User;
import com.darenzai.service.SwbService;
import com.darenzai.util.Page;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mysql.cj.Session;

// ����spring mvc����һ����������
@Controller
@RequestMapping("")
public class SwbController {
	@Autowired
	SwbService SwbService;

	@RequestMapping("listSwb")
	public ModelAndView listCategory(Page page){
	
		ModelAndView mav = new ModelAndView();
		PageHelper.offsetPage(page.getStart(),7);
		// ����ת������
		List<Swb> cs= SwbService.list();
        int total = (int) new PageInfo<>(cs).getTotal();
         
        page.caculateLast(total);
		mav.addObject("cs", cs);
		// ����jsp·��
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
		return "login";
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
		return "login";
	}
	
	@RequestMapping("updateSwb")
	public ModelAndView updateCategory(Swb swb){
		SwbService.update(swb);
		ModelAndView mav = new ModelAndView("redirect:/listSwb");
		return mav;
	}	

}
