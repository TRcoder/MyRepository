package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import com.po.Buser;
import com.po.Email;
import com.po.Rsrecordtable;


@Repository("emailDao")
@Mapper
public interface EmailDao {
	//写邮件
	public int writeEmail(Email email);
	//查询用户邮件
	public List<Buser> selectBuserEmail();
	//回复邮件
	public int writeEmailRecord(Rsrecordtable rsrecordtable);
	//
	public List<Map<String, Object>> recieve(Integer id);
	//
	public List<Map<String, Object>> detail(Integer id);
	public int updateOpen(Integer id);
	public int deleteOne(Integer id);
	public int delete(Integer id);
	public List<Map<String, Object>> send(Integer id);
	public List<Map<String, Object>> selectAllEmail();
	public int lock(Integer id);
	public int unLock(Integer id);
}
