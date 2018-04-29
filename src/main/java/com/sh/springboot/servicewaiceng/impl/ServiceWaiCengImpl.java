package com.sh.springboot.servicewaiceng.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.sh.springboot.serviceneiceng.ServiceNeiCeng;
import com.sh.springboot.servicewaiceng.ServiceWaiCeng;

/**
 * Created by sh on 18/4/28.
 */
@Component
public class ServiceWaiCengImpl implements ServiceWaiCeng {

	@Autowired
	private ServiceNeiCeng snc;

	@Transactional
	public void insertWaiCeng() {
				for (int j = 0; j < 8; j++) {
					snc.insertNeiCeng(j, j + "姓名");
					if (j == 4) {
						int i = 2 / 0;// 此处会产生异常
					}
				}
		System.out.println("外层正常执行");
	}
}