package com.itchen.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.itchen.reggie.dto.SetmealDto;
import com.itchen.reggie.entity.Setmeal;

import java.util.List;

public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);

    /**
     * 根据id查询套餐信息和对应的菜品信息
     * @param id
     * @return
     */
    public SetmealDto getByIdWithDish(Long id);

    /**
     * 更新套餐信息，同时更新对应菜品信息
     * @param setmealDto
     */
    public void updateWithDish(SetmealDto setmealDto);
}
