package com.imooc.o2o.service;


import java.io.InputStream;

import com.imooc.o2o.dto.ImageHolder;
import com.imooc.o2o.dto.ShopExecution;
import com.imooc.o2o.entity.Shop;

public interface ShopService {
	
	ShopExecution addShop(Shop shop , ImageHolder thumbnail);

	Shop getByShopId(long shopId);
	
	ShopExecution modifyShop(Shop shop , ImageHolder thumbnail);
	
	/**
	 * 根据shopCondition分页返回相应店铺列表
	 * 
	 * @param shopCondition
	 * @param pageIndex
	 * @param pageSize
	 * @return
	 */
	public ShopExecution getShopList(Shop shopCondition, int pageIndex, int pageSize);
}
