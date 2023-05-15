package com.pactera.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface UserMapper extends BaseMapper<User> {
}
