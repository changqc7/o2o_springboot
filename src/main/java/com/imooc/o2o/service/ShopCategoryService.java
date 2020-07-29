package com.imooc.o2o.service;

import java.util.List;

import com.imooc.o2o.entity.ShopCategory;

public interface ShopCategoryService {
	public final static String SCLISTKEY = "shopcategorylist";
	
	List<ShopCategory> getShopCategoryList(ShopCategory shopCategoryCondition);

}
