package com.mojo.experience.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mojo.experience.pojo.User;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface UserMapper extends BaseMapper<User> {
//    @Select("select * from user")
//    public List<User> findAll();
}
