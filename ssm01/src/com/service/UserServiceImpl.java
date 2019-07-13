package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.UserDao;
import com.pojo.MyUser;

/**
*@author 唐瑞
*@version 创建时间:2019年7月11日下午5:37:18
*说明
*/
@Service("userService")
@Transactional
/*加上注解@Transactional可以指定这个类需要受Spring的事务管理，
 * 注意@Transactional只能针对public属性范围内的方法添加，
 * */
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;

	@Override
	public List<MyUser> selectUserByUname(MyUser user) {
		return userDao.selectUserByUname(user);
	}
	

}
