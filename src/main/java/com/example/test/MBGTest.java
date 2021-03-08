package com.example.test;//package com.com.example.test;

import com.example.mapper.UserMapper;
import com.example.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * mybatis逆向工程
 */
public class MBGTest {

	public static void main(String[] args) throws Exception {
		// 根据 mybatis-config.xml 配置的信息得到 sqlSessionFactory
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
		SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) applicationContext.getBean("factory");
		// 然后根据 sqlSessionFactory 得到 session
		SqlSession session = sqlSessionFactory.openSession();
		// 最后通过 session 的 selectList() 方法调用 sql 语句 listStudent
		UserMapper userMapper =  session.getMapper(UserMapper.class);
		List<User> users = userMapper.selectAll(0,10);
		for (User user : users) {
			System.out.println(user);
		}
	}
}
