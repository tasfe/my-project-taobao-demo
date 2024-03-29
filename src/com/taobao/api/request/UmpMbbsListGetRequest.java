package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpMbbsListGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.mbbs.list.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:30
 */
public class UmpMbbsListGetRequest implements TaobaoRequest<UmpMbbsListGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 营销积木块id组成的字符串。
	 */
	private String ids;

	public void setIds(String ids) {
		this.ids = ids;
	}
	public String getIds() {
		return this.ids;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.mbbs.list.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("ids", this.ids);
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

	public Class<UmpMbbsListGetResponse> getResponseClass() {
		return UmpMbbsListGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(ids,"ids");
		RequestCheckUtils.checkMaxListSize(ids,20,"ids");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
