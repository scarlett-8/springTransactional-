package com.sh.springboot;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.sh.springboot.servicewaiceng.ServiceWaiCeng;

/**
 * Created by sh on 18/4/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = SpringbootApplication.class)
public class PersonDaoTest {
	@Autowired
	private ServiceWaiCeng servicewaiceng;
	
	@Test
	public void test() {
		servicewaiceng.insertWaiCeng();
		System.out.println("Controller正常执行");
	}
}