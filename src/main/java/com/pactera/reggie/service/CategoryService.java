package com.pactera.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.pactera.reggie.entity.Category;

public interface CategoryService extends IService<Category> {
    void remove(Long id);
}
