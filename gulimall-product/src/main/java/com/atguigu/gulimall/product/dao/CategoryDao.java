package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xd
 * @email 108662598@qq.com
 * @date 2021-10-10 10:58:08
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
