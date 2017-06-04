package com.erp.dao.hibernate;

import com.erp.value.*;
import com.erp.dao.ERPDAO;
import java.util.*;

import org.hibernate.Criteria;
import org.hibernate.FetchMode;
import org.hibernate.Query;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Disjunction;
import org.hibernate.criterion.Expression;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.orm.ObjectRetrievalFailureException;
import com.common.dao.hibernate.CommonDAOHibernate;

public class ERPDAOHibernate extends CommonDAOHibernate implements ERPDAO
{

    public ERPDAOHibernate()
    {
    }

    //ProductType
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
        return getHibernateTemplate().find("from ProductType order by seqNo asc");
    }
    
    //Product
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

    public List<Product> findAllProduct(ProductType type)
    {
    	Criteria c = getHibernateSession().createCriteria(Product.class);			
		if (type != null) {
			c.add(Expression.eq("productType", type));
		}
		c.addOrder(Order.asc("no"));
		return c.list();
    }
}

