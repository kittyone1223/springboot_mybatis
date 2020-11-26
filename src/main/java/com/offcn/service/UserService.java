package com.offcn.service;


import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    public User findOne(Integer id);
    public void delete(Integer id);
    public List<User> findAll();
    public void add(User user);
}
