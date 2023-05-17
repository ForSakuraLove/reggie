package com.pactera.reggie.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.pactera.reggie.common.R;
import com.pactera.reggie.entity.Orders;
import com.pactera.reggie.service.OrdersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/order")
public class OrdersController {

    @Autowired
    private OrdersService ordersService;

    @GetMapping("/page")
    public R<Page<Orders>> page(int page, int pageSize , Long number, LocalDateTime beginTime,LocalDateTime endTime){
        return null;
    }

}
