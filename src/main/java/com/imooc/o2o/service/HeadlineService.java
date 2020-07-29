package com.imooc.o2o.service;

import java.util.List;

import com.imooc.o2o.entity.HeadLine;

public interface HeadlineService {
	
	public final static String HLLISTKEY = "headlinelist";
	
	/**
	 * 根据传入的条件返回指定的头条列表
	 * 
	 * @param headLineCondition
	 * @return
	 * @throws IOException
	 */
	List<HeadLine> getHeadLineList(HeadLine headLineCondition);

}
