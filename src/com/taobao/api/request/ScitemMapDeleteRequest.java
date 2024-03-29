package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.ScitemMapDeleteResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.scitem.map.delete request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class ScitemMapDeleteRequest implements TaobaoRequest<ScitemMapDeleteResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 后台商品ID
	 */
	private Long scItemId;

	/** 
	* 店铺用户nick。 如果该参数为空则删除后端商品与当前调用人的商品映射关系;如果不为空则删除指定用户与后端商品的映射关系
	 */
	private String userNick;

	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}
	public Long getScItemId() {
		return this.scItemId;
	}

	public void setUserNick(String userNick) {
		this.userNick = userNick;
	}
	public String getUserNick() {
		return this.userNick;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.scitem.map.delete";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sc_item_id", this.scItemId);
		txtParams.put("user_nick", this.userNick);
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

	public Class<ScitemMapDeleteResponse> getResponseClass() {
		return ScitemMapDeleteResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(scItemId,"scItemId");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
