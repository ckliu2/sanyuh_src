package com.erp.service;

import com.erp.value.*;
import java.util.*;
import com.common.service.CommonManager;



public interface ERPManager extends CommonManager 
{
	//ProductType
    public abstract void saveProductType(ProductType val);

    public abstract void removeProductType(ProductType val);

    public abstract void removeProductType(Long id);

    public abstract ProductType getProductTypeById(Long id);

    public abstract List<ProductType> getProductTypeList();
    
    //Product
    public abstract void saveProduct(Product val);

    public abstract void removeProduct(Product val);

    public abstract void removeProduct(Long id);

    public abstract Product getProductById(Long id);

    public abstract List<Product> getProductList();
}

