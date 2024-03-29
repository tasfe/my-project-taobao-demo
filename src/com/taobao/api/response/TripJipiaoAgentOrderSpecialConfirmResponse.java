package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.special.confirm response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderSpecialConfirmResponse extends TaobaoResponse {

	private static final long serialVersionUID = 1768131981846956283L;

	/** 
	 * 确认能否支付成功失败
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
