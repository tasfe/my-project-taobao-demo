package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ItemUpdateDelistingResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.item.update.delisting request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class ItemUpdateDelistingRequest implements TaobaoRequest<ItemUpdateDelistingResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 商品数字ID，该参数必须
	 */
	private Long numIid;

	public void setNumIid(Long numIid) {
		this.numIid = numIid;
	}
	public Long getNumIid() {
		return this.numIid;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.item.update.delisting";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("num_iid", this.numIid);
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

	public Class<ItemUpdateDelistingResponse> getResponseClass() {
		return ItemUpdateDelistingResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(numIid,"numIid");
		RequestCheckUtils.checkMinValue(numIid,0L,"numIid");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
