package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.LogisticsCompaniesGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.logistics.companies.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class LogisticsCompaniesGetRequest implements TaobaoRequest<LogisticsCompaniesGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 需返回的字段列表。可选值:LogisticCompany 结构中的所有字段;多个字段间用","逗号隔开.
如:id,code,name,reg_mail_no
<br><font color='red'>说明：</font>
<br>id：物流公司ID
<br>code：物流公司code
<br>name：物流公司名称
<br>reg_mail_no：物流公司对应的运单规则
	 */
	private String fields;

	/** 
	* 是否查询推荐物流公司.可选值:true,false.如果不提供此参数,将会返回所有支持电话联系的物流公司.
	 */
	private Boolean isRecommended;

	/** 
	* 推荐物流公司的下单方式.可选值:offline(电话联系/自己联系),online(在线下单),all(即电话联系又在线下单). 此参数仅仅用于is_recommended 为ture时。就是说对于推荐物流公司才可用.如果不选择此参数将会返回推荐物流中支持电话联系的物流公司.
	 */
	private String orderMode;

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setIsRecommended(Boolean isRecommended) {
		this.isRecommended = isRecommended;
	}
	public Boolean getIsRecommended() {
		return this.isRecommended;
	}

	public void setOrderMode(String orderMode) {
		this.orderMode = orderMode;
	}
	public String getOrderMode() {
		return this.orderMode;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.logistics.companies.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("fields", this.fields);
		txtParams.put("is_recommended", this.isRecommended);
		txtParams.put("order_mode", this.orderMode);
		if(this.udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}

	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new TaobaoHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Class<LogisticsCompaniesGetResponse> getResponseClass() {
		return LogisticsCompaniesGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
