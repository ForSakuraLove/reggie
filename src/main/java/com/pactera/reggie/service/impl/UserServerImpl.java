package com.pactera.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pactera.reggie.entity.User;
import com.pactera.reggie.mapper.UserMapper;
import com.pactera.reggie.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServerImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
