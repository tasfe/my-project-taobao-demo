package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaRptAdgroupnonsearchbaseGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.rpt.adgroupnonsearchbase.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaRptAdgroupnonsearchbaseGetRequest implements TaobaoRequest<SimbaRptAdgroupnonsearchbaseGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 推广组id
	 */
	private Long adgroupId;

	/** 
	* 推广计划id
	 */
	private Long campaignId;

	/** 
	* 结束时间,格式为：yyyy-mm-dd
	 */
	private String endTime;

	/** 
	* 昵称
	 */
	private String nick;

	/** 
	* 页码
	 */
	private Long pageNo;

	/** 
	* 每页大小
	 */
	private Long pageSize;

	/** 
	* 开始时间,格式为：yyyy-mm-dd
	 */
	private String startTime;

	/** 
	* 权限校验参数
	 */
	private String subwayToken;

	public void setAdgroupId(Long adgroupId) {
		this.adgroupId = adgroupId;
	}
	public Long getAdgroupId() {
		return this.adgroupId;
	}

	public void setCampaignId(Long campaignId) {
		this.campaignId = campaignId;
	}
	public Long getCampaignId() {
		return this.campaignId;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public String getEndTime() {
		return this.endTime;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setPageNo(Long pageNo) {
		this.pageNo = pageNo;
	}
	public Long getPageNo() {
		return this.pageNo;
	}

	public void setPageSize(Long pageSize) {
		this.pageSize = pageSize;
	}
	public Long getPageSize() {
		return this.pageSize;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getStartTime() {
		return this.startTime;
	}

	public void setSubwayToken(String subwayToken) {
		this.subwayToken = subwayToken;
	}
	public String getSubwayToken() {
		return this.subwayToken;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.rpt.adgroupnonsearchbase.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("adgroup_id", this.adgroupId);
		txtParams.put("campaign_id", this.campaignId);
		txtParams.put("end_time", this.endTime);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_time", this.startTime);
		txtParams.put("subway_token", this.subwayToken);
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

	public Class<SimbaRptAdgroupnonsearchbaseGetResponse> getResponseClass() {
		return SimbaRptAdgroupnonsearchbaseGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(endTime,"endTime");
		RequestCheckUtils.checkNotEmpty(startTime,"startTime");
		RequestCheckUtils.checkNotEmpty(subwayToken,"subwayToken");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
