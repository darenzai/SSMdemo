package com.darenzai.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darenzai.mapper.SwbMapper;
import com.darenzai.pojo.Swb;
import com.darenzai.util.Page;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:application.xml")
public class MybatisTest {

	@Autowired
	private SwbMapper swbMapper;
	
	
	
	@Test
	public void testAdd() {
		for (int i = 0; i <15; i++) {
			Swb swb = new Swb();
			
			swb.setDorm(101);
			swb.setTime("2019-3-16");
			swb.setDengji("��");
			swb.setReason("����û�����鲻�룬��δ��");
			swb.setTongbao("ͨ��");
			swbMapper.add(swb);
		}

	}
	/**
	 * 
	
	 
	@Test
	public void testTotal() {
		int total = swbMapper.total();
		System.out.println(total);
	}
	 * 
	 */
	
	
	@Test
	public void testGet() {
		int d=202;
		List<Swb> cs=swbMapper.get(203);
		System.out.println("++++++++++++++");
		for(Swb c:cs) {
			System.out.println(c);
		}
		
		System.out.println("+++++++++++++++++++++");
	}
	
	/*
	 * 
	
	@Test
	public void testList() {
		Page p = new Page();
		p.setStart(1);
		p.setCount(20);
		List<Swb> cs=swbMapper.list(p);
		for (Swb c : cs) {
			System.out.println(c.getDorm());
		}
		
	
	
	}
	
		 *  
	 */
	@Test
	public void testDelete() {
		swbMapper.delete(1);
	}
	@Test
	public void TestUpdata() {
		Swb swb = new Swb();
		swb.setId(5);
		swb.setDorm(201);
		swb.setDengji("1111");
		swb.setReason("asas");
		swb.setTime("2014-5-7");
		swb.setTongbao("ͨ��");
		int num=swbMapper.update(swb);
	}
	
		
	
}

