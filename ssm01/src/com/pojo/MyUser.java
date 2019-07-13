package com.pojo;
/**
*@author 唐瑞
*@version 创建时间:2019年7月11日下午5:04:19
*说明
*/
public class MyUser {
	private Integer uid;
	private String uname;
	private String usex;
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUsex() {
		return usex;
	}
	public void setUsex(String usex) {
		this.usex = usex;
	}
	@Override
	public String toString() {
		return "MyUser [uid=" + uid + ", uname=" + uname + ", usex=" + usex + "]";
	}
	

}
