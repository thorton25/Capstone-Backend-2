package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_rootdoc")
public class RootDoc {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "RDOCID")
	private Long rdocId;
	
	@Column (name = "RDOCCDATE")
	private String rdocCDate;
	
	@Column (name = "RDOCSDATE")
	private String rdocSDate;
	
	@Column (name = "RDOCEDATE")
	private String rdocEDate;
	
	@Column (name = "RDOCTITLE")
	private String rdocTitle;
	
//	@Column (name = "")
//	private String RDOCABSTRACT;
	
	@Column (name = "DATID")
	private Integer datId;
	
	@Column (name = "RDOCSSO")
	private String rdocSso;
	
	@Column (name = "RDOCDESC")
	private String rdocDesc;
	
	@Column (name = "RDOCRTIME")
	private String rdocRTime;
	
	@Column (name = "DOCID")
	private Integer docId;
	
	@Column (name = "RDALLOWPRNT")
	private Integer rdAllowPrnt;
	
	@Column (name = "PDATE")
	private String pDate;
	
	@Column (name = "ALLOWOVERRIDES")
	private Integer allowOverrides;
	
	@Column (name = "NUMCOLUMNS")
	private Integer numColumns;
	
	public RootDoc() {
		
	}
	
	public RootDoc(Long rdocId, String rdocCDate, String rdocSDate, String rdocEDate,
			String rdocTitle, Integer datId, String rdocSso, String rdocDesc, String rdocRTime,
			Integer docId, Integer rdAllowPrnt, String pDate, Integer allowOverrides,
			Integer numColumns) {
		super();
		this.rdocId = rdocId;
		this.rdocCDate = rdocCDate;
		this.rdocSDate = rdocSDate;
		this.rdocEDate = rdocEDate;
		this.rdocTitle = rdocTitle;
		this.datId = datId;
		this.rdocSso = rdocSso;
		this.rdocDesc = rdocDesc;
		this.rdocRTime = rdocRTime;
		this.docId = docId;
		this.rdAllowPrnt = rdAllowPrnt;
		this.pDate = pDate;
		this.allowOverrides = allowOverrides;
		this.numColumns = numColumns;
	}
	
	public Long getRdocId() {
		return rdocId;
	}
	public void setRdocId(Long rdocId) {
		this.rdocId = rdocId;
	}
	public String getRdocCDate() {
		return rdocCDate;
	}
	public void setRdocCDate(String rdocCDate) {
		this.rdocCDate = rdocCDate;
	}
	public String getRdocSDate() {
		return rdocSDate;
	}
	public void setRdocSDate(String rdocSDate) {
		this.rdocSDate = rdocSDate;
	}
	public String getRdocEDate() {
		return rdocEDate;
	}
	public void setRdocEDate(String rdocEDate) {
		this.rdocEDate = rdocEDate;
	}
	public String getRdocTitle() {
		return rdocTitle;
	}
	public void setRdocTitle(String rdocTitle) {
		this.rdocTitle = rdocTitle;
	}
//	public String getRDOCABSTRACT() {
//		return RDOCABSTRACT;
//	}
//	public void setRDOCABSTRACT(String rDOCABSTRACT) {
//		RDOCABSTRACT = rDOCABSTRACT;
//	}
	public Integer getDatId() {
		return datId;
	}
	public void setDatId(Integer datId) {
		this.datId = datId;
	}
	public String getRdocSso() {
		return rdocSso;
	}
	public void setRdocSso(String rdocSso) {
		this.rdocSso = rdocSso;
	}
	public String getRdocDesc() {
		return rdocDesc;
	}
	public void setRdocDesc(String rdocDesc) {
		this.rdocDesc = rdocDesc;
	}
	public String getRdocRTime() {
		return rdocRTime;
	}
	public void setRdocRTime(String rdocRTime) {
		this.rdocRTime = rdocRTime;
	}
	public Integer getDocId() {
		return docId;
	}
	public void setDocId(Integer docId) {
		this.docId = docId;
	}
	public Integer getRdAllowPrnt() {
		return rdAllowPrnt;
	}
	public void setRdAllowPrnt(Integer rdAllowPrnt) {
		this.rdAllowPrnt = rdAllowPrnt;
	}
	public String getPDate() {
		return pDate;
	}
	public void setPDate(String pDate) {
		this.pDate = pDate;
	}
	public Integer getAllowOverrides() {
		return allowOverrides;
	}
	public void setAllowOverrides(Integer allowOverrides) {
		this.allowOverrides = allowOverrides;
	}
	public Integer getNumColumns() {
		return numColumns;
	}
	public void setNumColumns(Integer numColumns) {
		this.numColumns = numColumns;
	}
}