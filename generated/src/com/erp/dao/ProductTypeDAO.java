package com.erp.dao;

import com.erp.value.ProductType;
import java.util.*;
import com.common.dao.CommonDAO;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
*/

public interface ProductTypeDAO extends CommonDAO 
{
    public abstract void saveProductType(ProductType val);

    public abstract void removeProductType(ProductType val);

    public abstract void removeProductType(Long id);

    public abstract ProductType findProductTypeById(Long id);

    public abstract List<ProductType> findAllProductType();
}

