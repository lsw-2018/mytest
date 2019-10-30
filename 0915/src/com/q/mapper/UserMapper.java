package com.q.mapper;

import java.util.List;

import com.q.pojo.User;

public interface UserMapper {
         public void insert(User u);
         public void delete(int id);
         public void update(User u);
         public List<User> findAll();
         public List<User> findByName(String name);
         public void fingById(int id);
}
