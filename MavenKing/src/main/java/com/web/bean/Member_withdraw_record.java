package com.web.bean;

import java.util.Date;

public class Member_withdraw_record {//���ּ�¼��
private int id;//id;
private String serial_number;//��ˮ��
private int member_id;//�û�id
private double amount;//���ֽ��
private String bank_name;//���п�����
private String bank_card;//����
private int status;//����״̬(0:�����;1:�Ѵ��;2�����;3:���ʧ��)
private int delFlag;//�Ƿ�ɾ��
private String cardaddress;//�����������ڵ�
private String create_name;//���ͨ��������,������
private  Date create_date;//����ʱ��
private Date update_date;//�޸�ʱ��
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
public int getMember_id() {
	return member_id;
}
public void setMember_id(int member_id) {
	this.member_id = member_id;
}
public double getAmount() {
	return amount;
}
public void setAmount(double amount) {
	this.amount = amount;
}
public String getBank_name() {
	return bank_name;
}
public void setBank_name(String bank_name) {
	this.bank_name = bank_name;
}
public String getBank_card() {
	return bank_card;
}
public void setBank_card(String bank_card) {
	this.bank_card = bank_card;
}
public int getStatus() {
	return status;
}
public void setStatus(int status) {
	this.status = status;
}
public int getDelFlag() {
	return delFlag;
}
public void setDelFlag(int delFlag) {
	this.delFlag = delFlag;
}
public String getCardaddress() {
	return cardaddress;
}
public void setCardaddress(String cardaddress) {
	this.cardaddress = cardaddress;
}
public String getCreate_name() {
	return create_name;
}
public void setCreate_name(String create_name) {
	this.create_name = create_name;
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
