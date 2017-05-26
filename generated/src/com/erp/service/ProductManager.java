package com.erp.service;

import com.erp.value.Product;
import java.util.*;
import com.common.service.CommonManager;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Wed May 24 22:56:29 CST 2017
*/

public interface ProductManager extends CommonManager 
{
    public abstract void saveProduct(Product val);

    public abstract void removeProduct(Product val);

    public abstract void removeProduct(Long id);

    public abstract Product getProductById(Long id);

    public abstract List<Product> getProductList();
    public abstract List<ProductType> getProductTypeList();
    public abstract List<UploadedFile> getLogoList();
    public abstract List<UploadedFile> getProductPhoto1List();
    public abstract List<UploadedFile> getProductPhoto2List();
    public abstract List<UploadedFile> getProductPhoto3List();
    public abstract List<UploadedFile> getProductPhoto4List();
    public abstract List<UploadedFile> getProductPhoto5List();
    public abstract List<UploadedFile> getProductPhoto6List();
    public abstract List<UploadedFile> getProductPhoto7List();
    public abstract List<UploadedFile> getProductPhoto8List();
    public abstract List<UploadedFile> getProductPhoto9List();
    public abstract List<UploadedFile> getProductPhoto10List();
    public abstract List<UploadedFile> getDownload1List();
    public abstract List<UploadedFile> getDownload2List();
    public abstract List<UploadedFile> getDownload3List();
    public abstract List<UploadedFile> getDownload4List();
    public abstract List<UploadedFile> getDownload5List();
    public abstract List<UploadedFile> getDownload6List();
    public abstract List<UploadedFile> getDownload7List();
    public abstract List<UploadedFile> getDownload8List();
    public abstract List<UploadedFile> getDownload9List();
    public abstract List<UploadedFile> getDownload10List();
    public abstract List<UploadedFile> getDiagram1List();
    public abstract List<UploadedFile> getDiagram2List();
    public abstract List<UploadedFile> getDiagram3List();
    public abstract List<UploadedFile> getDiagram4List();
    public abstract List<UploadedFile> getDiagram5List();
    public abstract List<UploadedFile> getDiagram6List();
    public abstract List<UploadedFile> getDiagram7List();
    public abstract List<UploadedFile> getDiagram8List();
    public abstract List<UploadedFile> getDiagram9List();
    public abstract List<UploadedFile> getDiagram10List();
}

