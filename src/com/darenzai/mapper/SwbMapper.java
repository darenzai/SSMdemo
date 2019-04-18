package com.darenzai.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.darenzai.pojo.Swb;
import com.darenzai.pojo.User;
import com.darenzai.util.Page;



public interface SwbMapper {
	public int add(Swb swb);  
    
    
    public void delete(int id);  
       
      
    public List<Swb> get(int dorm);  
     
      
    public int update(Swb swb);   
       
      
    public List<Swb> list();
    
   User findByUsername(String username);
   
   void registerByUsernameAndPassword(@Param("username")String username, @Param("password")String password);
	   
 }
