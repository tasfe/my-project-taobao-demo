package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UmpToolGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.ump.tool.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:30
 */
public class UmpToolGetRequest implements TaobaoRequest<UmpToolGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 工具的id
	 */
	private Long toolId;

	public void setToolId(Long toolId) {
		this.toolId = toolId;
	}
	public Long getToolId() {
		return this.toolId;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.ump.tool.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("tool_id", this.toolId);
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

	public Class<UmpToolGetResponse> getResponseClass() {
		return UmpToolGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(toolId,"toolId");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
