package com.web.bean;

import java.util.Date;

public class Member_profit_record {//��Ա�����¼��
private int id;//id
private String serial_number;//��ˮ��
private int type;//����
private double amount;//���
private int member_id;//�û�id
private int delflag;//
private Date create_date;//����ʱ��
private Date update_date;//�޸�ʱ��
private String comment;//��ע
private int purchase_id;//���id
private int profit_year;//��Ϣ��
private int profit_month;//��Ϣ��
private int profit_day;//��Ϣ��
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getSerial_number() {
	return serial_number;
}
public void setSerial_number(String serial_number) {
	this.serial_number = serial_number;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public int getDelflag() {
	return delflag;
}
public void setDelflag(int delflag) {
	this.delflag = delflag;
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
public String getComment() {
	return comment;
}
public void setComment(String comment) {
	this.comment = comment;
}
public int getPurchase_id() {
	return purchase_id;
}
public void setPurchase_id(int purchase_id) {
	this.purchase_id = purchase_id;
}
public int getProfit_year() {
	return profit_year;
}
public void setProfit_year(int profit_year) {
	this.profit_year = profit_year;
}
public int getProfit_month() {
	return profit_month;
}
public void setProfit_month(int profit_month) {
	this.profit_month = profit_month;
}
public int getProfit_day() {
	return profit_day;
}
public void setProfit_day(int profit_day) {
	this.profit_day = profit_day;
}

}
