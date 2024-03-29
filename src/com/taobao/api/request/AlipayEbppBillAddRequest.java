package com.taobao.api.request;

import com.taobao.api.internal.util.RequestCheckUtils;
import java.util.Map;

import com.taobao.api.TaobaoRequest;
import com.taobao.api.internal.util.TaobaoHashMap;
import com.taobao.api.response.AlipayEbppBillAddResponse;
import com.taobao.api.ApiRuleException;
/**
 * TOP API: alipay.ebpp.bill.add request
 * 
 * @author auto create
 * @since 1.0, 2013-02-16 12:41:31
 */
public class AlipayEbppBillAddRequest implements TaobaoRequest<AlipayEbppBillAddResponse> {

	private TaobaoHashMap udfParams; // add user-defined text parameters
	private Long timestamp;

	/** 
	* 如果传入调用api有淘宝授权的session可以不传这个字段
	 */
	private String authToken;

	/** 
	* 账单的账期，例如201203表示2012年3月的账单。
	 */
	private String billDate;

	/** 
	* 账单单据号，例如水费单号，手机号，电费号，信用卡卡号。没有唯一性要求。
	 */
	private String billKey;

	/** 
	* 支付宝给每个出账机构指定了一个对应的英文短名称来唯一表示该收费单位。
	 */
	private String chargeInst;

	/** 
	* 输出机构的业务流水号，需要保证唯一性。
	 */
	private String merchantOrderNo;

	/** 
	* 用户的手机号
	 */
	private String mobile;

	/** 
	* 支付宝订单类型。公共事业缴纳JF,信用卡还款HK
	 */
	private String orderType;

	/** 
	* 拥有该账单的用户姓名
	 */
	private String ownerName;

	/** 
	* 缴费金额。用户支付的总金额。单位为：RMB Yuan。取值范围为[0.01，100000000.00]，精确到小数点后两位。
	 */
	private String payAmount;

	/** 
	* 账单的服务费。
	 */
	private String serviceAmount;

	/** 
	* 子业务类型是业务类型的下一级概念，例如：WATER表示JF下面的水费，ELECTRIC表示JF下面的电费，GAS表示JF下面的燃气费。
	 */
	private String subOrderType;

	/** 
	* 交通违章地点，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficLocation;

	/** 
	* 违章行为，sub_order_type=TRAFFIC时填写。
	 */
	private String trafficRegulations;

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}
	public String getAuthToken() {
		return this.authToken;
	}

	public void setBillDate(String billDate) {
		this.billDate = billDate;
	}
	public String getBillDate() {
		return this.billDate;
	}

	public void setBillKey(String billKey) {
		this.billKey = billKey;
	}
	public String getBillKey() {
		return this.billKey;
	}

	public void setChargeInst(String chargeInst) {
		this.chargeInst = chargeInst;
	}
	public String getChargeInst() {
		return this.chargeInst;
	}

	public void setMerchantOrderNo(String merchantOrderNo) {
		this.merchantOrderNo = merchantOrderNo;
	}
	public String getMerchantOrderNo() {
		return this.merchantOrderNo;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getMobile() {
		return this.mobile;
	}

	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderType() {
		return this.orderType;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public String getOwnerName() {
		return this.ownerName;
	}

	public void setPayAmount(String payAmount) {
		this.payAmount = payAmount;
	}
	public String getPayAmount() {
		return this.payAmount;
	}

	public void setServiceAmount(String serviceAmount) {
		this.serviceAmount = serviceAmount;
	}
	public String getServiceAmount() {
		return this.serviceAmount;
	}

	public void setSubOrderType(String subOrderType) {
		this.subOrderType = subOrderType;
	}
	public String getSubOrderType() {
		return this.subOrderType;
	}

	public void setTrafficLocation(String trafficLocation) {
		this.trafficLocation = trafficLocation;
	}
	public String getTrafficLocation() {
		return this.trafficLocation;
	}

	public void setTrafficRegulations(String trafficRegulations) {
		this.trafficRegulations = trafficRegulations;
	}
	public String getTrafficRegulations() {
		return this.trafficRegulations;
	}
	private Map<String,String> headerMap=new TaobaoHashMap();
	
	public Long getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Long timestamp) {
		this.timestamp = timestamp;
	}

	public String getApiMethodName() {
		return "alipay.ebpp.bill.add";
	}

	public Map<String, String> getTextParams() {		
		TaobaoHashMap txtParams = new TaobaoHashMap();
		txtParams.put("auth_token", this.authToken);
		txtParams.put("bill_date", this.billDate);
		txtParams.put("bill_key", this.billKey);
		txtParams.put("charge_inst", this.chargeInst);
		txtParams.put("merchant_order_no", this.merchantOrderNo);
		txtParams.put("mobile", this.mobile);
		txtParams.put("order_type", this.orderType);
		txtParams.put("owner_name", this.ownerName);
		txtParams.put("pay_amount", this.payAmount);
		txtParams.put("service_amount", this.serviceAmount);
		txtParams.put("sub_order_type", this.subOrderType);
		txtParams.put("traffic_location", this.trafficLocation);
		txtParams.put("traffic_regulations", this.trafficRegulations);
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

	public Class<AlipayEbppBillAddResponse> getResponseClass() {
		return AlipayEbppBillAddResponse.class;
	}

	public void check() throws ApiRuleException {
		
		RequestCheckUtils.checkNotEmpty(billKey,"billKey");
		RequestCheckUtils.checkMaxLength(billKey,50,"billKey");
		RequestCheckUtils.checkNotEmpty(chargeInst,"chargeInst");
		RequestCheckUtils.checkMaxLength(chargeInst,80,"chargeInst");
		RequestCheckUtils.checkNotEmpty(merchantOrderNo,"merchantOrderNo");
		RequestCheckUtils.checkMaxLength(merchantOrderNo,32,"merchantOrderNo");
		RequestCheckUtils.checkNotEmpty(mobile,"mobile");
		RequestCheckUtils.checkNotEmpty(orderType,"orderType");
		RequestCheckUtils.checkMaxLength(orderType,10,"orderType");
		RequestCheckUtils.checkMaxLength(ownerName,50,"ownerName");
		RequestCheckUtils.checkNotEmpty(payAmount,"payAmount");
		RequestCheckUtils.checkNotEmpty(subOrderType,"subOrderType");
		RequestCheckUtils.checkMaxLength(subOrderType,10,"subOrderType");
	}
	
	public Map<String,String> getHeaderMap() {
		return headerMap;
	}
}
