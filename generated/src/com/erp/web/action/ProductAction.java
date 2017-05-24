package com.erp.web.action;

import com.erp.value.Product;
import com.erp.service.ProductManager;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.util.*;
import com.common.web.action.CommonActionSupport;
import com.base.util.Tools;
import com.base.value.Function;

/**
 WebWork Application Generator V 1.0

    Copyright 2006 Chih-Shyang Chang
    Created Date: Tue May 23 23:36:27 CST 2017
*/

public class ProductAction extends CommonActionSupport
{

    private static final long serialVersionUID = 1L;
    private final Log log;
    private Product product;
    private java.io.File fileLogo;
    private String fileLogoContentType, fileLogoFileName, removeLogo;
    private Long[] photosIds;
    private Long[] downloadsIds;
    private Long[] diagramsIds;
    private Long[] selectedProductIds;

    public ProductAction()
    {
        log = LogFactory.getLog(com.erp.web.action.ProductAction.class);
    }

    public Function getFunction()
    {
        return getGenericManager().getFunctionByKey("PRODUCT");
    }

    public Product getProduct()
    {
        return product;
    }

    public void setProduct(Product val)
    {
        product = val;
    }

    public void setGenericManager(ProductManager m)
    {
        super.setGenericManager(m);
    }

    public ProductManager getGenericManager()
    {
        return (ProductManager) super.getGenericManager();
    }

    public String delete()
    {
        getGenericManager().removeProduct(product.getId());
        return DELETE;
    }

    public String edit()
    {
        if (product == null) {
            product = new Product();
        } else if (product.getId() != null) {
            product = getGenericManager().getProductById(product.getId());
        } else { // TODO
        }
        beanToForm();

        return SUCCESS;
    }

    public String copy()
    {
        if (selectedProductIds != null && selectedProductIds.length > 0) {
            Product obj = getGenericManager().getProductById(selectedProductIds[0]);
            obj.setId(null);
            product = obj;
        }
        beanToForm();

        return SUCCESS;
    }

    public String execute()
    {
        log.info("entering 'execute' method");
        if (getDelete() != null) {
            return delete();
        } else {
            formToBean();
            if (inputValidation(product) == false) 
                return INPUT;
        }
        return SUCCESS;
    }

    public boolean inputValidation(Product val)
    {
        return true;
    }

    public String save()
    {
        log.info("entering 'save' method");
        getGenericManager().saveProduct(product);
        saveFileToLocal(fileLogoFileName, fileLogo, getTextWithArgs("product.uploadLogo.dir"), product.getId());
        return SUCCESS;
    }

    public String list()
    {
        return SUCCESS;
    }

    protected void beanToForm()
    {
        log.info("enter beanToForm()");
        photosIds = getGenericManager().getIdsFromUploadedFileList(product.getPhotos());
        downloadsIds = getGenericManager().getIdsFromUploadedFileList(product.getDownloads());
        diagramsIds = getGenericManager().getIdsFromUploadedFileList(product.getDiagrams());
        log.info("exit beanToForm()");
    }

    protected void formToBean()
    {
        log.info("enter formToBean()");
        product.setProductType(getGenericManager().getProductTypeById(product.getProductTypeId())); 
        if (getRemoveLogo() != null && getRemoveLogo().length() > 0) {
            product.setLogo(computeUploadedFile(fileLogoFileName, fileLogo)); 
            removeUploadedFile(getTextWithArgs("product.uploadLogo.dir"), product.getLogoId(), product.getLogoFileName());
        } else {
            if (product.getLogoId() != null)
                product.setLogo(getGenericManager().getUploadedFileById(product.getLogoId())); 
            else
                product.setLogo(computeUploadedFile(fileLogoFileName, fileLogo)); 
        }
        product.setPhotos(getGenericManager().getUploadedFileListByIds(photosIds)); 
        product.setDownloads(getGenericManager().getUploadedFileListByIds(downloadsIds)); 
        product.setDiagrams(getGenericManager().getUploadedFileListByIds(diagramsIds)); 
        log.info("exit formToBean()");
    }
    public List<ProductType> getProductTypeList()
    {
        return getGenericManager().getProductTypeList(); // TODO
    }

    public void setFileLogo(java.io.File val)
    {
        fileLogo = val;
    }

    public java.io.File getFileLogo()
    {
        return fileLogo;
    }

    public void setFileLogoContentType(String val)
    {
        fileLogoContentType = val;
    }

    public String getFileLogoContentType()
    {
        return fileLogoContentType;
    }

    public void setFileLogoFileName(String val)
    {
        fileLogoFileName = val;
    }

    public String getFileLogoFileName()
    {
        return fileLogoFileName;
    }

    public void setRemoveLogo(String val)
    {
        removeLogo = val;
    }

    public String getRemoveLogo()
    {
        return removeLogo;
    }

    public List<Set> getPhotosList()
    {
        return getGenericManager().getPhotosList(); // TODO
    }

    public void setPhotosIds(Long[] val)
    {
        photosIds = val;
    }

    public Long[] getPhotosIds()
    {
        return photosIds;
    }

    public List<Set> getDownloadsList()
    {
        return getGenericManager().getDownloadsList(); // TODO
    }

    public void setDownloadsIds(Long[] val)
    {
        downloadsIds = val;
    }

    public Long[] getDownloadsIds()
    {
        return downloadsIds;
    }

    public List<Set> getDiagramsList()
    {
        return getGenericManager().getDiagramsList(); // TODO
    }

    public void setDiagramsIds(Long[] val)
    {
        diagramsIds = val;
    }

    public Long[] getDiagramsIds()
    {
        return diagramsIds;
    }

    public List<Product> getProductList()
    {
        return getGenericManager().getProductList();
    }

    public void setSelectedProductIds(Long[] val)
    {
        selectedProductIds = val;
    }

    public Long[] getSelectedProductIds()
    {
        return selectedProductIds;
    }
}
