package com.pactera.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pactera.reggie.dto.DishDto;
import com.pactera.reggie.entity.Dish;

public interface DishService extends IService<Dish> {


    void saveWithDishFlavor(DishDto dishDto);

    DishDto getWithDishFlavor(Long id);

    void updateWithDishFlavor(DishDto dishDto);

}
