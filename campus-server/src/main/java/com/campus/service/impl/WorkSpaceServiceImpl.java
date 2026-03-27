package com.campus.service.impl;

import com.campus.mapper.DishMapper;
import com.campus.mapper.OrderMapper;
import com.campus.mapper.SetMealMapper;
import com.campus.service.WorkSpaceService;
import com.campus.vo.BusinessDataVO;
import com.campus.vo.DishOverViewVO;
import com.campus.vo.OrderOverViewVO;
import com.campus.vo.SetmealOverViewVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WorkSpaceServiceImpl implements WorkSpaceService {

    @Autowired
    private OrderMapper orderMapper;

    @Autowired
    private DishMapper dishMapper;

    @Autowired
    private SetMealMapper setMealMapper;

    @Override
    public OrderOverViewVO getOverviewOrders() {

        return orderMapper.getAllStatusOrderCount();
    }

    @Override
    public DishOverViewVO getOverviewDishes() {
        return dishMapper.getAllStatusDishesCount();
    }

    @Override
    public SetmealOverViewVO getOverviewSetmeals() {
        return setMealMapper.getAllStatusSetMealCount();
    }

    @Override
    public BusinessDataVO getBusinessData() {
        return orderMapper.getBusinessData(null, null);
    }
}
