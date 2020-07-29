package com.imooc.o2o.service;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.apache.catalina.webresources.Cache;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.o2o.entity.Area;


@RunWith(SpringRunner.class)
@SpringBootTest
public class AreaServiceTest {
	@Autowired
	private AreaService areaService;
	@Autowired
	private CacheService cacheService;
	
	@Test
	public void testgetAreaList() {
		List<Area> arealist = areaService.getAreaList();
		assertEquals("East", arealist.get(0).getAreaName());
		cacheService.removeFromCache(areaService.AREALISTKEY);
		arealist = areaService.getAreaList();
	}

}
