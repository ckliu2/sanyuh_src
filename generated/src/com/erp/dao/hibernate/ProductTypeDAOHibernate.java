package com.erp.dao.hibernate;

import com.erp.value.ProductType;
import com.erp.dao.ProductTypeDAO;
import java.util.*;
import org.springframework.orm.ObjectRetrievalFailureException;
import com.common.dao.hibernate.CommonDAOHibernate;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
*/

public class ProductTypeDAOHibernate extends CommonDAOHibernate implements ProductTypeDAO
{

    public ProductTypeDAOHibernate()
    {
    }

    public void saveProductType(ProductType val)
    {
        getHibernateTemplate().saveOrUpdate(val);
    }

    public void removeProductType(ProductType val)
    {
        getHibernateTemplate().delete(val);
    }

    public void removeProductType(Long id)
    {
        ProductType obj = findProductTypeById(id);
        getHibernateTemplate().delete(obj);
    }

    public ProductType findProductTypeById(Long id)
    {
        if (id == null)
            return null;
        ProductType obj = (ProductType)getHibernateTemplate().get(com.erp.value.ProductType.class, id);
        if (obj == null)
            throw new ObjectRetrievalFailureException(com.erp.value.ProductType.class, id);
        else
            return obj;
    }

    public List<ProductType> findAllProductType()
    {
        return getHibernateTemplate().find("from ProductType");
    }
}

