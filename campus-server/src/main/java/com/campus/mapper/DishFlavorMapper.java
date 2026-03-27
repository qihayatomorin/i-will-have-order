package com.campus.mapper;

import com.campus.entity.DishFlavor;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishFlavorMapper {

    int saveBatch(List<DishFlavor> dishFlavors);

    int deleteByDishIds(List<Long> ids);
}
