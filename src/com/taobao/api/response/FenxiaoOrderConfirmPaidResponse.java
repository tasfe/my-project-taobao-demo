package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.fenxiao.order.confirm.paid response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class FenxiaoOrderConfirmPaidResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2637765558539548829L;

	/** 
	 * 确认结果成功与否
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
