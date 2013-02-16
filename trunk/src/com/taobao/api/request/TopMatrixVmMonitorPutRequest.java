package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopMatrixVmMonitorPutResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.top.matrix.vm.monitor.put request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class TopMatrixVmMonitorPutRequest implements TaobaoRequest<TopMatrixVmMonitorPutResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 数据
	 */
	private String data;

	public void setData(String data) {
		this.data = data;
	}
	public String getData() {
		return this.data;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.top.matrix.vm.monitor.put";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("data", this.data);
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

	public Class<TopMatrixVmMonitorPutResponse> getResponseClass() {
		return TopMatrixVmMonitorPutResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(data,"data");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
