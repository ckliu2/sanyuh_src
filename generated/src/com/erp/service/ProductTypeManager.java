package com.erp.service;

import com.erp.value.ProductType;
import java.util.*;
import com.common.service.CommonManager;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Fri Jun 02 22:23:01 CST 2017
*/

public interface ProductTypeManager extends CommonManager 
{
    public abstract void saveProductType(ProductType val);

    public abstract void removeProductType(ProductType val);

    public abstract void removeProductType(Long id);

    public abstract ProductType getProductTypeById(Long id);

    public abstract List<ProductType> getProductTypeList();
}

