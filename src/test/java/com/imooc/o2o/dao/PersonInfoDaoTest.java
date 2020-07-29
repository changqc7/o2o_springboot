package com.imooc.o2o.dao;

import static org.junit.Assert.assertEquals;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.imooc.o2o.entity.PersonInfo;


@RunWith(SpringRunner.class)
@SpringBootTest
public class PersonInfoDaoTest {

	
	@Autowired
	private PersonInfoDao personInfoDao;

	@Test
	public void testAInsertPersonInfo() throws Exception {
		// 设置新增的用户信息
		PersonInfo personInfo = new PersonInfo();
		personInfo.setName("test1");
		personInfo.setGender("f");
		personInfo.setUserType(1);
		personInfo.setCreateTime(new Date());
		personInfo.setLastEditTime(new Date());
		personInfo.setEnableStatus(1);
		int effectedNum = personInfoDao.insertPersonInfo(personInfo);
		assertEquals(1, effectedNum);
	}

	@Test
	public void testBQueryPersonInfoById() {
		long userId = 1;
		// 查询Id为1的用户信息
		PersonInfo person = personInfoDao.queryPersonInfoById(userId);
		System.out.println(person.getName());
	}
}
