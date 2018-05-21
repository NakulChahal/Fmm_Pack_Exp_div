
package com.controller.pojo;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;

import java.util.Date;
import javax.persistence.Column;

@Entity
@Table(name = "FMM_INFRASTRUCTURE" , schema="NAKUL")
//@JsonIgnoreProperties(value = {"createdAt", "updatedAt"}, 
//allowGetters = true)
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
	
	
	@Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
	@Column(name="DATE_TIME")
	private Date dateTime;
	
	@Column(name="USER_ID")
	private String userId;
	
	
	
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

	public Long getTrackCenterDistanceBetweenLines() {
		return trackCenterDistanceBetweenLines;
	}

	public void setTrackCenterDistanceBetweenLines(Long trackCenterDistanceBetweenLines) {
		this.trackCenterDistanceBetweenLines = trackCenterDistanceBetweenLines;
	}

	public String getHeavyDutyFlooring() {
		return heavyDutyFlooring;
	}

	public void setHeavyDutyFlooring(String heavyDutyFlooring) {
		this.heavyDutyFlooring = heavyDutyFlooring;
	}

	public String getNightWorking() {
		return nightWorking;
	}

	public void setNightWorking(String nightWorking) {
		this.nightWorking = nightWorking;
	}

	public String getSufficientIllumination() {
		return sufficientIllumination;
	}

	public void setSufficientIllumination(String sufficientIllumination) {
		this.sufficientIllumination = sufficientIllumination;
	}

	public String geteOTCane() {
		return eOTCane;
	}

	public void seteOTCane(String eOTCane) {
		this.eOTCane = eOTCane;
	}

	public String getSyncWhitingJackes() {
		return syncWhitingJackes;
	}

	public void setSyncWhitingJackes(String syncWhitingJackes) {
		this.syncWhitingJackes = syncWhitingJackes;
	}

	public String getWheelTurningLathe() {
		return wheelTurningLathe;
	}

	public void setWheelTurningLathe(String wheelTurningLathe) {
		this.wheelTurningLathe = wheelTurningLathe;
	}

	public String getWeldingFacilities() {
		return weldingFacilities;
	}

	public void setWeldingFacilities(String weldingFacilities) {
		this.weldingFacilities = weldingFacilities;
	}

	public String getdVRepair() {
		return dVRepair;
	}

	public void setdVRepair(String dVRepair) {
		this.dVRepair = dVRepair;
	}

	public String getSabrepair() {
		return sabrepair;
	}

	public void setSabrepair(String sabrepair) {
		this.sabrepair = sabrepair;
	}

	public String getUstfacility() {
		return ustfacility;
	}

	public void setUstfacility(String ustfacility) {
		this.ustfacility = ustfacility;
	}

	public String getPc() {
		return pc;
	}

	public void setPc(String pc) {
		this.pc = pc;
	}

	public String getPcsNetworkingFacility() {
		return pcsNetworkingFacility;
	}

	public void setPcsNetworkingFacility(String pcsNetworkingFacility) {
		this.pcsNetworkingFacility = pcsNetworkingFacility;
	}

	public String getTeleCommunicationFacility() {
		return teleCommunicationFacility;
	}

	public void setTeleCommunicationFacility(String teleCommunicationFacility) {
		this.teleCommunicationFacility = teleCommunicationFacility;
	}

	public String getFutureExtension() {
		return futureExtension;
	}

	public void setFutureExtension(String futureExtension) {
		this.futureExtension = futureExtension;
	}

	
}


