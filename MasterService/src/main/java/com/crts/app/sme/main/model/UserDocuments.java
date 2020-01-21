package com.crts.app.sme.main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDocuments 
{
	@Id
	private int udid;
	private byte [] aadharCard;
	private byte [] panCard;
	private byte [] photo;
	private byte [] signature;
	private byte[] thumb;
	
	
	public int getUdid() {
		return udid;
	}
	public void setUdid(int udid) {
		this.udid = udid;
	}
	public byte[] getAadharCard() {
		return aadharCard;
	}
	public void setAadharCard(byte[] aadharCard) {
		this.aadharCard = aadharCard;
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
	public byte[] getSignature() {
		return signature;
	}
	public void setSignature(byte[] signature) {
		this.signature = signature;
	}
	public byte[] getThumb() {
		return thumb;
	}
	public void setThumb(byte[] thumb) {
		this.thumb = thumb;
	}
	
	

}
