package com.erp.service.impl;

import com.erp.service.ERPManager;
import com.erp.dao.ERPDAO;
import com.erp.value.*;
import java.util.*;
import com.common.service.impl.CommonManagerImpl;


public class ERPManagerImpl extends CommonManagerImpl implements ERPManager
{

    public ERPManagerImpl()
    {
    }

    public ERPDAO getGenericDAO()
    {
        return (ERPDAO)super.getGenericDAO();
    }

    public void setGenericDAO(ERPDAO dao)
    {
        super.setGenericDAO(dao);
    }

    
    //ProductType
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
    
    //Product
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

    public List<Product> getProductList(ProductType type)
    {
        return getGenericDAO().findAllProduct(type);
    }
}

