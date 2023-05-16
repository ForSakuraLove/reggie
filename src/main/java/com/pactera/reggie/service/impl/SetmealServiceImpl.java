package com.pactera.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.pactera.reggie.entity.Setmeal;
import com.pactera.reggie.mapper.SetmealMapper;
import com.pactera.reggie.service.SetmealService;
import org.springframework.stereotype.Service;

@Service
public class SetmealServiceImpl extends ServiceImpl<SetmealMapper, Setmeal>  implements SetmealService {
}
