package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDocuments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int udid;
	private byte [] aadharCard;
	private byte [] panCard;
	private byte [] photo;
	public int getUdid() {
		return udid;
	}
	public void setUdid(int udid) {
		this.udid = udid;
	}
	public byte[] getPanCard() {
		return panCard;
	}
	public void setPanCard(byte[] panCard) {
		this.panCard = panCard;
	}
	public byte[] getPhoto() {
		return photo;
	}
	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}
	

}

