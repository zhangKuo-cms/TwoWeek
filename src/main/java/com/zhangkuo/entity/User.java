package com.zhangkuo.entity;

import java.io.Serializable;
import java.util.Date;

/** 

* @author 作者 zk: 

* @version 创建时间：2019年12月9日 上午8:47:09 

*/
public class User implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8576103270323122812L;
	private Integer uid;
	private String uname;
	private String sex;
	private String phone;
	private String emile;
	private String birthday;
	
	public User() {
		super();
	}

	public User(Integer uid, String uname, String sex, String phone, String emile, String birthday) {
		super();
		this.uid = uid;
		this.uname = uname;
		this.sex = sex;
		this.phone = phone;
		this.emile = emile;
		this.birthday = birthday;
	}

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

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmile() {
		return emile;
	}

	public void setEmile(String emile) {
		this.emile = emile;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((uid == null) ? 0 : uid.hashCode());
		result = prime * result + ((uname == null) ? 0 : uname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (uid == null) {
			if (other.uid != null)
				return false;
		} else if (!uid.equals(other.uid))
			return false;
		if (uname == null) {
			if (other.uname != null)
				return false;
		} else if (!uname.equals(other.uname))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "User [uid=" + uid + ", uname=" + uname + ", sex=" + sex + ", phone=" + phone + ", emile=" + emile
				+ ", birthday=" + birthday + "]";
	}
}
