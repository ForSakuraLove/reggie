package com.pactera.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pactera.reggie.dto.SetmealDto;
import com.pactera.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    void saveWithDishes(SetmealDto setmealDto);
    SetmealDto getWithDishes(Long id);
    void updateWithDishes(SetmealDto setmealDto);
    List<SetmealDto> getByCategoryId(Long categoryId);
}
