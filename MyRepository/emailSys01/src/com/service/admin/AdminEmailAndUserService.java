package com.service.admin;

import org.springframework.ui.Model;

public interface AdminEmailAndUserService {
	//查询出所有用户
	public String selectBuserEmail(Model model);
	//查询出所有邮件
	public String selectAllEmail(Model model);
	//删除邮件
	public String delete(Integer id);
	//锁定用户
	public String lock(Integer id);
	//解锁用户
	public String unLock(Integer id);
}
