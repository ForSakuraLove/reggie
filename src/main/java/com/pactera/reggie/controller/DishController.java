package com.pactera.reggie.controller;

import com.pactera.reggie.common.R;
import com.pactera.reggie.entity.Dish;
import com.pactera.reggie.service.DishFlavorService;
import com.pactera.reggie.service.DishService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;
    @Autowired
    private DishFlavorService dishFlavorService;

    @PostMapping
    public R<String> save(){

        return R.success("添加成功");
    }
}
