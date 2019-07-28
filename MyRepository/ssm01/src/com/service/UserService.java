package com.service;

import java.util.List;

import com.pojo.MyUser;

/**
*@author 唐瑞
*@version 创建时间:2019年7月11日下午5:15:46
*说明
*/
public interface UserService {
	public List<MyUser>selectUserByUname(MyUser user);

}
