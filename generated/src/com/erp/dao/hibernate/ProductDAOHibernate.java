package com.erp.dao.hibernate;

import com.erp.value.Product;
import com.erp.dao.ProductDAO;
import java.util.*;
import org.springframework.orm.ObjectRetrievalFailureException;
import com.common.dao.hibernate.CommonDAOHibernate;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Wed May 24 22:56:29 CST 2017
*/

public class ProductDAOHibernate extends CommonDAOHibernate implements ProductDAO
{

    public ProductDAOHibernate()
    {
    }

    public void saveProduct(Product val)
    {
        getHibernateTemplate().saveOrUpdate(val);
    }

    public void removeProduct(Product val)
    {
        getHibernateTemplate().delete(val);
    }

    public void removeProduct(Long id)
    {
        Product obj = findProductById(id);
        getHibernateTemplate().delete(obj);
    }

    public Product findProductById(Long id)
    {
        if (id == null)
            return null;
        Product obj = (Product)getHibernateTemplate().get(com.erp.value.Product.class, id);
        if (obj == null)
            throw new ObjectRetrievalFailureException(com.erp.value.Product.class, id);
        else
            return obj;
    }

    public List<Product> findAllProduct()
    {
        return getHibernateTemplate().find("from Product");
    }
    public List<ProductType> findProductTypeList()
    {
        return new ArrayList<ProductType>(); // TODO
    }

    public List<UploadedFile> findLogoList()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto1List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto2List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto3List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto4List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto5List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto6List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto7List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto8List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto9List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findProductPhoto10List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload1List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload2List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload3List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload4List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload5List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload6List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload7List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload8List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload9List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDownload10List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram1List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram2List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram3List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram4List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram5List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram6List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram7List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram8List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram9List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

    public List<UploadedFile> findDiagram10List()
    {
        return new ArrayList<UploadedFile>(); // TODO
    }

}

