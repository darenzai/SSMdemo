package com.darenzai.service;

import java.util.List;

import com.darenzai.pojo.Swb;
import com.darenzai.pojo.User;
import com.darenzai.util.Page;

public interface SwbService {

	List<Swb> list();
	//int total();
	//List<Swb> list(Page page);
	void add(Swb c);
	
	void update(Swb c);
	
	void delete(int c);
	
	List<Swb> get(int dorm);
	
	User checkLogin(String username,String passwprd);
	
	void Regist(User user);
}
