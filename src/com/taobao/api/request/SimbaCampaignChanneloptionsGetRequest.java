package com.taobao.api.request;

import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignChanneloptionsGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.campaign.channeloptions.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaCampaignChanneloptionsGetRequest implements TaobaoRequest<SimbaCampaignChanneloptionsGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.campaign.channeloptions.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
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

	public Class<SimbaCampaignChanneloptionsGetResponse> getResponseClass() {
		return SimbaCampaignChanneloptionsGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
