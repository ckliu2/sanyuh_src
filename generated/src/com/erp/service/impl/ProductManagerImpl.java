package com.erp.service.impl;

import com.erp.service.ProductManager;
import com.erp.dao.ProductDAO;
import com.erp.value.Product;
import java.util.*;
import com.common.service.impl.CommonManagerImpl;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
*/

public class ProductManagerImpl extends CommonManagerImpl implements ProductManager
{

    public ProductManagerImpl()
    {
    }

    public ProductDAO getGenericDAO()
    {
        return (ProductDAO)super.getGenericDAO();
    }

    public void setGenericDAO(ProductDAO dao)
    {
        super.setGenericDAO(dao);
    }

    public void saveProduct(Product val)
    {
        getGenericDAO().saveProduct(val);
    }

    public void removeProduct(Product val)
    {
        getGenericDAO().removeProduct(val);
    }

    public void removeProduct(Long id)
    {
        getGenericDAO().removeProduct(id);
    }

    public Product getProductById(Long id)
    {
         return getGenericDAO().findProductById(id);
    }

    public List<Product> getProductList()
    {
        return getGenericDAO().findAllProduct();
    }
    public List<ProductType> getProductTypeList()
    {
        return getGenericDAO().findProductTypeList();
    }

    public List<UploadedFile> getLogoList()
    {
        return getGenericDAO().findLogoList();
    }

    public Long[] getIdsFromUploadedFileList(List<UploadedFile> lst)
    {
        return getGenericDAO().getIdsFromUploadedFileList(lst);
    }

    public List<UploadedFile> getUploadedFileListByIds(Long[] ids)
    {
        return getGenericDAO().getUploadedFileListByIds(ids);
    }

    public Long[] getIdsFromUploadedFileList(List<UploadedFile> lst)
    {
        return getGenericDAO().getIdsFromUploadedFileList(lst);
    }

    public List<UploadedFile> getUploadedFileListByIds(Long[] ids)
    {
        return getGenericDAO().getUploadedFileListByIds(ids);
    }

    public Long[] getIdsFromUploadedFileList(List<UploadedFile> lst)
    {
        return getGenericDAO().getIdsFromUploadedFileList(lst);
    }

    public List<UploadedFile> getUploadedFileListByIds(Long[] ids)
    {
        return getGenericDAO().getUploadedFileListByIds(ids);
    }

}

