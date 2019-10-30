package com.q.controller;

import java.io.IOException;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.q.mapper.UserMapper;
import com.q.pojo.User;

public class Text {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
        SqlSession session=new SqlSessionFactoryBuilder().build(Resources.getResourceAsStream("SqlMapConfigl.xml")).openSession();
	    UserMapper mapper =session.getMapper(UserMapper.class);
	    
	    mapper.insert(new User( 55,"µœ¿ˆ»»∞Õµÿ¿Ì","qqqq"));
	    session.commit();
	    session.close();
	}

}
