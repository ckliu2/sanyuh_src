<%@ include file="/common/taglibs.jsp"%>

<table border="0" cellspacing="1" class="cContentTable">
      <tr>
        <td class="cContentTitle" ><fmt:message key="product.list"/></td>
      </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editProduct.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
            &nbsp;&nbsp;&nbsp;&nbsp;<button onclick="myCheckSubmitCopy('form1', <ww:property value="productList.size()"/>, 'selectedProductId', 'copyProduct.html', '<fmt:message key="common.mustSelectOne"/>', '<fmt:message key="common.mustSelectOnlyOne"/>')" class="cButton"><fmt:message key="common.copy"/></button>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editProduct.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
      <tr>
        <td>
<c:set var="count" value="0" />
<display:table name="productList" class="list" cellspacing="1" requestURI="" id="row" export="false" pagesize="${GLOBAL_pagesize}" sort="list">
    <display:setProperty name="paging.banner.placement" value="bottom" />
    <display:column titleKey="common.select">
        <input type="checkbox" id="selectedProductId_<c:out value="${count}"/>" name="selectedProductId" value="<c:out value="${row.id}"/>">
    </display:column>
    <display:column property="no" sortable="true" titleKey="product.no" style="text-align:left" />
    <display:column property="name" sortable="true" titleKey="product.name" style="text-align:left" />
    <display:column property="overview" sortable="true" titleKey="product.overview" style="text-align:left" />
    <display:column property="specification" sortable="true" titleKey="product.specification" style="text-align:left" />
    <display:column property="productType.caption_" sortable="true" titleKey="product.productType" style="text-align:left"/>
    <display:column property="logo.caption_" sortable="true" titleKey="product.logo" style="text-align:left"/>
    <display:column property="productPhoto1.caption_" sortable="true" titleKey="product.productPhoto1" style="text-align:left"/>
    <display:column property="productPhoto2.caption_" sortable="true" titleKey="product.productPhoto2" style="text-align:left"/>
    <display:column property="productPhoto3.caption_" sortable="true" titleKey="product.productPhoto3" style="text-align:left"/>
    <display:column property="productPhoto4.caption_" sortable="true" titleKey="product.productPhoto4" style="text-align:left"/>
    <display:column property="productPhoto5.caption_" sortable="true" titleKey="product.productPhoto5" style="text-align:left"/>
    <display:column property="productPhoto6.caption_" sortable="true" titleKey="product.productPhoto6" style="text-align:left"/>
    <display:column property="productPhoto7.caption_" sortable="true" titleKey="product.productPhoto7" style="text-align:left"/>
    <display:column property="productPhoto8.caption_" sortable="true" titleKey="product.productPhoto8" style="text-align:left"/>
    <display:column property="productPhoto9.caption_" sortable="true" titleKey="product.productPhoto9" style="text-align:left"/>
    <display:column property="productPhoto10.caption_" sortable="true" titleKey="product.productPhoto10" style="text-align:left"/>
    <display:column property="download1.caption_" sortable="true" titleKey="product.download1" style="text-align:left"/>
    <display:column property="download2.caption_" sortable="true" titleKey="product.download2" style="text-align:left"/>
    <display:column property="download3.caption_" sortable="true" titleKey="product.download3" style="text-align:left"/>
    <display:column property="download4.caption_" sortable="true" titleKey="product.download4" style="text-align:left"/>
    <display:column property="download5.caption_" sortable="true" titleKey="product.download5" style="text-align:left"/>
    <display:column property="download6.caption_" sortable="true" titleKey="product.download6" style="text-align:left"/>
    <display:column property="download7.caption_" sortable="true" titleKey="product.download7" style="text-align:left"/>
    <display:column property="download8.caption_" sortable="true" titleKey="product.download8" style="text-align:left"/>
    <display:column property="download9.caption_" sortable="true" titleKey="product.download9" style="text-align:left"/>
    <display:column property="download10.caption_" sortable="true" titleKey="product.download10" style="text-align:left"/>
    <display:column property="diagram1.caption_" sortable="true" titleKey="product.diagram1" style="text-align:left"/>
    <display:column property="diagram2.caption_" sortable="true" titleKey="product.diagram2" style="text-align:left"/>
    <display:column property="diagram3.caption_" sortable="true" titleKey="product.diagram3" style="text-align:left"/>
    <display:column property="diagram4.caption_" sortable="true" titleKey="product.diagram4" style="text-align:left"/>
    <display:column property="diagram5.caption_" sortable="true" titleKey="product.diagram5" style="text-align:left"/>
    <display:column property="diagram6.caption_" sortable="true" titleKey="product.diagram6" style="text-align:left"/>
    <display:column property="diagram7.caption_" sortable="true" titleKey="product.diagram7" style="text-align:left"/>
    <display:column property="diagram8.caption_" sortable="true" titleKey="product.diagram8" style="text-align:left"/>
    <display:column property="diagram9.caption_" sortable="true" titleKey="product.diagram9" style="text-align:left"/>
    <display:column property="diagram10.caption_" sortable="true" titleKey="product.diagram10" style="text-align:left"/>
    <display:column titleKey="common.action">
        <ww:if test="recordEditable == true">
            <a href="editProduct.html?product.id=<c:out value="${row.id}"/>"><fmt:message key="common.edit"/></a>&nbsp;&nbsp;
            <a href="#" onClick="javascript:return myConfirm('<fmt:message key="common.confirmDelete1"/><c:out value="${row.caption_}" /><fmt:message key="common.confirmDelete2"/>', 'form1', 'product.id', '${row.id}')"><fmt:message key="common.delete"/></a>
        </ww:if>
        <ww:else>
           <a href="editProduct.html?product.id=<c:out value="${row.id}"/>"><fmt:message key="common.view"/></a>&nbsp;&nbsp;
        </ww:else>
    </display:column>
    <c:set var="count" value="${count+1}" />
</display:table>
        </td>
    </tr>
      <tr class="cActionButtonLine">
        <td>
        <ww:if test="recordEditable == true">
            <button onclick="location.href='editProduct.html'" class="cButton"><fmt:message key="common.new"/></button>
            <ww:if test="functionOpenPeriodMessage != null">
                <span class="cLabel2">(<fmt:message key="common.function.openPeriod"/>: <ww:property value="functionOpenPeriodMessage"/>)</span>
            </ww:if>
            &nbsp;&nbsp;&nbsp;&nbsp;<button onclick="myCheckSubmitCopy('form1', <ww:property value="productList.size()"/>, 'selectedProductId', 'copyProduct.html', '<fmt:message key="common.mustSelectOne"/>', '<fmt:message key="common.mustSelectOnlyOne"/>')" class="cButton"><fmt:message key="common.copy"/></button>
        </ww:if>
        <ww:else>
            <button onclick="location.href='editProduct.html'" DISABLED class="cButton"><fmt:message key="common.new"/></button><span class="cLabel2">(<fmt:message key="common.function.openPeriodExceed"/> )</span>
        </ww:else>
        </td>
      </tr>
</table>
<form name="form1" action="saveProduct.html">
    <input type="hidden" name="delete" value="yes">
    <input type="hidden" name="product.id" value="">
    <select name="selectedProductIds" multiple="true" style="display:none"></select>
</form>
