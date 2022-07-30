package com.capstone.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "t_reportconfig")
public class ReportConfig {
	
	
	@Column (name = "DIMENSIONSTARTCOL")
	private Integer dimensionStartCol;
	
	@Column (name = "DIMENSIONSTARTROW")
	private Integer dimensionStartRow;
	
	@Column (name = "DIMENSIONLENGTH")
	private Integer dimensionLength;
	
	@Column (name = "FORMATTYPE")
	private Integer formatType;
	
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
	
    @Column (name = "EXCELCOLUMN")
    private Integer excelColumn;
    
	@Column (name = "EXCELROW")
    private Integer excelRow;
	
	@Column (name = "DIMREPID")
	private Integer dimRepId;
	
	public ReportConfig() {
		
	}

	public ReportConfig(Integer dimensionStartCol, Integer dimensionStartRow, Integer dimensionLength,
			Integer formatType, Long configId, Integer cmapId, Integer dimId, String dimValue, Integer configGroupId,
			String addedBy, String modifiedBy, char status, String deletedBy, String grouped, Integer groupOrder,
			Integer excelColumn, Integer excelRow, Integer dimRepId) {
		super();
		this.dimensionStartCol = dimensionStartCol;
		this.dimensionStartRow = dimensionStartRow;
		this.dimensionLength = dimensionLength;
		this.formatType = formatType;
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
		this.excelColumn = excelColumn;
		this.excelRow = excelRow;
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

	public Integer getFormatType() {
		return formatType;
	}

	public void setFormatType(Integer formatType) {
		this.formatType = formatType;
	}

	public Long getConfigId() {
		return configId;
	}

	public void setConfigId(Long configId) {
		this.configId = configId;
	}

	public Integer getCmapId() {
		return cmapId;
	}

	public void setCmapId(Integer cmapId) {
		this.cmapId = cmapId;
	}

	public Integer getDimId() {
		return dimId;
	}

	public void setDimId(Integer dimId) {
		this.dimId = dimId;
	}

	public String getDimValue() {
		return dimValue;
	}

	public void setDimValue(String dimValue) {
		this.dimValue = dimValue;
	}

	public Integer getConfigGroupId() {
		return configGroupId;
	}

	public void setConfigGroupId(Integer configGroupId) {
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

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public char getStatus() {
		return status;
	}

	public void setStatus(char status) {
		this.status = status;
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

	public void setGroupOrder(Integer groupOrder) {
		this.groupOrder = groupOrder;
	}

	public Integer getExcelColumn() {
		return excelColumn;
	}

	public void setExcelColumn(Integer excelColumn) {
		this.excelColumn = excelColumn;
	}

	public Integer getExcelRow() {
		return excelRow;
	}

	public void setExcelRow(Integer excelRow) {
		this.excelRow = excelRow;
	}

	public Integer getDimRepId() {
		return dimRepId;
	}

	public void setDimRepId(Integer dimRepId) {
		this.dimRepId = dimRepId;
	}
	
}
