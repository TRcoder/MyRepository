package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dao.UserDao;
import com.pojo.MyUser;

/**
*@author 唐瑞
*@version 创建时间:2019年7月11日下午5:44:12
*说明
*/
@Controller
public class UserController {
	@Autowired
	private UserDao userDao;
	@RequestMapping("/select")
	public String select(MyUser user,Model model) {
		List<MyUser> list = userDao.selectUserByUname(user);
		model.addAttribute("userList",list);
		return "userList";
	}

}
