package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCampaignAreaUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.campaign.area.update request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaCampaignAreaUpdateRequest implements TaobaoRequest<SimbaCampaignAreaUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 值为：“all”；或者用“,”分割的数字，数字必须是直通车全国省市列表的AreaID；
	 */
	private String area;

	/** 
	* 推广计划Id
	 */
	private Long campaignId;

	/** 
	* 主人昵称
	 */
	private String nick;

	public void setArea(String area) {
		this.area = area;
	}
	public String getArea() {
		return this.area;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public Long getCampaignId() {
		return this.campaignId;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.campaign.area.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("area", this.area);
		txtParams.put("campaign_id", this.campaignId);
		txtParams.put("nick", this.nick);
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

	public Class<SimbaCampaignAreaUpdateResponse> getResponseClass() {
		return SimbaCampaignAreaUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(area,"area");
		RequestCheckUtils.checkNotEmpty(campaignId,"campaignId");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
