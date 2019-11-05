package com.lsw.controllor;



import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.lsw.mapper.Usermapper;
import com.lsw.pojo.User;
import com.mysql.fabric.xmlrpc.base.Array;

public class Test {

	public static void main(String[] args) throws IOException {
		/*SqlSessionFactory fac=new SqlSessionFactoryBuilder().build(
		Resources.getResourceAsStream("SqlMapConfig.xml"));
		//以流的方式加载SqlMapConfig.xml    Resources代表资源 （导ibatis的包）
		
		SqlSession session=fac.openSession();*/
		
		SqlSession session=new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("SqlMapConfig.xml")).openSession();
		Usermapper mapper=session.getMapper(Usermapper.class);//反射机制
		//mapper.insert(new User(222,"李佳哲38","123"));
		//mapper.delete(32);
		//mapper.update(new User(4,"刘师维","666666"));
		
		/*List<User> users=mapper.findAll();
		for (User user : users) {
			System.out.println(user);
		}*/
		
		/*List<User> users=mapper.findByname("%刘%");
		for (User user : users) {
			System.out.println(user);
		}*/
		
		/*User u=mapper.findByid(9);
		System.out.println(u);*/
		List<Integer> list=Arrays.asList(10,11,12,13,14);
		List<User> users=mapper.findByids(list);
		for (User user : users) {
			System.out.println(user);
		}
		
		
		/*List<User> users=mapper.findBycon(new User(0,"王泽坤","123"));
		for (User user : users) {
			System.out.println(user);
		}*/
		session.commit();
		session.close();
		
	}
	
	
	
}
