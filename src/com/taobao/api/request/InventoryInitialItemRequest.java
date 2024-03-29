package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.InventoryInitialItemResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.inventory.initial.item request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class InventoryInitialItemRequest implements TaobaoRequest<InventoryInitialItemResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 后端商品id
	 */
	private Long scItemId;

	/** 
	* 商品初始库存信息： [{"storeCode":"必选,商家仓库编号","inventoryType":"可选，库存类型 1：正常,2：损坏,3：冻结,10：质押,11-20:用户自定义,默认为1","quantity":"必选,数量"}]
	 */
	private String storeInventorys;

	public void setScItemId(Long scItemId) {
		this.scItemId = scItemId;
	}
	public Long getScItemId() {
		return this.scItemId;
	}

	public void setStoreInventorys(String storeInventorys) {
		this.storeInventorys = storeInventorys;
	}
	public String getStoreInventorys() {
		return this.storeInventorys;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.inventory.initial.item";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("sc_item_id", this.scItemId);
		txtParams.put("store_inventorys", this.storeInventorys);
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

	public Class<InventoryInitialItemResponse> getResponseClass() {
		return InventoryInitialItemResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(scItemId,"scItemId");
		RequestCheckUtils.checkNotEmpty(storeInventorys,"storeInventorys");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
