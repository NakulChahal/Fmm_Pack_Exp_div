package com.hellokoding.springboot;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity		
@Table(name="FMM_ORG_M", schema="NAKUL")
public class FmmOrgMTable {
	
	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ORG_SLNO")
	private Long orgSlNo;
	
	@Column(name="ORG_CODE")
	private Long orgCode;
	
	@Column(name="ORG_TYPE")
	private String orgType;
	
	@Column(name="ORG_DESC")
	private String orgDesc;

	//private FmmInfrastructure fmmInfrastructure;
	


	public Long getOrgSlNo() {
		return orgSlNo;
	}

	public void setOrgSlNo(Long orgSlNo) {
		this.orgSlNo = orgSlNo;
	}

	public Long getOrgCode() {
		return orgCode;
	}

	public void setOrgCode(Long orgCode) {
		this.orgCode = orgCode;
	}

	public String getOrgType() {
		return orgType;
	}

	public void setOrgType(String orgType) {
		this.orgType = orgType;
	}

	public String getOrgDesc() {
		return orgDesc;
	}

	public void setOrgDesc(String orgDesc) {
		this.orgDesc = orgDesc;
	}
    
	
//	
//	public FmmInfrastructure getfmmOrgInfrastructure() {
//		return fmmInfrastructure;
//	}
//
//	public void setFmmOrgInfrastructure(FmmInfrastructure fmmInfrastructure) {
//		this.fmmOrgInfrastructure = fmmInfrastructure;
//	}

	public FmmOrgMTable() {
		
		super();
	}
	
//	public FmmOrgMTable(Long orgSlNo, Long orgCode, String orgType, String orgDesc) {
//		super();
//		this.orgSlNo = orgSlNo;
//		this.orgCode = orgCode;
//		this.orgType = orgType;
//		this.orgDesc = orgDesc;
//
//	}

	
//	 @OneToMany(cascade = CascadeType.ALL)
//	    @JoinColumn(name = "ORG_SLNO")
//	    private FmmInfrastructure fmmInfrastructure() {
//	        return fmmInfrastructure;
//	    }
//	
	
	public FmmOrgMTable(Long orgSlNo, Long orgCode, String orgType, String orgDesc) {
		super();
		this.orgSlNo = orgSlNo;
		this.orgCode = orgCode;
		this.orgType = orgType;
		this.orgDesc = orgDesc;
		//this.fmmOrgInfrastructure = fmmInfrastructure;
	}

	
	
	

	public List<FmmInfrastructure> getFmmOrgInfrastructure() {
		return fmmInfrastructure;
	}

	public void setFmmOrgInfrastructure(List<FmmInfrastructure> fmmInfrastructure) {
		this.fmmInfrastructure = fmmInfrastructure;
	}

	@Override
	public String toString() {
		return "FmmOrgMTable [orgSlNo=" + orgSlNo + ", orgCode=" + orgCode + ", orgType=" + orgType + ", orgDesc="
				+ orgDesc + "]";
	}


	@OneToMany(cascade =  CascadeType.ALL)
	
	private List<FmmInfrastructure> fmmInfrastructure;


	
	

	
}
