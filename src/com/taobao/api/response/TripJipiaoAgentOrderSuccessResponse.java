package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.trip.jipiao.agent.order.success response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class TripJipiaoAgentOrderSuccessResponse extends TaobaoResponse {

	private static final long serialVersionUID = 5375153594486646979L;

	/** 
	 * 返回操作成功失败信息
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
