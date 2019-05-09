package com.supermarket.demo.model.salary;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class SuSalary implements Serializable {
    private Long id;

    private Long employId;
    
    private String employName;

    private String salaryDate;

    private BigDecimal salary;

    private BigDecimal achievementSalary;

    private BigDecimal debitFee;

    private String remark;

    private Long createBy;

    private Boolean isDelete;

    private Date createDate;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmployId() {
        return employId;
    }

    public void setEmployId(Long employId) {
        this.employId = employId;
    }

    public String getEmployName() {
		return employName;
	}

	public void setEmployName(String employName) {
		this.employName = employName;
	}

	public String getSalaryDate() {
        return salaryDate;
    }

    public void setSalaryDate(String salaryDate) {
        this.salaryDate = salaryDate;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public BigDecimal getAchievementSalary() {
        return achievementSalary;
    }

    public void setAchievementSalary(BigDecimal achievementSalary) {
        this.achievementSalary = achievementSalary;
    }

    public BigDecimal getDebitFee() {
        return debitFee;
    }

    public void setDebitFee(BigDecimal debitFee) {
        this.debitFee = debitFee;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Long getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Long createBy) {
        this.createBy = createBy;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}