package com.campus.service;

import com.campus.dto.DishDTO;
import com.campus.dto.DishPageQueryDTO;
import com.campus.entity.Dish;
import com.campus.result.PageResult;
import com.campus.vo.DishVO;

import java.util.List;

public interface DishService {
    PageResult<DishVO> getDishList(DishPageQueryDTO dishPageQueryDTO);

    boolean saveDish(DishDTO dishDTO);

    boolean deleteDishByIds(List<Long> ids);

    DishVO getDishVOById(Long id);

    boolean updateDish(DishDTO dishDTO);

    boolean updateDishStatus(Long id, Integer status);

    List<Dish> getDishListByCategoryId(Long categoryId);

    List<DishVO> getDishVoListByCategoryId(Long categoryId);
}
