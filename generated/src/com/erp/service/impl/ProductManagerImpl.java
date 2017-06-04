package com.erp.service.impl;

import com.erp.service.ProductManager;
import com.erp.dao.ProductDAO;
import com.erp.value.Product;
import java.util.*;
import com.common.service.impl.CommonManagerImpl;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Fri Jun 02 22:23:01 CST 2017
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

    public List<UploadedFile> getLogo1List()
    {
        return getGenericDAO().findLogo1List();
    }

    public List<UploadedFile> getLogo2List()
    {
        return getGenericDAO().findLogo2List();
    }

    public List<UploadedFile> getLogo3List()
    {
        return getGenericDAO().findLogo3List();
    }

    public List<UploadedFile> getLogo4List()
    {
        return getGenericDAO().findLogo4List();
    }

    public List<UploadedFile> getLogo5List()
    {
        return getGenericDAO().findLogo5List();
    }

    public List<UploadedFile> getLogo6List()
    {
        return getGenericDAO().findLogo6List();
    }

    public List<UploadedFile> getLogo7List()
    {
        return getGenericDAO().findLogo7List();
    }

    public List<UploadedFile> getLogo8List()
    {
        return getGenericDAO().findLogo8List();
    }

    public List<UploadedFile> getLogo9List()
    {
        return getGenericDAO().findLogo9List();
    }

    public List<UploadedFile> getLogo10List()
    {
        return getGenericDAO().findLogo10List();
    }

    public List<UploadedFile> getProductPhoto1List()
    {
        return getGenericDAO().findProductPhoto1List();
    }

    public List<UploadedFile> getProductPhoto2List()
    {
        return getGenericDAO().findProductPhoto2List();
    }

    public List<UploadedFile> getProductPhoto3List()
    {
        return getGenericDAO().findProductPhoto3List();
    }

    public List<UploadedFile> getProductPhoto4List()
    {
        return getGenericDAO().findProductPhoto4List();
    }

    public List<UploadedFile> getProductPhoto5List()
    {
        return getGenericDAO().findProductPhoto5List();
    }

    public List<UploadedFile> getProductPhoto6List()
    {
        return getGenericDAO().findProductPhoto6List();
    }

    public List<UploadedFile> getProductPhoto7List()
    {
        return getGenericDAO().findProductPhoto7List();
    }

    public List<UploadedFile> getProductPhoto8List()
    {
        return getGenericDAO().findProductPhoto8List();
    }

    public List<UploadedFile> getProductPhoto9List()
    {
        return getGenericDAO().findProductPhoto9List();
    }

    public List<UploadedFile> getProductPhoto10List()
    {
        return getGenericDAO().findProductPhoto10List();
    }

    public List<UploadedFile> getDownload1List()
    {
        return getGenericDAO().findDownload1List();
    }

    public List<UploadedFile> getDownload2List()
    {
        return getGenericDAO().findDownload2List();
    }

    public List<UploadedFile> getDownload3List()
    {
        return getGenericDAO().findDownload3List();
    }

    public List<UploadedFile> getDownload4List()
    {
        return getGenericDAO().findDownload4List();
    }

    public List<UploadedFile> getDownload5List()
    {
        return getGenericDAO().findDownload5List();
    }

    public List<UploadedFile> getDownload6List()
    {
        return getGenericDAO().findDownload6List();
    }

    public List<UploadedFile> getDownload7List()
    {
        return getGenericDAO().findDownload7List();
    }

    public List<UploadedFile> getDownload8List()
    {
        return getGenericDAO().findDownload8List();
    }

    public List<UploadedFile> getDownload9List()
    {
        return getGenericDAO().findDownload9List();
    }

    public List<UploadedFile> getDownload10List()
    {
        return getGenericDAO().findDownload10List();
    }

    public List<UploadedFile> getDiagram1List()
    {
        return getGenericDAO().findDiagram1List();
    }

    public List<UploadedFile> getDiagram2List()
    {
        return getGenericDAO().findDiagram2List();
    }

    public List<UploadedFile> getDiagram3List()
    {
        return getGenericDAO().findDiagram3List();
    }

    public List<UploadedFile> getDiagram4List()
    {
        return getGenericDAO().findDiagram4List();
    }

    public List<UploadedFile> getDiagram5List()
    {
        return getGenericDAO().findDiagram5List();
    }

    public List<UploadedFile> getDiagram6List()
    {
        return getGenericDAO().findDiagram6List();
    }

    public List<UploadedFile> getDiagram7List()
    {
        return getGenericDAO().findDiagram7List();
    }

    public List<UploadedFile> getDiagram8List()
    {
        return getGenericDAO().findDiagram8List();
    }

    public List<UploadedFile> getDiagram9List()
    {
        return getGenericDAO().findDiagram9List();
    }

    public List<UploadedFile> getDiagram10List()
    {
        return getGenericDAO().findDiagram10List();
    }

}

