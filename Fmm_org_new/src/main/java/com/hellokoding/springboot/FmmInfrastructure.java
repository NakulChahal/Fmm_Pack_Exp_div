
package com.hellokoding.springboot;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;

@Entity
@Table(name = "FMM_INFRASTRUCTURE" , schema="NAKUL")
public class FmmInfrastructure  {

	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)	
	@Column(name="ORG_SLNO")
	private Long orgSlNo;
	
	@Column(name="INCHARGE")
	private String incharge;
	
	@Column(name="PATTERN_EXAM")
	private String patternExam;
	
	@Column(name="ROH_CAPACITY")
	private String rohCapacity;
	
	@Column(name="TRACK_DISTANCE")
	private Long trackCenterDistanceBetweenLines;
	
	@Column(name="CONCRETE_FLOORING")
	private String heavyDutyFlooring;
	
	@Column(name="NIGHT_WORKING")
	private String nightWorking;
	
	@Column(name="ILLUMINATION_FAC")
	private String sufficientIllumination;
	
	@Column(name="EOT_CRANE")
	private String eOTCane;
	
	@Column(name="JACKS")
	private String syncWhitingJackes;
	
	@Column(name="WHEEL_LATHE")
	private String wheelTurningLathe;

	@Column(name="WELDING_FAC")
	private String weldingFacilities;

    @Column(name="DV_REPAIR")
	private String dVRepair;
	
	@Column(name="SAB_REPAIR")
	private String sabrepair;
	
	@Column(name="UST_FAC")
	private String ustfacility;
	
	@Column(name="AV_PC")
	private String pc;
	
	@Column(name="AV_PC_NETWORKING")
	private String pcsNetworkingFacility;
	
	@Column(name="AV_TELE_COMM")
	private String teleCommunicationFacility;
	
	@Column(name="FUTURE_EXTENTION")
	private String futureExtension;

	public Long getOrgSlNo() {
		return orgSlNo;
	}

	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	@Column(name="REMARKS")
	private String remarks;
	
	@Column(name="DATE_TIME")
	private Date dateTime;
	
	@Column(name="USER_ID")
	private String userId;
	
	//private List<FmmPhotoInfrastruture> fmmInfraPhoto;
//	
//	private FmmOrgMTable fmmOrgMTable;
//
//	 @OneToOne(mappedBy = "FMM_INFRASTRUCTURE")
//	    private FmmOrgMTable getfmmOrgMTable() {
//	        return fmmOrgMTable;
//	    }
//	
//	
	
	
	public String getIncharge() {
		return incharge;
	}

	public void setIncharge(String incharge) {
		this.incharge = incharge;
	}

	public String getPatternExam() {
		return patternExam;
	}

	public void setPatternExam(String patternExam) {
		this.patternExam = patternExam;
	}

	public String getRohCapacity() {
		return rohCapacity;
	}

	public void setRohCapacity(String rohCapacity) {
		this.rohCapacity = rohCapacity;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getDateTime() {
		return dateTime;
	}

	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	/*
//	cascade = CascadeType.ALL - Apply all cascading effects to the related entity. That is, 
//			whenever we update/delete a User entity, update/delete the corresponding  as well.
	
	@OneToMany(cascade =  CascadeType.ALL)
	//@JoinTable(name="FmmInfrastructure")
    @JoinColumn(name = "ORG_SLNO")
	private List<FmmOrgMTable> fmmOrgMTable;

	public List<FmmOrgMTable> getFmmOrgMTable() {
		return fmmOrgMTable;
	}

	public void setFmmOrgMTable(List<FmmOrgMTable> fmmOrgMTable) {
		this.fmmOrgMTable = fmmOrgMTable;
	}*/
	
}


