package com.hellokoding.springboot;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
@Table(name = "FMM_PHOTO_INFRASTRUCTURE" , schema="NAKUL")
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
//allowGetters = true)
public class FmmPhotoInfrastruture {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORG_SLNO")
	private Long orgSlNo;
	
	@Column(name="PHOTO_UPLOAD")
	private byte[] PhotoUpload;
	public Long getOrgSlNo() {
		return orgSlNo;
	}


	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	@Column(name="PHOTO_SL_NO")
	private Long PhotoSlNo;
	
	

	public FmmPhotoInfrastruture() {
		
	}
	 
	


public FmmPhotoInfrastruture(Long orgSlNo, byte[] photoUpload, Long photoSlNo) {
		super();
		this.orgSlNo = orgSlNo;
		PhotoUpload = photoUpload;
		PhotoSlNo = photoSlNo;
	}




	public Long getPhotoSlNo() {
		return PhotoSlNo;
	}

	public void setPhotoSlNo(Long photoSlNo) {
		this.PhotoSlNo = photoSlNo;
	}

	public byte[] getPhotoUpload() {
		return PhotoUpload;
	}

	public void setPhotoUpload(byte[] photoUpload) {
		this.PhotoUpload = photoUpload;
	}
	

}
