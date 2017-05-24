package com.erp.service.impl;

import com.erp.service.ProductTypeManager;
import com.erp.dao.ProductTypeDAO;
import com.erp.value.ProductType;
import java.util.*;
import com.common.service.impl.CommonManagerImpl;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
*/

public class ProductTypeManagerImpl extends CommonManagerImpl implements ProductTypeManager
{

    public ProductTypeManagerImpl()
    {
    }

    public ProductTypeDAO getGenericDAO()
    {
        return (ProductTypeDAO)super.getGenericDAO();
    }

    public void setGenericDAO(ProductTypeDAO dao)
    {
        super.setGenericDAO(dao);
    }

    public void saveProductType(ProductType val)
    {
        getGenericDAO().saveProductType(val);
    }

    public void removeProductType(ProductType val)
    {
        getGenericDAO().removeProductType(val);
    }

    public void removeProductType(Long id)
    {
        getGenericDAO().removeProductType(id);
    }

    public ProductType getProductTypeById(Long id)
    {
         return getGenericDAO().findProductTypeById(id);
    }

    public List<ProductType> getProductTypeList()
    {
        return getGenericDAO().findAllProductType();
    }
}

