package com.pactera.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pactera.reggie.dto.SetmealDto;
import com.pactera.reggie.entity.Setmeal;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDishes(SetmealDto setmealDto);
    SetmealDto getWithDishes(Long id);
    void updateWithDishes(SetmealDto setmealDto);
}
