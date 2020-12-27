package com.swis.app.data.bean;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SubCategory")
public class SubCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "sub_category_name")
	private String subCategoryName;

	@Column(name = "sub_category_order")
	private Integer subCategoryOrder;

	@Column(name = "created_on")
	private Date createdOn;

	@Column(name = "modified_on")
	private Date modifiedOn;

	@Column(name = "status", nullable = false, columnDefinition = "BIT default 1")
	private Boolean status;
	
	@Column(name = "category_id")
	private Long categoryId;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSubCategoryName() {
		return subCategoryName;
	}

	public void setSubCategoryName(String subCategoryName) {
		this.subCategoryName = subCategoryName;
	}

	public Integer getSubCategoryOrder() {
		return subCategoryOrder;
	}

	public void setSubCategoryOrder(Integer subCategoryOrder) {
		this.subCategoryOrder = subCategoryOrder;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getModifiedOn() {
		return modifiedOn;
	}

	public void setModifiedOn(Date modifiedOn) {
		this.modifiedOn = modifiedOn;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "SubCategory [id=" + id + ", subCategoryName=" + subCategoryName + ", subCategoryOrder="
				+ subCategoryOrder + ", createdOn=" + createdOn + ", modifiedOn=" + modifiedOn + ", status=" + status
				+ ", categoryId=" + categoryId + "]";
	}

}
