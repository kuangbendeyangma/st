package com.web.bean;

import java.util.Date;

public class Award_records {//������¼��
private int id;//id
private int invitingid;//������id
private int byinvitingid;//������id
private int type;//�������ͣ�0��ע�ά����1��Ͷ�ʽ�����
private int isAward;//����״̬(0:δ���� 1:�ѽ���)
private Date addTime;//���ʱ��
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getInvitingid() {
	return invitingid;
}
public void setInvitingid(int invitingid) {
	this.invitingid = invitingid;
}
public int getByinvitingid() {
	return byinvitingid;
}
public void setByinvitingid(int byinvitingid) {
	this.byinvitingid = byinvitingid;
}
public int getType() {
	return type;
}
public void setType(int type) {
	this.type = type;
}
public int getIsAward() {
	return isAward;
}
public void setIsAward(int isAward) {
	this.isAward = isAward;
}
public Date getAddTime() {
	return addTime;
}
public void setAddTime(Date addTime) {
	this.addTime = addTime;
}

}
