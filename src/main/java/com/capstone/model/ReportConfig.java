package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_reportconfig")
public class ReportConfig {
	
	
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column (name = "DIMENSIONSTARTCOL")
	private Integer dimensionStartCol;
	
	@Column (name = "DIMENSIONSTARTROW")
	private Integer dimensionStartRow;
	
	@Column (name = "DIMENSIONLENGTH")
	private Integer dimensionLength;
	
	@Column (name = "FORMATTYPE")
	private Integer formattype;
	
//  @Column (name = "POSTITLE")
//  private String postitle;
	
	@Id
	@Column (name = "CONFIGID")
	private Long configId;
	
	@Column (name = "CMAPID")
	private Integer cmapId;
	
	@Column (name = "DIMID")
	private Integer dimId;
	
	@Column (name = "DIMVALUE")
	private String dimValue;
	
	@Column (name = "CONFIGGROUPID")
	private Integer configGroupId;
	
	@Column (name = "ADDEDBY")
	private String addedBy;
	
	@Column (name = "MODIFIEDBY")
	private String modifiedBy;
	
	@Column (name = "STATUS")
	private char status;
	
	@Column (name = "DELETEDBY")
	private String deletedBy;
	
	@Column (name = "GROUPED")
	private String grouped;
	
	@Column (name = "GROUPORDER")
	private Integer groupOrder;
	
//	private String EXCELCOLUMN;
	
//	private Integer EXCELROW;
	
	@Column (name = "DIMREPID")
	private Integer dimRepId;
	
	public ReportConfig() {
		
	}
	
	public ReportConfig(Integer dimensionStartCol, Integer dimensionStartRow, Integer dimensionLength, Integer formattype,
			Long configId, Integer cmapId, Integer dimId, String dimValue, Integer configGroupId, String addedBy,
			String modifiedBy, char status, String deletedBy, String grouped, Integer groupOrder, Integer dimRepId) {
		super();
		this.dimensionStartCol = dimensionStartCol;
		this.dimensionStartRow = dimensionStartRow;
		this.dimensionLength = dimensionLength;
		this.formattype = formattype;
		this.configId = configId;
		this.cmapId = cmapId;
		this.dimId = dimId;
		this.dimValue = dimValue;
		this.configGroupId = configGroupId;
		this.addedBy = addedBy;
		this.modifiedBy = modifiedBy;
		this.status = status;
		this.deletedBy = deletedBy;
		this.grouped = grouped;
		this.groupOrder = groupOrder;
		this.dimRepId = dimRepId;
	}
	
	public Integer getDimensionStartCol() {
		return dimensionStartCol;
	}
	public void setDimensionStartCol(Integer dimensionStartCol) {
		this.dimensionStartCol = dimensionStartCol;
	}
	public Integer getDimensionStartRow() {
		return dimensionStartRow;
	}
	public void setDimensionStartRow(Integer dimensionStartRow) {
		this.dimensionStartRow = dimensionStartRow;
	}
	public Integer getDimensionLength() {
		return dimensionLength;
	}
	public void setDimensionLength(Integer dimensionLength) {
		this.dimensionLength = dimensionLength;
	}
	public Integer getFormattype() {
		return formattype;
	}
	public void setFormattype(Integer formattype) {
		this.formattype = formattype;
	}
//	public String getPOSTITLE() {
//		return POSTITLE;
//	}
//	public void setPOSTITLE(String pOSTITLE) {
//		POSTITLE = pOSTITLE;
//	}
	public Long getConfigId() {
		return configId;
	}
	public void setConfigId(Long configId) {
		this.configId = configId;
	}
	public Integer getCmapId() {
		return cmapId;
	}
	public void setcmapId(Integer cmapId) {
		this.cmapId = cmapId;
	}
	public Integer getdimId() {
		return dimId;
	}
	public void setdimId(Integer dimId) {
		this.dimId = dimId;
	}
	public String getdimValue() {
		return dimValue;
	}
	public void setdimValue(String dimValue) {
		this.dimValue = dimValue;
	}
	public Integer getconfigGroupId() {
		return configGroupId;
	}
	public void setconfigGroupId(Integer configGroupId) {
		this.configGroupId = configGroupId;
	}
	public String getAddedBy() {
		return addedBy;
	}
	public void setAddedBy(String addedBy) {
		this.addedBy = addedBy;
	}
	public String getModifiedBy() {
		return modifiedBy;
	}
	public void setMODIFIEDBY(String mODIFIEDBY) {
		this.modifiedBy = mODIFIEDBY;
	}
	public char getStatus() {
		return status;
	}
	public void setSTATUS(char sTATUS) {
		this.status = sTATUS;
	}
	public String getDeletedBy() {
		return deletedBy;
	}
	public void setDeletedBy(String deletedBy) {
		this.deletedBy = deletedBy;
	}
	public String getGrouped() {
		return grouped;
	}
	public void setGrouped(String grouped) {
		this.grouped = grouped;
	}
	public Integer getGroupOrder() {
		return groupOrder;
	}
	public void setGROUPORDER(Integer gROUPORDER) {
		this.groupOrder = gROUPORDER;
	}
//	public String getEXCELCOLUMN() {
//		return EXCELCOLUMN;
//	}
//	public void setEXCELCOLUMN(String eXCELCOLUMN) {
//		EXCELCOLUMN = eXCELCOLUMN;
//	}
//	public Integer getEXCELROW() {
//		return EXCELROW;
//	}
//	public void setEXCELROW(Integer eXCELROW) {
//		EXCELROW = eXCELROW;
//	}
	public Integer getDimRepId() {
		return dimRepId;
	}
	public void setDimRepId(Integer dimRepId) {
		this.dimRepId = dimRepId;
	}
}
