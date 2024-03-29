package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.hotel.order.pay.feedback response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class HotelOrderPayFeedbackResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1763893768532929992L;

	/** 
	 * 接口调用是否成功
	 */
	@ApiField("is_success")
	private Boolean isSuccess;

	public void setIsSuccess(Boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public Boolean getIsSuccess( ) {
		return this.isSuccess;
	}

}
