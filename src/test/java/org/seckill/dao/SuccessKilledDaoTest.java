package org.seckill.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.seckill.entity.SuccessKilled;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:spring/spring-dao.xml" })
public class SuccessKilledDaoTest {
	@Autowired
	private SuccessKilledDao successKilledDao;

	@Test
	public void testTnsertSuccessKilled() throws Exception {

		long seckillId = 1001L;
		long userPhone = 13623455432L;
		int insertCount = successKilledDao.insertSuccessKilled(seckillId, userPhone);
		System.out.println(insertCount);
	}

	@Test
	public void testQueryByIdWithSeckill() throws Exception {
		long userPhone = 13623455432L;
		long seckillId = 1001L;
		SuccessKilled successKilled = successKilledDao.queryByIdWithSeckill(seckillId, userPhone);
		System.out.println(successKilled);
		System.out.println(successKilled.getSeckill());
	}
}
