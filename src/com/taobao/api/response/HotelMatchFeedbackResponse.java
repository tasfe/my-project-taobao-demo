package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.match.feedback response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelMatchFeedbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1426768365212978112L;

	/** 
	 * 结果回传是否成功
	 */
	@ApiField("succ")
	private Boolean succ;

	public void setSucc(Boolean succ) {
		this.succ = succ;
	}
	public Boolean getSucc( ) {
		return this.succ;
	}

}
