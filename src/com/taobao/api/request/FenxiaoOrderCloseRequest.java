package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.FenxiaoOrderCloseResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: taobao.fenxiao.order.close request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:29
 */
public class FenxiaoOrderCloseRequest implements TaobaoRequest<FenxiaoOrderCloseResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 关闭理由,特殊字符会被转义，会改变长度，有特殊字符是请注意
	 */
	private String message;

	/** 
	* 采购单编号
	 */
	private Long purchaseOrderId;

	/** 
	* 子采购单ID，可传多笔子单ID，逗号分隔
	 */
	private String subOrderIds;

	public void setMessage(String message) {
		this.message = message;
	}
	public String getMessage() {
		return this.message;
	}

	public void setPurchaseOrderId(Long purchaseOrderId) {
		this.purchaseOrderId = purchaseOrderId;
	}
	public Long getPurchaseOrderId() {
		return this.purchaseOrderId;
	}

	public void setSubOrderIds(String subOrderIds) {
		this.subOrderIds = subOrderIds;
	}
	public String getSubOrderIds() {
		return this.subOrderIds;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "taobao.fenxiao.order.close";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("message", this.message);
		txtParams.put("purchase_order_id", this.purchaseOrderId);
		txtParams.put("sub_order_ids", this.subOrderIds);
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

	public Class<FenxiaoOrderCloseResponse> getResponseClass() {
		return FenxiaoOrderCloseResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(message,"message");
		RequestCheckUtils.checkMaxLength(message,200,"message");
		RequestCheckUtils.checkNotEmpty(purchaseOrderId,"purchaseOrderId");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
