package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.o2o.entity.HeadLine;


@RunWith(SpringRunner.class)
@SpringBootTest
public class HeadlineDaoTest {
	
	@Autowired
	private HeadlineDao headlineDao;
	
	@Test
	public void testQueryArea() {
		List<HeadLine> headLineList = headlineDao.queryHeadLine(new HeadLine());
		assertEquals(1, headLineList.size());
	}

}
