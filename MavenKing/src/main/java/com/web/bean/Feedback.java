package com.web.bean;

import java.util.Date;

public class Feedback {//���������
private int id;//id
private int member_id;//��Աid
private String content;//�����������
private Date create_date;//����ʱ��
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
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public Date getCreate_date() {
	return create_date;
}
public void setCreate_date(Date create_date) {
	this.create_date = create_date;
}

}
