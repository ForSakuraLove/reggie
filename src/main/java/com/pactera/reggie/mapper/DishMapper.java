package com.pactera.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.pactera.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
