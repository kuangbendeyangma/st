package com.web.bean;

import java.util.Date;

public class Member_tally {//���˱�
private int id;//id
private int member_id;//�û�id
private int type_id;//��������id
private String type_name;//������������
private double amount;//���
private Date pay_date;//֧��ʱ��
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
public int getType_id() {
	return type_id;
}
public void setType_id(int type_id) {
	this.type_id = type_id;
}
public String getType_name() {
	return type_name;
}
public void setType_name(String type_name) {
	this.type_name = type_name;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public Date getPay_date() {
	return pay_date;
}
public void setPay_date(Date pay_date) {
	this.pay_date = pay_date;
}
public Date getCreate_date() {
	return create_date;
}
public void setCreate_date(Date create_date) {
	this.create_date = create_date;
}

}
