package com.java.gr6.helpdeskBO;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "WORK")
public class WorkBO {
    private Long workId;
    private String comCode;
    private String empCode;
    private Date workStartDate;
    private Date workStartDateEnd;
    private int WorkStatus;      // 0: đang chờ sử lý || 1 : đã sử lý xong
    private String workNote;     // đánh giá

    public WorkBO() {
        super();
    }

    public WorkBO(Long workId, String comCode, String empCode, Date workStartDate, Date workStartDateEnd, int workStatus, String workNote) {
        this.workId = workId;
        this.comCode = comCode;
        this.empCode = empCode;
        this.workStartDate = workStartDate;
        this.workStartDateEnd = workStartDateEnd;
        WorkStatus = workStatus;
        this.workNote = workNote;
    }

    @Id
    @Column(name = "WORK_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getWorkId() {
        return workId;
    }

    public void setWorkId(Long workId) {
        this.workId = workId;
    }
    @Column(name = "COMPLAINT_CODE", columnDefinition = "nvarchar (100)")
    public String getComCode() {
        return comCode;
    }

    public void setComCode(String comCode) {
        this.comCode = comCode;
    }

    @Column(name = "EMPLOYEE_CODE", columnDefinition = "nvarchar (100)")
    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "WORK_START_DATE", length = 19)
    public Date getWorkStartDate() {
        return workStartDate;
    }

    public void setWorkStartDate(Date workStartDate) {
        this.workStartDate = workStartDate;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "WORK_END_DATE", length = 19)
    public Date getWorkStartDateEnd() {
        return workStartDateEnd;
    }

    public void setWorkStartDateEnd(Date workStartDateEnd) {
        this.workStartDateEnd = workStartDateEnd;
    }

    @Column(name = "WORK_STATUS",nullable = false)
    public int getWorkStatus() {
        return WorkStatus;
    }

    public void setWorkStatus(int workStatus) {
        WorkStatus = workStatus;
    }

    @Column(name = "WORK_NOTE", columnDefinition = "nvarchar (100)")
    public String getWorkNote() {
        return workNote;
    }

    public void setWorkNote(String workNote) {
        this.workNote = workNote;
    }
}
