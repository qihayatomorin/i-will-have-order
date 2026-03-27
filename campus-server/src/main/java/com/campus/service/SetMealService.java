package com.campus.service;

import com.campus.dto.SetmealDTO;
import com.campus.dto.SetmealPageQueryDTO;
import com.campus.entity.Setmeal;
import com.campus.result.PageResult;
import com.campus.vo.DishItemVO;
import com.campus.vo.SetmealVO;

import java.util.List;

public interface SetMealService {
    boolean saveSetMeal(SetmealDTO setmealDTO);

    PageResult<SetmealVO> listAllSetMeal(SetmealPageQueryDTO setmealPageQueryDTO);

    SetmealVO getSetMealById(Long id);

    boolean updateSetMeal(SetmealDTO setmealDTO);

    boolean updateSetMealStatus(Long id, Integer status);

    boolean deleteSetMealByIds(List<Long> ids);

    List<Setmeal> getSetMealListByCategoryId(Long categoryId);

    List<DishItemVO> getDishListBySetMealId(Long id);
}
