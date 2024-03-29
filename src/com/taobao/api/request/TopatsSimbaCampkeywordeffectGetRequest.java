package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.TopatsSimbaCampkeywordeffectGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.topats.simba.campkeywordeffect.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class TopatsSimbaCampkeywordeffectGetRequest implements TaobaoRequest<TopatsSimbaCampkeywordeffectGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询推广计划ID
	 */
	private Long campaignId;

	/** 
	* 查询的昵称
	 */
	private String nick;

	/** 
	* 报表类型。可选值：SEARCH（搜索）、CAT（类目出价）、 NOSEARCH（定向投放），可多选，如：SEARCH,CAT
	 */
	private String searchType;

	/** 
	* 数据来源。可选值：1（站内）、2（站外）、SUMMARY（汇总），其中SUMMARY必须单选，其它值可多选，如：1,2
	 */
	private String source;

	/** 
	* 时间参数（昨天：DAY、 前一周：7DAY、 前15天：15DAY、 前30天：30DAY 、前90天：90DAY）单选
	 */
	private String timeSlot;

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

	public void setSearchType(String searchType) {
		this.searchType = searchType;
	}
	public String getSearchType() {
		return this.searchType;
	}

	public void setSource(String source) {
		this.source = source;
	}
	public String getSource() {
		return this.source;
	}

	public void setTimeSlot(String timeSlot) {
		this.timeSlot = timeSlot;
	}
	public String getTimeSlot() {
		return this.timeSlot;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.topats.simba.campkeywordeffect.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("campaign_id", this.campaignId);
		txtParams.put("nick", this.nick);
		txtParams.put("search_type", this.searchType);
		txtParams.put("source", this.source);
		txtParams.put("time_slot", this.timeSlot);
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

	public Class<TopatsSimbaCampkeywordeffectGetResponse> getResponseClass() {
		return TopatsSimbaCampkeywordeffectGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(campaignId,"campaignId");
		RequestCheckUtils.checkNotEmpty(searchType,"searchType");
		RequestCheckUtils.checkNotEmpty(source,"source");
		RequestCheckUtils.checkNotEmpty(timeSlot,"timeSlot");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
