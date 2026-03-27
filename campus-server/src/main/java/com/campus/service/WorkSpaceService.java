package com.campus.service;

import com.campus.vo.BusinessDataVO;
import com.campus.vo.DishOverViewVO;
import com.campus.vo.OrderOverViewVO;
import com.campus.vo.SetmealOverViewVO;

public interface WorkSpaceService {
    OrderOverViewVO getOverviewOrders();

    DishOverViewVO getOverviewDishes();

    SetmealOverViewVO getOverviewSetmeals();

    BusinessDataVO getBusinessData();
}
