package com.web.bean;

import java.util.Date;

public class Subject_folder {//附件归属表
	private int id;//主键
	private Date create;//创建时间
	private Date update_create;//修改时间
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreate() {
		return create;
	}
	public void setCreate(Date create) {
		this.create = create;
	}
	public Date getUpdate_create() {
		return update_create;
	}
	public void setUpdate_create(Date update_create) {
		this.update_create = update_create;
	}
	

}
