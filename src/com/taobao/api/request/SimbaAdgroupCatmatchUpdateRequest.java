package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.SimbaAdgroupCatmatchUpdateResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.simba.adgroup.catmatch.update request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class SimbaAdgroupCatmatchUpdateRequest implements TaobaoRequest<SimbaAdgroupCatmatchUpdateResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 推广组Id
	 */
	private Long adgroupId;

	/** 
	* 类目出价Id
	 */
	private Long catmatchId;

	/** 
	* 类目出价，单位为分，不能小于5。如果use_default_price字段为使用默认出价，则此max_price字段所传入的值不起作用。商品将会使用默认出价。
	 */
	private Long maxPrice;

	/** 
	* 主人昵称
	 */
	private String nick;

	/** 
	* 是否启用类目出价； offline-不启用 online-启用,如果此字段状态为offline时，则max_price,use_default_price字段值不起作用
	 */
	private String onlineStatus;

	/** 
	* 是否使用推广组默认出价false为不使用，true为使用
	 */
	private Boolean useDefaultPrice;

	public void setAdgroupId(Long adgroupId) {
		this.adgroupId = adgroupId;
	}
	public Long getAdgroupId() {
		return this.adgroupId;
	}

	public void setCatmatchId(Long catmatchId) {
		this.catmatchId = catmatchId;
	}
	public Long getCatmatchId() {
		return this.catmatchId;
	}

	public void setMaxPrice(Long maxPrice) {
		this.maxPrice = maxPrice;
	}
	public Long getMaxPrice() {
		return this.maxPrice;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}
	public String getNick() {
		return this.nick;
	}

	public void setOnlineStatus(String onlineStatus) {
		this.onlineStatus = onlineStatus;
	}
	public String getOnlineStatus() {
		return this.onlineStatus;
	}

	public void setUseDefaultPrice(Boolean useDefaultPrice) {
		this.useDefaultPrice = useDefaultPrice;
	}
	public Boolean getUseDefaultPrice() {
		return this.useDefaultPrice;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.simba.adgroup.catmatch.update";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("adgroup_id", this.adgroupId);
		txtParams.put("catmatch_id", this.catmatchId);
		txtParams.put("max_price", this.maxPrice);
		txtParams.put("nick", this.nick);
		txtParams.put("online_status", this.onlineStatus);
		txtParams.put("use_default_price", this.useDefaultPrice);
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

	public Class<SimbaAdgroupCatmatchUpdateResponse> getResponseClass() {
		return SimbaAdgroupCatmatchUpdateResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(adgroupId,"adgroupId");
		RequestCheckUtils.checkNotEmpty(catmatchId,"catmatchId");
		RequestCheckUtils.checkNotEmpty(maxPrice,"maxPrice");
		RequestCheckUtils.checkMinValue(maxPrice,5L,"maxPrice");
		RequestCheckUtils.checkNotEmpty(onlineStatus,"onlineStatus");
		RequestCheckUtils.checkNotEmpty(useDefaultPrice,"useDefaultPrice");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
