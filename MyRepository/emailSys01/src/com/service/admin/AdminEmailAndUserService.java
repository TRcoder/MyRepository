package com.service.admin;

import org.springframework.ui.Model;

public interface AdminEmailAndUserService {
	//��ѯ�������û�
	public String selectBuserEmail(Model model);
	//��ѯ�������ʼ�
	public String selectAllEmail(Model model);
	//ɾ���ʼ�
	public String delete(Integer id);
	//�����û�
	public String lock(Integer id);
	//�����û�
	public String unLock(Integer id);
}
