package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaCreativeidsChangedGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.creativeids.changed.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaCreativeidsChangedGetRequest implements TaobaoRequest<SimbaCreativeidsChangedGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 主人昵称
	 */
	private String nick;

	/** 
	* 返回的第几页数据，默认为1
	 */
	private Long pageNo;

	/** 
	* 返回的每页数据量大小,默认200最大1000
	 */
	private Long pageSize;

	/** 
	* 得到此时间点之后的数据，不能大于一个月
	 */
	private Date startTime;

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

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public Date getStartTime() {
		return this.startTime;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.creativeids.changed.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("nick", this.nick);
		txtParams.put("page_no", this.pageNo);
		txtParams.put("page_size", this.pageSize);
		txtParams.put("start_time", this.startTime);
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

	public Class<SimbaCreativeidsChangedGetResponse> getResponseClass() {
		return SimbaCreativeidsChangedGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkMaxValue(pageSize,1000L,"pageSize");
		RequestCheckUtils.checkMinValue(pageSize,1L,"pageSize");
		RequestCheckUtils.checkNotEmpty(startTime,"startTime");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
