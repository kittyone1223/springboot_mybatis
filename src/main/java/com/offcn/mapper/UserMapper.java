package com.offcn.mapper;

import com.offcn.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;


import java.util.List;


@Mapper
public interface UserMapper {
    @Select("select * from user where id=#{id}")
    public User findOne(Integer id);


    @Delete("delete from user where id=#{id}")
    public void delete(Integer id);





    @Select("select * from user")
    public List<User> findAll();



    @Insert("INSERT INTO USER(userName,PASSWORD,realName) VALUES(#{userName},#{PASSWORD},#{realName})")
    public void add(User user);
}
