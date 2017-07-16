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
    <display:column property="description" sortable="true" titleKey="product.description" style="text-align:left" />
    <display:column property="overview" sortable="true" titleKey="product.overview" style="text-align:left" />
    <display:column property="specification" sortable="true" titleKey="product.specification" style="text-align:left" />
    <display:column property="seqNo" sortable="true" titleKey="product.seqNo" />
    <display:column property="link1" sortable="true" titleKey="product.link1" style="text-align:left" />
    <display:column property="linkName1" sortable="true" titleKey="product.linkName1" style="text-align:left" />
    <display:column property="link2" sortable="true" titleKey="product.link2" style="text-align:left" />
    <display:column property="linkName2" sortable="true" titleKey="product.linkName2" style="text-align:left" />
    <display:column property="link3" sortable="true" titleKey="product.link3" style="text-align:left" />
    <display:column property="linkName3" sortable="true" titleKey="product.linkName3" style="text-align:left" />
    <display:column property="link4" sortable="true" titleKey="product.link4" style="text-align:left" />
    <display:column property="linkName4" sortable="true" titleKey="product.linkName4" style="text-align:left" />
    <display:column property="link5" sortable="true" titleKey="product.link5" style="text-align:left" />
    <display:column property="linkName5" sortable="true" titleKey="product.linkName5" style="text-align:left" />
    <display:column property="link6" sortable="true" titleKey="product.link6" style="text-align:left" />
    <display:column property="linkName6" sortable="true" titleKey="product.linkName6" style="text-align:left" />
    <display:column property="link7" sortable="true" titleKey="product.link7" style="text-align:left" />
    <display:column property="linkName7" sortable="true" titleKey="product.linkName7" style="text-align:left" />
    <display:column property="link8" sortable="true" titleKey="product.link8" style="text-align:left" />
    <display:column property="linkName8" sortable="true" titleKey="product.linkName8" style="text-align:left" />
    <display:column property="link9" sortable="true" titleKey="product.link9" style="text-align:left" />
    <display:column property="linkName9" sortable="true" titleKey="product.linkName9" style="text-align:left" />
    <display:column property="link10" sortable="true" titleKey="product.link10" style="text-align:left" />
    <display:column property="linkName10" sortable="true" titleKey="product.linkName10" style="text-align:left" />
    <display:column property="link11" sortable="true" titleKey="product.link11" style="text-align:left" />
    <display:column property="linkName11" sortable="true" titleKey="product.linkName11" style="text-align:left" />
    <display:column property="link12" sortable="true" titleKey="product.link12" style="text-align:left" />
    <display:column property="linkName12" sortable="true" titleKey="product.linkName12" style="text-align:left" />
    <display:column property="link13" sortable="true" titleKey="product.link13" style="text-align:left" />
    <display:column property="linkName13" sortable="true" titleKey="product.linkName13" style="text-align:left" />
    <display:column property="link14" sortable="true" titleKey="product.link14" style="text-align:left" />
    <display:column property="linkName14" sortable="true" titleKey="product.linkName14" style="text-align:left" />
    <display:column property="link15" sortable="true" titleKey="product.link15" style="text-align:left" />
    <display:column property="linkName15" sortable="true" titleKey="product.linkName15" style="text-align:left" />
    <display:column property="link16" sortable="true" titleKey="product.link16" style="text-align:left" />
    <display:column property="linkName16" sortable="true" titleKey="product.linkName16" style="text-align:left" />
    <display:column property="link17" sortable="true" titleKey="product.link17" style="text-align:left" />
    <display:column property="linkName17" sortable="true" titleKey="product.linkName17" style="text-align:left" />
    <display:column property="link18" sortable="true" titleKey="product.link18" style="text-align:left" />
    <display:column property="linkName18" sortable="true" titleKey="product.linkName18" style="text-align:left" />
    <display:column property="link19" sortable="true" titleKey="product.link19" style="text-align:left" />
    <display:column property="linkName19" sortable="true" titleKey="product.linkName19" style="text-align:left" />
    <display:column property="link20" sortable="true" titleKey="product.link20" style="text-align:left" />
    <display:column property="linkName20" sortable="true" titleKey="product.linkName20" style="text-align:left" />
    <display:column property="link21" sortable="true" titleKey="product.link21" style="text-align:left" />
    <display:column property="linkName21" sortable="true" titleKey="product.linkName21" style="text-align:left" />
    <display:column property="link22" sortable="true" titleKey="product.link22" style="text-align:left" />
    <display:column property="linkName22" sortable="true" titleKey="product.linkName22" style="text-align:left" />
    <display:column property="link23" sortable="true" titleKey="product.link23" style="text-align:left" />
    <display:column property="linkName23" sortable="true" titleKey="product.linkName23" style="text-align:left" />
    <display:column property="link24" sortable="true" titleKey="product.link24" style="text-align:left" />
    <display:column property="linkName24" sortable="true" titleKey="product.linkName24" style="text-align:left" />
    <display:column property="link25" sortable="true" titleKey="product.link25" style="text-align:left" />
    <display:column property="linkName25" sortable="true" titleKey="product.linkName25" style="text-align:left" />
    <display:column property="link26" sortable="true" titleKey="product.link26" style="text-align:left" />
    <display:column property="linkName26" sortable="true" titleKey="product.linkName26" style="text-align:left" />
    <display:column property="link27" sortable="true" titleKey="product.link27" style="text-align:left" />
    <display:column property="linkName27" sortable="true" titleKey="product.linkName27" style="text-align:left" />
    <display:column property="link28" sortable="true" titleKey="product.link28" style="text-align:left" />
    <display:column property="linkName28" sortable="true" titleKey="product.linkName28" style="text-align:left" />
    <display:column property="link29" sortable="true" titleKey="product.link29" style="text-align:left" />
    <display:column property="linkName29" sortable="true" titleKey="product.linkName29" style="text-align:left" />
    <display:column property="link30" sortable="true" titleKey="product.link30" style="text-align:left" />
    <display:column property="linkName30" sortable="true" titleKey="product.linkName30" style="text-align:left" />
    <display:column property="disabled" sortable="true" titleKey="product.disabled" style="text-align:left" />
    <display:column property="productType.caption_" sortable="true" titleKey="product.productType" style="text-align:left"/>
    <display:column property="logo1.caption_" sortable="true" titleKey="product.logo1" style="text-align:left"/>
    <display:column property="logo2.caption_" sortable="true" titleKey="product.logo2" style="text-align:left"/>
    <display:column property="logo3.caption_" sortable="true" titleKey="product.logo3" style="text-align:left"/>
    <display:column property="logo4.caption_" sortable="true" titleKey="product.logo4" style="text-align:left"/>
    <display:column property="logo5.caption_" sortable="true" titleKey="product.logo5" style="text-align:left"/>
    <display:column property="logo6.caption_" sortable="true" titleKey="product.logo6" style="text-align:left"/>
    <display:column property="logo7.caption_" sortable="true" titleKey="product.logo7" style="text-align:left"/>
    <display:column property="logo8.caption_" sortable="true" titleKey="product.logo8" style="text-align:left"/>
    <display:column property="logo9.caption_" sortable="true" titleKey="product.logo9" style="text-align:left"/>
    <display:column property="logo10.caption_" sortable="true" titleKey="product.logo10" style="text-align:left"/>
    <display:column property="logo11.caption_" sortable="true" titleKey="product.logo11" style="text-align:left"/>
    <display:column property="logo12.caption_" sortable="true" titleKey="product.logo12" style="text-align:left"/>
    <display:column property="logo13.caption_" sortable="true" titleKey="product.logo13" style="text-align:left"/>
    <display:column property="logo14.caption_" sortable="true" titleKey="product.logo14" style="text-align:left"/>
    <display:column property="logo15.caption_" sortable="true" titleKey="product.logo15" style="text-align:left"/>
    <display:column property="logo16.caption_" sortable="true" titleKey="product.logo16" style="text-align:left"/>
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
    <display:column property="target1.caption_" sortable="true" titleKey="product.target1" style="text-align:left"/>
    <display:column property="target2.caption_" sortable="true" titleKey="product.target2" style="text-align:left"/>
    <display:column property="target3.caption_" sortable="true" titleKey="product.target3" style="text-align:left"/>
    <display:column property="target4.caption_" sortable="true" titleKey="product.target4" style="text-align:left"/>
    <display:column property="target5.caption_" sortable="true" titleKey="product.target5" style="text-align:left"/>
    <display:column property="target6.caption_" sortable="true" titleKey="product.target6" style="text-align:left"/>
    <display:column property="target7.caption_" sortable="true" titleKey="product.target7" style="text-align:left"/>
    <display:column property="target8.caption_" sortable="true" titleKey="product.target8" style="text-align:left"/>
    <display:column property="target9.caption_" sortable="true" titleKey="product.target9" style="text-align:left"/>
    <display:column property="target10.caption_" sortable="true" titleKey="product.target10" style="text-align:left"/>
    <display:column property="target11.caption_" sortable="true" titleKey="product.target11" style="text-align:left"/>
    <display:column property="target12.caption_" sortable="true" titleKey="product.target12" style="text-align:left"/>
    <display:column property="target13.caption_" sortable="true" titleKey="product.target13" style="text-align:left"/>
    <display:column property="target14.caption_" sortable="true" titleKey="product.target14" style="text-align:left"/>
    <display:column property="target15.caption_" sortable="true" titleKey="product.target15" style="text-align:left"/>
    <display:column property="target16.caption_" sortable="true" titleKey="product.target16" style="text-align:left"/>
    <display:column property="target17.caption_" sortable="true" titleKey="product.target17" style="text-align:left"/>
    <display:column property="target18.caption_" sortable="true" titleKey="product.target18" style="text-align:left"/>
    <display:column property="target19.caption_" sortable="true" titleKey="product.target19" style="text-align:left"/>
    <display:column property="target20.caption_" sortable="true" titleKey="product.target20" style="text-align:left"/>
    <display:column property="target21.caption_" sortable="true" titleKey="product.target21" style="text-align:left"/>
    <display:column property="target22.caption_" sortable="true" titleKey="product.target22" style="text-align:left"/>
    <display:column property="target23.caption_" sortable="true" titleKey="product.target23" style="text-align:left"/>
    <display:column property="target24.caption_" sortable="true" titleKey="product.target24" style="text-align:left"/>
    <display:column property="target25.caption_" sortable="true" titleKey="product.target25" style="text-align:left"/>
    <display:column property="target26.caption_" sortable="true" titleKey="product.target26" style="text-align:left"/>
    <display:column property="target27.caption_" sortable="true" titleKey="product.target27" style="text-align:left"/>
    <display:column property="target28.caption_" sortable="true" titleKey="product.target28" style="text-align:left"/>
    <display:column property="target29.caption_" sortable="true" titleKey="product.target29" style="text-align:left"/>
    <display:column property="target30.caption_" sortable="true" titleKey="product.target30" style="text-align:left"/>
    <display:column property="types" sortable="true" titleKey="product.types" style="text-align:left" />
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
