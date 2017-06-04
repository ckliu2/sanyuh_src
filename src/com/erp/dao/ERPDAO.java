package com.erp.dao;

import com.erp.value.*;
import java.util.*;
import com.common.dao.CommonDAO;


public interface ERPDAO extends CommonDAO 
{
	
	//ProductType
    public abstract void saveProductType(ProductType val);

    public abstract void removeProductType(ProductType val);

    public abstract void removeProductType(Long id);

    public abstract ProductType findProductTypeById(Long id);

    public abstract List<ProductType> findAllProductType();
    
    //Product
    public abstract void saveProduct(Product val);

    public abstract void removeProduct(Product val);

    public abstract void removeProduct(Long id);

    public abstract Product findProductById(Long id);

    public abstract List<Product> findAllProduct(ProductType type);
}

