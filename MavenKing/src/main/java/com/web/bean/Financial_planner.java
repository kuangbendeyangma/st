package com.web.bean;

import java.util.Date;

public class Financial_planner {//���ʦ��
private int id;//id
private int member_id;//��Աid
private String name;//��ʵ����
private String orgname;//��������
private String mycard;//�ҵ���Ƭ
private int status;//״̬
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
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getOrgname() {
	return orgname;
}
public void setOrgname(String orgname) {
	this.orgname = orgname;
}
public String getMycard() {
	return mycard;
}
public void setMycard(String mycard) {
	this.mycard = mycard;
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
