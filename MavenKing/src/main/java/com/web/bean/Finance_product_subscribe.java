package com.web.bean;

import java.util.Date;

public class Finance_product_subscribe {//���������ƷԤԼ��¼��
private int id;//id
private String name;//����
private int member_id;//��Աid
private String phone;//��ϵ�绰
private int product_id;//��Ʋ�Ʒid
private String addr;//���ڵ���
private int status;//�Ƿ���(0:ǩ������|1:��ǩԼ|2:�����|3:ǩ��ʧ��)
private String comment;//����ǩ���ĵ���Ϣ
private String risk_reveal;//���ս�ʾ��
private Date create_date;//���ʱ��
private Date update_date;//�޸�ʱ��
private double amount;//˽ļ������
private double interest;//˽ļ��������
private Date start_date;//��ʼʱ��
private Date end_date;//����ʱ��
private String signed_photos;//ǩ������
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public int getProduct_id() {
	return product_id;
}
public void setProduct_id(int product_id) {
	this.product_id = product_id;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public String getRisk_reveal() {
	return risk_reveal;
}
public void setRisk_reveal(String risk_reveal) {
	this.risk_reveal = risk_reveal;
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
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public double getInterest() {
	return interest;
}
public void setInterest(double interest) {
	this.interest = interest;
}
public Date getStart_date() {
	return start_date;
}
public void setStart_date(Date start_date) {
	this.start_date = start_date;
}
public Date getEnd_date() {
	return end_date;
}
public void setEnd_date(Date end_date) {
	this.end_date = end_date;
}
public String getSigned_photos() {
	return signed_photos;
}
public void setSigned_photos(String signed_photos) {
	this.signed_photos = signed_photos;
}

}
