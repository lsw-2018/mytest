package com.lsw.mapper;

import java.util.List;

import com.lsw.pojo.User;

public interface Usermapper {
   
	 public void insert(User user);
	 public void delete(int id);
	 public void update(User user);
	 public List<User> findAll(); 
	 public List<User> findByname(String name); 
	 public User findByid(int id);
	 
	 public  List<User> findBycon(User user); 
	 public  List<User> findByids(List<Integer> list);
	  
}
