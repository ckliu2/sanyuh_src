package com.erp.dao.hibernate;

import com.erp.value.Product;
import com.erp.dao.ProductDAO;
import java.util.*;
import org.springframework.orm.ObjectRetrievalFailureException;
import com.common.dao.hibernate.CommonDAOHibernate;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
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

    public Long[] getIdsFromUploadedFileList(List tlist)
    {
        ArrayList<Long> al = new ArrayList<Long>();
        if (tlist != null) {
            for (int i = 0; i < tlist.size(); i++) {
                UploadedFile t = (UploadedFile) tlist.get(i);
                if (t != null)
                    al.add(t.getId());
            }
        }
        Long lng[] = new Long[al.size()];
        al.toArray(lng);
        
        return lng;
    }

    public List getUploadedFileListByIds(Long[] ids)
    {
        ArrayList<UploadedFile> al = new ArrayList<UploadedFile>();
        if (ids != null) {
            for (int i = 0; i < ids.length; i++) {
                UploadedFile t = (UploadedFile) findUploadedFileById(ids[i]);
                if (t != null)
                    al.add(t);
            }
        }
        return al;
    }
    public Long[] getIdsFromUploadedFileList(List tlist)
    {
        ArrayList<Long> al = new ArrayList<Long>();
        if (tlist != null) {
            for (int i = 0; i < tlist.size(); i++) {
                UploadedFile t = (UploadedFile) tlist.get(i);
                if (t != null)
                    al.add(t.getId());
            }
        }
        Long lng[] = new Long[al.size()];
        al.toArray(lng);
        
        return lng;
    }

    public List getUploadedFileListByIds(Long[] ids)
    {
        ArrayList<UploadedFile> al = new ArrayList<UploadedFile>();
        if (ids != null) {
            for (int i = 0; i < ids.length; i++) {
                UploadedFile t = (UploadedFile) findUploadedFileById(ids[i]);
                if (t != null)
                    al.add(t);
            }
        }
        return al;
    }
    public Long[] getIdsFromUploadedFileList(List tlist)
    {
        ArrayList<Long> al = new ArrayList<Long>();
        if (tlist != null) {
            for (int i = 0; i < tlist.size(); i++) {
                UploadedFile t = (UploadedFile) tlist.get(i);
                if (t != null)
                    al.add(t.getId());
            }
        }
        Long lng[] = new Long[al.size()];
        al.toArray(lng);
        
        return lng;
    }

    public List getUploadedFileListByIds(Long[] ids)
    {
        ArrayList<UploadedFile> al = new ArrayList<UploadedFile>();
        if (ids != null) {
            for (int i = 0; i < ids.length; i++) {
                UploadedFile t = (UploadedFile) findUploadedFileById(ids[i]);
                if (t != null)
                    al.add(t);
            }
        }
        return al;
    }
}

