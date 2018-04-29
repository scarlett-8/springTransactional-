package com.sh.springboot.serviceneiceng.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sh.springboot.bean.Person;
import com.sh.springboot.dao.PersonDao;
import com.sh.springboot.serviceneiceng.ServiceNeiCeng;

/**
 * Created by sh on 18/4/28.
 */
@Service
public class ServiceNeiCengImpl implements ServiceNeiCeng {

	@Autowired
	PersonDao persondao;

	@Transactional
	public void insertNeiCeng(int id, String name) {
		try {
			Person person = new Person();
			person.setId(id);
			person.setName(name);
			persondao.insertPerson(person);
			if (id == 4) {
				int i = 2 / 0;// 此处会产生异常
			}
		} catch (Exception e) {
			System.out.println(id + "内部异常日志处理");
		}
		System.out.println(id + "内层正常执行");
	}
}