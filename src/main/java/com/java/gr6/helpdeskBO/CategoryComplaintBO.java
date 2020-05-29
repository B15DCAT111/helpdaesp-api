package com.java.gr6.helpdeskBO;

import javax.persistence.*;

@Entity
@Table(name = "CATEGORY_COMPLAINT")
public class CategoryComplaintBO {
    private Long catComId;
    private String catComName;
    private String catComCode;

    public CategoryComplaintBO() {
        super();
    }

    public CategoryComplaintBO(Long catComId, String catComName, String catComCode) {
        this.catComId = catComId;
        this.catComName = catComName;
        this.catComCode = catComCode;
    }
    @Id
    @Column(name = "CATEGORY_COMPLAINT_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long getCatComId() {
        return catComId;
    }

    public void setCatComId(Long catComId) {
        this.catComId = catComId;
    }

    @Column(name = "CATEGORY_COMPLAINT_NAME", columnDefinition = "nvarchar (100)")
    public String getCatComName() {
        return catComName;
    }

    public void setCatComName(String catComName) {
        this.catComName = catComName;
    }

    @Column(name = "CATEGORY_COMPLAINT_CODE", columnDefinition = "nvarchar (100)")
    public String getCatComCode() {
        return catComCode;
    }

    public void setCatComCode(String catComCode) {
        this.catComCode = catComCode;
    }
}
