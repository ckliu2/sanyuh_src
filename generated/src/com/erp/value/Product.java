package com.erp.value;

import com.base.value.UploadedFile;
import java.io.Serializable;
import java.util.Set;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.base.value.BaseObject;

/** @author Hibernate CodeGenerator */
public class Product extends BaseObject implements Serializable {

    private static final long serialVersionUID = 1L;
    /** persistent field */
    private String no;

    /** persistent field */
    private String name;

    /** nullable persistent field */
    private String overview;

    /** nullable persistent field */
    private String specification;

    /** nullable persistent field */
    private com.erp.value.ProductType productType;
    private Long productTypeId;

    /** nullable persistent field */
    private UploadedFile logo;
    private String logoFileName;
    private Long logoId;

    /** nullable persistent field */
    private Set photos;

    /** nullable persistent field */
    private Set downloads;

    /** nullable persistent field */
    private Set diagrams;

    /** full constructor */
    public Product(String no, String name, String overview, String specification, com.erp.value.ProductType productType, UploadedFile logo, Set photos, Set downloads, Set diagrams) {
        this.no = no;
        this.name = name;
        this.overview = overview;
        this.specification = specification;
        this.productType = productType;
        this.logo = logo;
        this.photos = photos;
        this.downloads = downloads;
        this.diagrams = diagrams;
    }

    /** default constructor */
    public Product() {
    }

    /** minimal constructor */
    public Product(String no, String name) {
        this.no = no;
        this.name = name;
    }

    public String getNo() {
        return this.no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOverview() {
        return this.overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }

    public String getSpecification() {
        return this.specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification;
    }

    public com.erp.value.ProductType getProductType() {
        return this.productType;
    }

    public void setProductType(com.erp.value.ProductType productType) {
        this.productType = productType;
    }

    public Long getProductTypeId() {
        if (this.productType != null && this.productType.getId() != null)
            return productType.getId();
        return this.productTypeId;
    }

    public void setProductTypeId(Long id) {
        this.productTypeId = id;
    }

    public UploadedFile getLogo() {
        return this.logo;
    }

    public void setLogo(UploadedFile logo) {
        this.logo = logo;
    }

    public String getLogoFileName() {
        return this.logoFileName;
    }

    public void setLogoFileName(String val) {
        this.logoFileName = val;
    }

    public Long getLogoId() {
        if (this.logo != null && this.logo.getId() != null)
            return logo.getId();
        return this.logoId;
    }

    public void setLogoId(Long id) {
        this.logoId = id;
    }

    public Set getPhotos() {
        return this.photos;
    }

    public void setPhotos(Set photos) {
        this.photos = photos;
    }

    public Set getDownloads() {
        return this.downloads;
    }

    public void setDownloads(Set downloads) {
        this.downloads = downloads;
    }

    public Set getDiagrams() {
        return this.diagrams;
    }

    public void setDiagrams(Set diagrams) {
        this.diagrams = diagrams;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("no", getNo())
            .append("name", getName())
            .append("overview", getOverview())
            .append("specification", getSpecification())
            .append("productType", getProductType())
            .append("logo", getLogo())
            .append("photos", getPhotos())
            .append("downloads", getDownloads())
            .append("diagrams", getDiagrams())
            .toString();
    }

    public String getCaption_() {
        return toString();
    }

}
