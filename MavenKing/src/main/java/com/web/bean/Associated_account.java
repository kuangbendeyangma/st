package com.web.bean;

import java.util.Date;

public class Associated_account {//�����˺ű�-��������½��Ϣ��
	private int id;//id
	private int member_id;//��Աid
	private String type;//�˺�����
	private String name;//�˺�����
	private String identifying;//�˺ű�ʶ
	private int status;//״��
	private Date create_date;//����ʱ��
	private Date update_date;//�޸�ʱ��
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMember_id() {
		return member_id;
	}
	public void setMember_id(int member_id) {
		this.member_id = member_id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIdentifying() {
		return identifying;
	}
	public void setIdentifying(String identifying) {
		this.identifying = identifying;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCreate_date() {
		return create_date;
	}
	public void setCreate_date(Date create_date) {
		this.create_date = create_date;
	}
	public Date getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(Date update_date) {
		this.update_date = update_date;
	}
}
