package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.caipiao.signstatus.check response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class CaipiaoSignstatusCheckResponse extends TaobaoResponse {

	private static final long serialVersionUID = 4491211984942929441L;

	/** 
	 * 是否签署了支付宝代扣协议
	 */
	@ApiField("sign")
	private Boolean sign;

	/** 
	 * 签署支付宝代扣协议的Url
	 */
	@ApiField("sign_url")
	private String signUrl;

	public void setSign(Boolean sign) {
		this.sign = sign;
	}
	public Boolean getSign( ) {
		return this.sign;
	}

	public void setSignUrl(String signUrl) {
		this.signUrl = signUrl;
	}
	public String getSignUrl( ) {
		return this.signUrl;
	}

}
