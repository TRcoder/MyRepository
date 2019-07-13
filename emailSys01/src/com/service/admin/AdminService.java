package com.service.admin;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;

import com.po.Auser;

public interface AdminService {
	//×¢²áÓÃ»§µÇÂ¼
	public String login(Auser auser, Model model, HttpSession session);
}
