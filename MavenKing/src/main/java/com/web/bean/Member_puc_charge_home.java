package com.web.bean;

import java.util.Date;

public class Member_puc_charge_home {//�ɷѼ�ͥ
private int id;//id
private int member_id;//�û�id
private String name;//��ͥ����
private int is_default;//�Ƿ�Ĭ��(0:n1:y)
private Date create_date;//����ʱ��
private Date upDate_date;//�޸�ʱ��
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
public int getIs_default() {
	return is_default;
}
public void setIs_default(int is_default) {
	this.is_default = is_default;
}
public Date getCreate_date() {
	return create_date;
}
public void setCreate_date(Date create_date) {
	this.create_date = create_date;
}
public Date getUpDate_date() {
	return upDate_date;
}
public void setUpDate_date(Date upDate_date) {
	this.upDate_date = upDate_date;
}

}
