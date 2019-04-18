package com.darenzai.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.darenzai.mapper.SwbMapper;
import com.darenzai.pojo.Swb;
import com.darenzai.pojo.User;
import com.darenzai.service.SwbService;
import com.darenzai.util.Page;



@Service
public class SwbServiceImpl  implements SwbService{
	@Autowired
	SwbMapper swbMapper;
	
	
	public List<Swb> list(){
		return swbMapper.list();
	}

/*
 * 
 
	@Override
	public List<Swb> list(Page page) {
		// TODO Auto-generated method stub
		return swbMapper.list(page);
	}


	@Override
	public int total() {
		return swbMapper.total();
	}
*/

	@Override
	public void add(Swb c) {
		swbMapper.add(c);
		
	}


	@Override
	public void update(Swb c) {
		swbMapper.update(c);
	}


	@Override
	public void delete(int id) {
		swbMapper.delete(id);
	}


	@Override
	public List<Swb> get(int dorm) {
		// TODO Auto-generated method stub
		return swbMapper.get(dorm);
	};
	
	@Override
	public void Regist(User user) {
		swbMapper.registerByUsernameAndPassword(user.getPassword(), user.getPassword());
	}

	@Override
	public User checkLogin(String username, String passwprd) {
		User user =swbMapper.findByUsername(username);
		if(user !=null && user.getPassword().equals(passwprd)) {
			
			return user;
		}
		return null;
	}
	

}
