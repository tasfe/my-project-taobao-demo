package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaRptCampadgroupeffectGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.rpt.campadgroupeffect.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaRptCampadgroupeffectGetRequest implements TaobaoRequest<SimbaRptCampadgroupeffectGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 查询推广计划id
	 */
	private Long campaignId;

	/** 
	* 结束日期，格式yyyy-mm-dd
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
	* 报表类型（搜索：SEARCH,类目出价：CAT, 定向投放：NOSEARCH汇总：SUMMARY）SUMMARY必须单选，其他值可多选例如：SEARCH,CAT
	 */
	private String searchType;

	/** 
	* 数据来源（站内：1，站外：2 ，汇总：SUMMARY）SUMMARY必须单选，其他值可多选例如1,2
	 */
	private String source;

	/** 
	* 开始日期，格式yyyy-mm-dd
	 */
	private String startTime;

	/** 
	* 权限验证信息
	 */
	private String subwayToken;

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
		return "taobao.simba.rpt.campadgroupeffect.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("campaign_id", this.campaignId);
		txtParams.put("end_time", this.endTime);
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("search_type", this.searchType);
		txtParams.put("source", this.source);
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

	public Class<SimbaRptCampadgroupeffectGetResponse> getResponseClass() {
		return SimbaRptCampadgroupeffectGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(campaignId,"campaignId");
		RequestCheckUtils.checkNotEmpty(endTime,"endTime");
		RequestCheckUtils.checkMinValue(pageNo,1L,"pageNo");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
		RequestCheckUtils.checkNotEmpty(searchType,"searchType");
		RequestCheckUtils.checkNotEmpty(source,"source");
		RequestCheckUtils.checkNotEmpty(startTime,"startTime");
		RequestCheckUtils.checkNotEmpty(subwayToken,"subwayToken");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
