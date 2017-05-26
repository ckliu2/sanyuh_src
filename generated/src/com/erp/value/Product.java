package com.erp.value;

import com.base.value.UploadedFile;
import java.io.Serializable;
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
    private UploadedFile productPhoto1;
    private String productPhoto1FileName;
    private Long productPhoto1Id;

    /** nullable persistent field */
    private UploadedFile productPhoto2;
    private String productPhoto2FileName;
    private Long productPhoto2Id;

    /** nullable persistent field */
    private UploadedFile productPhoto3;
    private String productPhoto3FileName;
    private Long productPhoto3Id;

    /** nullable persistent field */
    private UploadedFile productPhoto4;
    private String productPhoto4FileName;
    private Long productPhoto4Id;

    /** nullable persistent field */
    private UploadedFile productPhoto5;
    private String productPhoto5FileName;
    private Long productPhoto5Id;

    /** nullable persistent field */
    private UploadedFile productPhoto6;
    private String productPhoto6FileName;
    private Long productPhoto6Id;

    /** nullable persistent field */
    private UploadedFile productPhoto7;
    private String productPhoto7FileName;
    private Long productPhoto7Id;

    /** nullable persistent field */
    private UploadedFile productPhoto8;
    private String productPhoto8FileName;
    private Long productPhoto8Id;

    /** nullable persistent field */
    private UploadedFile productPhoto9;
    private String productPhoto9FileName;
    private Long productPhoto9Id;

    /** nullable persistent field */
    private UploadedFile productPhoto10;
    private String productPhoto10FileName;
    private Long productPhoto10Id;

    /** nullable persistent field */
    private UploadedFile download1;
    private String download1FileName;
    private Long download1Id;

    /** nullable persistent field */
    private UploadedFile download2;
    private String download2FileName;
    private Long download2Id;

    /** nullable persistent field */
    private UploadedFile download3;
    private String download3FileName;
    private Long download3Id;

    /** nullable persistent field */
    private UploadedFile download4;
    private String download4FileName;
    private Long download4Id;

    /** nullable persistent field */
    private UploadedFile download5;
    private String download5FileName;
    private Long download5Id;

    /** nullable persistent field */
    private UploadedFile download6;
    private String download6FileName;
    private Long download6Id;

    /** nullable persistent field */
    private UploadedFile download7;
    private String download7FileName;
    private Long download7Id;

    /** nullable persistent field */
    private UploadedFile download8;
    private String download8FileName;
    private Long download8Id;

    /** nullable persistent field */
    private UploadedFile download9;
    private String download9FileName;
    private Long download9Id;

    /** nullable persistent field */
    private UploadedFile download10;
    private String download10FileName;
    private Long download10Id;

    /** nullable persistent field */
    private UploadedFile diagram1;
    private String diagram1FileName;
    private Long diagram1Id;

    /** nullable persistent field */
    private UploadedFile diagram2;
    private String diagram2FileName;
    private Long diagram2Id;

    /** nullable persistent field */
    private UploadedFile diagram3;
    private String diagram3FileName;
    private Long diagram3Id;

    /** nullable persistent field */
    private UploadedFile diagram4;
    private String diagram4FileName;
    private Long diagram4Id;

    /** nullable persistent field */
    private UploadedFile diagram5;
    private String diagram5FileName;
    private Long diagram5Id;

    /** nullable persistent field */
    private UploadedFile diagram6;
    private String diagram6FileName;
    private Long diagram6Id;

    /** nullable persistent field */
    private UploadedFile diagram7;
    private String diagram7FileName;
    private Long diagram7Id;

    /** nullable persistent field */
    private UploadedFile diagram8;
    private String diagram8FileName;
    private Long diagram8Id;

    /** nullable persistent field */
    private UploadedFile diagram9;
    private String diagram9FileName;
    private Long diagram9Id;

    /** nullable persistent field */
    private UploadedFile diagram10;
    private String diagram10FileName;
    private Long diagram10Id;

    /** full constructor */
    public Product(String no, String name, String overview, String specification, com.erp.value.ProductType productType, UploadedFile logo, UploadedFile productPhoto1, UploadedFile productPhoto2, UploadedFile productPhoto3, UploadedFile productPhoto4, UploadedFile productPhoto5, UploadedFile productPhoto6, UploadedFile productPhoto7, UploadedFile productPhoto8, UploadedFile productPhoto9, UploadedFile productPhoto10, UploadedFile download1, UploadedFile download2, UploadedFile download3, UploadedFile download4, UploadedFile download5, UploadedFile download6, UploadedFile download7, UploadedFile download8, UploadedFile download9, UploadedFile download10, UploadedFile diagram1, UploadedFile diagram2, UploadedFile diagram3, UploadedFile diagram4, UploadedFile diagram5, UploadedFile diagram6, UploadedFile diagram7, UploadedFile diagram8, UploadedFile diagram9, UploadedFile diagram10) {
        this.no = no;
        this.name = name;
        this.overview = overview;
        this.specification = specification;
        this.productType = productType;
        this.logo = logo;
        this.productPhoto1 = productPhoto1;
        this.productPhoto2 = productPhoto2;
        this.productPhoto3 = productPhoto3;
        this.productPhoto4 = productPhoto4;
        this.productPhoto5 = productPhoto5;
        this.productPhoto6 = productPhoto6;
        this.productPhoto7 = productPhoto7;
        this.productPhoto8 = productPhoto8;
        this.productPhoto9 = productPhoto9;
        this.productPhoto10 = productPhoto10;
        this.download1 = download1;
        this.download2 = download2;
        this.download3 = download3;
        this.download4 = download4;
        this.download5 = download5;
        this.download6 = download6;
        this.download7 = download7;
        this.download8 = download8;
        this.download9 = download9;
        this.download10 = download10;
        this.diagram1 = diagram1;
        this.diagram2 = diagram2;
        this.diagram3 = diagram3;
        this.diagram4 = diagram4;
        this.diagram5 = diagram5;
        this.diagram6 = diagram6;
        this.diagram7 = diagram7;
        this.diagram8 = diagram8;
        this.diagram9 = diagram9;
        this.diagram10 = diagram10;
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

    public UploadedFile getProductPhoto1() {
        return this.productPhoto1;
    }

    public void setProductPhoto1(UploadedFile productPhoto1) {
        this.productPhoto1 = productPhoto1;
    }

    public String getProductPhoto1FileName() {
        return this.productPhoto1FileName;
    }

    public void setProductPhoto1FileName(String val) {
        this.productPhoto1FileName = val;
    }

    public Long getProductPhoto1Id() {
        if (this.productPhoto1 != null && this.productPhoto1.getId() != null)
            return productPhoto1.getId();
        return this.productPhoto1Id;
    }

    public void setProductPhoto1Id(Long id) {
        this.productPhoto1Id = id;
    }

    public UploadedFile getProductPhoto2() {
        return this.productPhoto2;
    }

    public void setProductPhoto2(UploadedFile productPhoto2) {
        this.productPhoto2 = productPhoto2;
    }

    public String getProductPhoto2FileName() {
        return this.productPhoto2FileName;
    }

    public void setProductPhoto2FileName(String val) {
        this.productPhoto2FileName = val;
    }

    public Long getProductPhoto2Id() {
        if (this.productPhoto2 != null && this.productPhoto2.getId() != null)
            return productPhoto2.getId();
        return this.productPhoto2Id;
    }

    public void setProductPhoto2Id(Long id) {
        this.productPhoto2Id = id;
    }

    public UploadedFile getProductPhoto3() {
        return this.productPhoto3;
    }

    public void setProductPhoto3(UploadedFile productPhoto3) {
        this.productPhoto3 = productPhoto3;
    }

    public String getProductPhoto3FileName() {
        return this.productPhoto3FileName;
    }

    public void setProductPhoto3FileName(String val) {
        this.productPhoto3FileName = val;
    }

    public Long getProductPhoto3Id() {
        if (this.productPhoto3 != null && this.productPhoto3.getId() != null)
            return productPhoto3.getId();
        return this.productPhoto3Id;
    }

    public void setProductPhoto3Id(Long id) {
        this.productPhoto3Id = id;
    }

    public UploadedFile getProductPhoto4() {
        return this.productPhoto4;
    }

    public void setProductPhoto4(UploadedFile productPhoto4) {
        this.productPhoto4 = productPhoto4;
    }

    public String getProductPhoto4FileName() {
        return this.productPhoto4FileName;
    }

    public void setProductPhoto4FileName(String val) {
        this.productPhoto4FileName = val;
    }

    public Long getProductPhoto4Id() {
        if (this.productPhoto4 != null && this.productPhoto4.getId() != null)
            return productPhoto4.getId();
        return this.productPhoto4Id;
    }

    public void setProductPhoto4Id(Long id) {
        this.productPhoto4Id = id;
    }

    public UploadedFile getProductPhoto5() {
        return this.productPhoto5;
    }

    public void setProductPhoto5(UploadedFile productPhoto5) {
        this.productPhoto5 = productPhoto5;
    }

    public String getProductPhoto5FileName() {
        return this.productPhoto5FileName;
    }

    public void setProductPhoto5FileName(String val) {
        this.productPhoto5FileName = val;
    }

    public Long getProductPhoto5Id() {
        if (this.productPhoto5 != null && this.productPhoto5.getId() != null)
            return productPhoto5.getId();
        return this.productPhoto5Id;
    }

    public void setProductPhoto5Id(Long id) {
        this.productPhoto5Id = id;
    }

    public UploadedFile getProductPhoto6() {
        return this.productPhoto6;
    }

    public void setProductPhoto6(UploadedFile productPhoto6) {
        this.productPhoto6 = productPhoto6;
    }

    public String getProductPhoto6FileName() {
        return this.productPhoto6FileName;
    }

    public void setProductPhoto6FileName(String val) {
        this.productPhoto6FileName = val;
    }

    public Long getProductPhoto6Id() {
        if (this.productPhoto6 != null && this.productPhoto6.getId() != null)
            return productPhoto6.getId();
        return this.productPhoto6Id;
    }

    public void setProductPhoto6Id(Long id) {
        this.productPhoto6Id = id;
    }

    public UploadedFile getProductPhoto7() {
        return this.productPhoto7;
    }

    public void setProductPhoto7(UploadedFile productPhoto7) {
        this.productPhoto7 = productPhoto7;
    }

    public String getProductPhoto7FileName() {
        return this.productPhoto7FileName;
    }

    public void setProductPhoto7FileName(String val) {
        this.productPhoto7FileName = val;
    }

    public Long getProductPhoto7Id() {
        if (this.productPhoto7 != null && this.productPhoto7.getId() != null)
            return productPhoto7.getId();
        return this.productPhoto7Id;
    }

    public void setProductPhoto7Id(Long id) {
        this.productPhoto7Id = id;
    }

    public UploadedFile getProductPhoto8() {
        return this.productPhoto8;
    }

    public void setProductPhoto8(UploadedFile productPhoto8) {
        this.productPhoto8 = productPhoto8;
    }

    public String getProductPhoto8FileName() {
        return this.productPhoto8FileName;
    }

    public void setProductPhoto8FileName(String val) {
        this.productPhoto8FileName = val;
    }

    public Long getProductPhoto8Id() {
        if (this.productPhoto8 != null && this.productPhoto8.getId() != null)
            return productPhoto8.getId();
        return this.productPhoto8Id;
    }

    public void setProductPhoto8Id(Long id) {
        this.productPhoto8Id = id;
    }

    public UploadedFile getProductPhoto9() {
        return this.productPhoto9;
    }

    public void setProductPhoto9(UploadedFile productPhoto9) {
        this.productPhoto9 = productPhoto9;
    }

    public String getProductPhoto9FileName() {
        return this.productPhoto9FileName;
    }

    public void setProductPhoto9FileName(String val) {
        this.productPhoto9FileName = val;
    }

    public Long getProductPhoto9Id() {
        if (this.productPhoto9 != null && this.productPhoto9.getId() != null)
            return productPhoto9.getId();
        return this.productPhoto9Id;
    }

    public void setProductPhoto9Id(Long id) {
        this.productPhoto9Id = id;
    }

    public UploadedFile getProductPhoto10() {
        return this.productPhoto10;
    }

    public void setProductPhoto10(UploadedFile productPhoto10) {
        this.productPhoto10 = productPhoto10;
    }

    public String getProductPhoto10FileName() {
        return this.productPhoto10FileName;
    }

    public void setProductPhoto10FileName(String val) {
        this.productPhoto10FileName = val;
    }

    public Long getProductPhoto10Id() {
        if (this.productPhoto10 != null && this.productPhoto10.getId() != null)
            return productPhoto10.getId();
        return this.productPhoto10Id;
    }

    public void setProductPhoto10Id(Long id) {
        this.productPhoto10Id = id;
    }

    public UploadedFile getDownload1() {
        return this.download1;
    }

    public void setDownload1(UploadedFile download1) {
        this.download1 = download1;
    }

    public String getDownload1FileName() {
        return this.download1FileName;
    }

    public void setDownload1FileName(String val) {
        this.download1FileName = val;
    }

    public Long getDownload1Id() {
        if (this.download1 != null && this.download1.getId() != null)
            return download1.getId();
        return this.download1Id;
    }

    public void setDownload1Id(Long id) {
        this.download1Id = id;
    }

    public UploadedFile getDownload2() {
        return this.download2;
    }

    public void setDownload2(UploadedFile download2) {
        this.download2 = download2;
    }

    public String getDownload2FileName() {
        return this.download2FileName;
    }

    public void setDownload2FileName(String val) {
        this.download2FileName = val;
    }

    public Long getDownload2Id() {
        if (this.download2 != null && this.download2.getId() != null)
            return download2.getId();
        return this.download2Id;
    }

    public void setDownload2Id(Long id) {
        this.download2Id = id;
    }

    public UploadedFile getDownload3() {
        return this.download3;
    }

    public void setDownload3(UploadedFile download3) {
        this.download3 = download3;
    }

    public String getDownload3FileName() {
        return this.download3FileName;
    }

    public void setDownload3FileName(String val) {
        this.download3FileName = val;
    }

    public Long getDownload3Id() {
        if (this.download3 != null && this.download3.getId() != null)
            return download3.getId();
        return this.download3Id;
    }

    public void setDownload3Id(Long id) {
        this.download3Id = id;
    }

    public UploadedFile getDownload4() {
        return this.download4;
    }

    public void setDownload4(UploadedFile download4) {
        this.download4 = download4;
    }

    public String getDownload4FileName() {
        return this.download4FileName;
    }

    public void setDownload4FileName(String val) {
        this.download4FileName = val;
    }

    public Long getDownload4Id() {
        if (this.download4 != null && this.download4.getId() != null)
            return download4.getId();
        return this.download4Id;
    }

    public void setDownload4Id(Long id) {
        this.download4Id = id;
    }

    public UploadedFile getDownload5() {
        return this.download5;
    }

    public void setDownload5(UploadedFile download5) {
        this.download5 = download5;
    }

    public String getDownload5FileName() {
        return this.download5FileName;
    }

    public void setDownload5FileName(String val) {
        this.download5FileName = val;
    }

    public Long getDownload5Id() {
        if (this.download5 != null && this.download5.getId() != null)
            return download5.getId();
        return this.download5Id;
    }

    public void setDownload5Id(Long id) {
        this.download5Id = id;
    }

    public UploadedFile getDownload6() {
        return this.download6;
    }

    public void setDownload6(UploadedFile download6) {
        this.download6 = download6;
    }

    public String getDownload6FileName() {
        return this.download6FileName;
    }

    public void setDownload6FileName(String val) {
        this.download6FileName = val;
    }

    public Long getDownload6Id() {
        if (this.download6 != null && this.download6.getId() != null)
            return download6.getId();
        return this.download6Id;
    }

    public void setDownload6Id(Long id) {
        this.download6Id = id;
    }

    public UploadedFile getDownload7() {
        return this.download7;
    }

    public void setDownload7(UploadedFile download7) {
        this.download7 = download7;
    }

    public String getDownload7FileName() {
        return this.download7FileName;
    }

    public void setDownload7FileName(String val) {
        this.download7FileName = val;
    }

    public Long getDownload7Id() {
        if (this.download7 != null && this.download7.getId() != null)
            return download7.getId();
        return this.download7Id;
    }

    public void setDownload7Id(Long id) {
        this.download7Id = id;
    }

    public UploadedFile getDownload8() {
        return this.download8;
    }

    public void setDownload8(UploadedFile download8) {
        this.download8 = download8;
    }

    public String getDownload8FileName() {
        return this.download8FileName;
    }

    public void setDownload8FileName(String val) {
        this.download8FileName = val;
    }

    public Long getDownload8Id() {
        if (this.download8 != null && this.download8.getId() != null)
            return download8.getId();
        return this.download8Id;
    }

    public void setDownload8Id(Long id) {
        this.download8Id = id;
    }

    public UploadedFile getDownload9() {
        return this.download9;
    }

    public void setDownload9(UploadedFile download9) {
        this.download9 = download9;
    }

    public String getDownload9FileName() {
        return this.download9FileName;
    }

    public void setDownload9FileName(String val) {
        this.download9FileName = val;
    }

    public Long getDownload9Id() {
        if (this.download9 != null && this.download9.getId() != null)
            return download9.getId();
        return this.download9Id;
    }

    public void setDownload9Id(Long id) {
        this.download9Id = id;
    }

    public UploadedFile getDownload10() {
        return this.download10;
    }

    public void setDownload10(UploadedFile download10) {
        this.download10 = download10;
    }

    public String getDownload10FileName() {
        return this.download10FileName;
    }

    public void setDownload10FileName(String val) {
        this.download10FileName = val;
    }

    public Long getDownload10Id() {
        if (this.download10 != null && this.download10.getId() != null)
            return download10.getId();
        return this.download10Id;
    }

    public void setDownload10Id(Long id) {
        this.download10Id = id;
    }

    public UploadedFile getDiagram1() {
        return this.diagram1;
    }

    public void setDiagram1(UploadedFile diagram1) {
        this.diagram1 = diagram1;
    }

    public String getDiagram1FileName() {
        return this.diagram1FileName;
    }

    public void setDiagram1FileName(String val) {
        this.diagram1FileName = val;
    }

    public Long getDiagram1Id() {
        if (this.diagram1 != null && this.diagram1.getId() != null)
            return diagram1.getId();
        return this.diagram1Id;
    }

    public void setDiagram1Id(Long id) {
        this.diagram1Id = id;
    }

    public UploadedFile getDiagram2() {
        return this.diagram2;
    }

    public void setDiagram2(UploadedFile diagram2) {
        this.diagram2 = diagram2;
    }

    public String getDiagram2FileName() {
        return this.diagram2FileName;
    }

    public void setDiagram2FileName(String val) {
        this.diagram2FileName = val;
    }

    public Long getDiagram2Id() {
        if (this.diagram2 != null && this.diagram2.getId() != null)
            return diagram2.getId();
        return this.diagram2Id;
    }

    public void setDiagram2Id(Long id) {
        this.diagram2Id = id;
    }

    public UploadedFile getDiagram3() {
        return this.diagram3;
    }

    public void setDiagram3(UploadedFile diagram3) {
        this.diagram3 = diagram3;
    }

    public String getDiagram3FileName() {
        return this.diagram3FileName;
    }

    public void setDiagram3FileName(String val) {
        this.diagram3FileName = val;
    }

    public Long getDiagram3Id() {
        if (this.diagram3 != null && this.diagram3.getId() != null)
            return diagram3.getId();
        return this.diagram3Id;
    }

    public void setDiagram3Id(Long id) {
        this.diagram3Id = id;
    }

    public UploadedFile getDiagram4() {
        return this.diagram4;
    }

    public void setDiagram4(UploadedFile diagram4) {
        this.diagram4 = diagram4;
    }

    public String getDiagram4FileName() {
        return this.diagram4FileName;
    }

    public void setDiagram4FileName(String val) {
        this.diagram4FileName = val;
    }

    public Long getDiagram4Id() {
        if (this.diagram4 != null && this.diagram4.getId() != null)
            return diagram4.getId();
        return this.diagram4Id;
    }

    public void setDiagram4Id(Long id) {
        this.diagram4Id = id;
    }

    public UploadedFile getDiagram5() {
        return this.diagram5;
    }

    public void setDiagram5(UploadedFile diagram5) {
        this.diagram5 = diagram5;
    }

    public String getDiagram5FileName() {
        return this.diagram5FileName;
    }

    public void setDiagram5FileName(String val) {
        this.diagram5FileName = val;
    }

    public Long getDiagram5Id() {
        if (this.diagram5 != null && this.diagram5.getId() != null)
            return diagram5.getId();
        return this.diagram5Id;
    }

    public void setDiagram5Id(Long id) {
        this.diagram5Id = id;
    }

    public UploadedFile getDiagram6() {
        return this.diagram6;
    }

    public void setDiagram6(UploadedFile diagram6) {
        this.diagram6 = diagram6;
    }

    public String getDiagram6FileName() {
        return this.diagram6FileName;
    }

    public void setDiagram6FileName(String val) {
        this.diagram6FileName = val;
    }

    public Long getDiagram6Id() {
        if (this.diagram6 != null && this.diagram6.getId() != null)
            return diagram6.getId();
        return this.diagram6Id;
    }

    public void setDiagram6Id(Long id) {
        this.diagram6Id = id;
    }

    public UploadedFile getDiagram7() {
        return this.diagram7;
    }

    public void setDiagram7(UploadedFile diagram7) {
        this.diagram7 = diagram7;
    }

    public String getDiagram7FileName() {
        return this.diagram7FileName;
    }

    public void setDiagram7FileName(String val) {
        this.diagram7FileName = val;
    }

    public Long getDiagram7Id() {
        if (this.diagram7 != null && this.diagram7.getId() != null)
            return diagram7.getId();
        return this.diagram7Id;
    }

    public void setDiagram7Id(Long id) {
        this.diagram7Id = id;
    }

    public UploadedFile getDiagram8() {
        return this.diagram8;
    }

    public void setDiagram8(UploadedFile diagram8) {
        this.diagram8 = diagram8;
    }

    public String getDiagram8FileName() {
        return this.diagram8FileName;
    }

    public void setDiagram8FileName(String val) {
        this.diagram8FileName = val;
    }

    public Long getDiagram8Id() {
        if (this.diagram8 != null && this.diagram8.getId() != null)
            return diagram8.getId();
        return this.diagram8Id;
    }

    public void setDiagram8Id(Long id) {
        this.diagram8Id = id;
    }

    public UploadedFile getDiagram9() {
        return this.diagram9;
    }

    public void setDiagram9(UploadedFile diagram9) {
        this.diagram9 = diagram9;
    }

    public String getDiagram9FileName() {
        return this.diagram9FileName;
    }

    public void setDiagram9FileName(String val) {
        this.diagram9FileName = val;
    }

    public Long getDiagram9Id() {
        if (this.diagram9 != null && this.diagram9.getId() != null)
            return diagram9.getId();
        return this.diagram9Id;
    }

    public void setDiagram9Id(Long id) {
        this.diagram9Id = id;
    }

    public UploadedFile getDiagram10() {
        return this.diagram10;
    }

    public void setDiagram10(UploadedFile diagram10) {
        this.diagram10 = diagram10;
    }

    public String getDiagram10FileName() {
        return this.diagram10FileName;
    }

    public void setDiagram10FileName(String val) {
        this.diagram10FileName = val;
    }

    public Long getDiagram10Id() {
        if (this.diagram10 != null && this.diagram10.getId() != null)
            return diagram10.getId();
        return this.diagram10Id;
    }

    public void setDiagram10Id(Long id) {
        this.diagram10Id = id;
    }

    public String toString() {
        return new ToStringBuilder(this)
            .append("no", getNo())
            .append("name", getName())
            .append("overview", getOverview())
            .append("specification", getSpecification())
            .append("productType", getProductType())
            .append("logo", getLogo())
            .append("productPhoto1", getProductPhoto1())
            .append("productPhoto2", getProductPhoto2())
            .append("productPhoto3", getProductPhoto3())
            .append("productPhoto4", getProductPhoto4())
            .append("productPhoto5", getProductPhoto5())
            .append("productPhoto6", getProductPhoto6())
            .append("productPhoto7", getProductPhoto7())
            .append("productPhoto8", getProductPhoto8())
            .append("productPhoto9", getProductPhoto9())
            .append("productPhoto10", getProductPhoto10())
            .append("download1", getDownload1())
            .append("download2", getDownload2())
            .append("download3", getDownload3())
            .append("download4", getDownload4())
            .append("download5", getDownload5())
            .append("download6", getDownload6())
            .append("download7", getDownload7())
            .append("download8", getDownload8())
            .append("download9", getDownload9())
            .append("download10", getDownload10())
            .append("diagram1", getDiagram1())
            .append("diagram2", getDiagram2())
            .append("diagram3", getDiagram3())
            .append("diagram4", getDiagram4())
            .append("diagram5", getDiagram5())
            .append("diagram6", getDiagram6())
            .append("diagram7", getDiagram7())
            .append("diagram8", getDiagram8())
            .append("diagram9", getDiagram9())
            .append("diagram10", getDiagram10())
            .toString();
    }

    public String getCaption_() {
        return toString();
    }

}
