package com.darenzai.util;
  
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.darenzai.pojo.Swb;
import com.github.pagehelper.PageHelper;


public class TestMybatis {
	
	
    public static void main(String[] args) throws IOException, InterruptedException {
        String resource = "application.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession session = sqlSessionFactory.openSession();
     
        PageHelper.offsetPage(0, 5);

        List<Swb> cs = session.selectList("list");
        for (Swb c : cs) {
            System.out.println(c.getDorm());
        }

        session.commit();
        session.close();
    }
}
