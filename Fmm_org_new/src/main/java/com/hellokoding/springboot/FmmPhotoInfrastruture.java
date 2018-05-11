/*package com.hellokoding.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="FMM_PHOTO_INFRASTRUCTURE", schema="NAKUL")
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


//	
//	 @GenericGenerator(name = "generator", strategy = "foreign")
//     @Id
//     @GeneratedValue(generator = "generator")
//     @Column(name = "OrgSlNo", unique = true, nullable = false)
	

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
*/