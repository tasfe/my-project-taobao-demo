package com.taobao.api.request;

import java.util.Date;
import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.UdpJuhuasuanGetResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.udp.juhuasuan.get request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:30
 */
public class UdpJuhuasuanGetRequest implements TaobaoRequest<UdpJuhuasuanGetResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 开始时间
	 */
	private Date beginTime;

	/** 
	* 类目编号
	 */
	private Long catid;

	/** 
	* 结束时间
	 */
	private Date endTime;

	/** 
	* 指标ID(参阅指标编号)
	 */
	private String fields;

	/** 
	* 2407364
	 */
	private Long itemid;

	/** 
	* 备用
	 */
	private String parameters;

	public void setBeginTime(Date beginTime) {
		this.beginTime = beginTime;
	}
	public Date getBeginTime() {
		return this.beginTime;
	}

	public void setCatid(Long catid) {
		this.catid = catid;
	}
	public Long getCatid() {
		return this.catid;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getEndTime() {
		return this.endTime;
	}

	public void setFields(String fields) {
		this.fields = fields;
	}
	public String getFields() {
		return this.fields;
	}

	public void setItemid(Long itemid) {
		this.itemid = itemid;
	}
	public Long getItemid() {
		return this.itemid;
	}

	public void setParameters(String parameters) {
		this.parameters = parameters;
	}
	public String getParameters() {
		return this.parameters;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.udp.juhuasuan.get";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("begin_time", this.beginTime);
		txtParams.put("catid", this.catid);
		txtParams.put("end_time", this.endTime);
		txtParams.put("fields", this.fields);
		txtParams.put("itemid", this.itemid);
		txtParams.put("parameters", this.parameters);
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

	public Class<UdpJuhuasuanGetResponse> getResponseClass() {
		return UdpJuhuasuanGetResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(fields,"fields");
		RequestCheckUtils.checkMaxListSize(fields,100,"fields");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
