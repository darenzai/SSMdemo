package com.darenzai.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor{



	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response ,Object handel) throws Exception {
		
		HttpSession session=request.getSession();
		System.out.println(session);
		if(session.getAttribute("user")!=null) {
			System.out.println("Success");
			return true;
		}else {
			System.out.println(request.getContextPath()+"/login");
			response.sendRedirect(request.getContextPath()+"/login");
			return false;
	}
	}
}
