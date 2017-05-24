package com.erp.service;

import com.erp.value.Product;
import java.util.*;
import com.common.service.CommonManager;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
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
    public abstract Long[] getIdsFromUploadedFileList(List<UploadedFile> lst);

    public abstract List<UploadedFile> getUploadedFileListByIds(Long[] ids);

    public abstract Long[] getIdsFromUploadedFileList(List<UploadedFile> lst);

    public abstract List<UploadedFile> getUploadedFileListByIds(Long[] ids);

    public abstract Long[] getIdsFromUploadedFileList(List<UploadedFile> lst);

    public abstract List<UploadedFile> getUploadedFileListByIds(Long[] ids);

}

