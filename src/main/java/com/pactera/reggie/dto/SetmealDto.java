package com.pactera.reggie.dto;

import com.pactera.reggie.entity.Setmeal;
import com.pactera.reggie.entity.SetmealDish;
import lombok.Data;

import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;
}
