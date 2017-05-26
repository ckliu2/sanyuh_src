package com.erp.dao;

import com.erp.value.Product;
import java.util.*;
import com.common.dao.CommonDAO;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Wed May 24 22:56:29 CST 2017
*/

public interface ProductDAO extends CommonDAO 
{
    public abstract void saveProduct(Product val);

    public abstract void removeProduct(Product val);

    public abstract void removeProduct(Long id);

    public abstract Product findProductById(Long id);

    public abstract List<Product> findAllProduct();
    public abstract List<ProductType> findProductTypeList();
    public abstract List<UploadedFile> findLogoList();
    public abstract List<UploadedFile> findProductPhoto1List();
    public abstract List<UploadedFile> findProductPhoto2List();
    public abstract List<UploadedFile> findProductPhoto3List();
    public abstract List<UploadedFile> findProductPhoto4List();
    public abstract List<UploadedFile> findProductPhoto5List();
    public abstract List<UploadedFile> findProductPhoto6List();
    public abstract List<UploadedFile> findProductPhoto7List();
    public abstract List<UploadedFile> findProductPhoto8List();
    public abstract List<UploadedFile> findProductPhoto9List();
    public abstract List<UploadedFile> findProductPhoto10List();
    public abstract List<UploadedFile> findDownload1List();
    public abstract List<UploadedFile> findDownload2List();
    public abstract List<UploadedFile> findDownload3List();
    public abstract List<UploadedFile> findDownload4List();
    public abstract List<UploadedFile> findDownload5List();
    public abstract List<UploadedFile> findDownload6List();
    public abstract List<UploadedFile> findDownload7List();
    public abstract List<UploadedFile> findDownload8List();
    public abstract List<UploadedFile> findDownload9List();
    public abstract List<UploadedFile> findDownload10List();
    public abstract List<UploadedFile> findDiagram1List();
    public abstract List<UploadedFile> findDiagram2List();
    public abstract List<UploadedFile> findDiagram3List();
    public abstract List<UploadedFile> findDiagram4List();
    public abstract List<UploadedFile> findDiagram5List();
    public abstract List<UploadedFile> findDiagram6List();
    public abstract List<UploadedFile> findDiagram7List();
    public abstract List<UploadedFile> findDiagram8List();
    public abstract List<UploadedFile> findDiagram9List();
    public abstract List<UploadedFile> findDiagram10List();
}

