package com.erp.web.action;

import com.erp.value.*;
import com.erp.service.ERPManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.*;
import com.common.web.action.CommonActionSupport;
import com.base.util.Tools;
import com.base.value.Function;



public class IndexAction extends CommonActionSupport
{

    private static final long serialVersionUID = 1L;
    private final Log log;
    private ProductType productType;
	Product product;    
	String keyword;
	Web web;

    public IndexAction()
    {
        log = LogFactory.getLog(com.erp.web.action.IndexAction.class);
    }

    public Function getFunction()
    {
        return getGenericManager().getFunctionByKey("PRODUCTTYPE");
    }

    public ProductType getProductType()
    {
        return productType;
    }

    public void setProductType(ProductType val)
    {
        productType = val;
    }
    
    public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	
	public Web getWeb() {
		return web;
	}

	public void setWeb(Web web) {
		this.web = web;
	}
	
    public void setGenericManager(ERPManager m)
    {
        super.setGenericManager(m);
    }

    public ERPManager getGenericManager()
    {
        return (ERPManager) super.getGenericManager();
    }
   
    public String list()
    {
        return SUCCESS;
    }

    public List<ProductType> getProductTypeList()
    {
    	System.out.println("getProductTypeList");
        return getGenericManager().getProductTypeList();
    }
    
    public ProductType getProductTypeById()
    {    	
        return getGenericManager().getProductTypeById(productType.getId());
    }
    
    public List<Product> getProductClassByCategory()
    {    	
    	productType=getProductTypeById();
        return getGenericManager().getProductList(productType);
    }
    
    public Product getProductById()
    {    	    
    	product=getGenericManager().getProductById(product.getId());
    	System.out.println("getProductById product.Overview="+product.getOverview());
        return product;
    }
    
    public List<Product> getProductSearch()
    {    	    	
    	System.out.println("getProductSearch keyword="+keyword);
        return getGenericManager().getProductList(keyword);
    }
    
    public List<Carousel> getCarouselList()
    {
        return getGenericManager().getCarouselList();
    }
   
    public Web getWebById(Long id)
    {
    	System.out.println("getWebById id="+id);
    	//System.out.println("getWebById web.id="+web.getId());
        return getGenericManager().getWebById(id);
    }
}
