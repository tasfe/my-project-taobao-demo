package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.inventory.occupy.cancel response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class InventoryOccupyCancelResponse extends TaobaoResponse {

	private static final long serialVersionUID = 3463482953477362965L;

	/** 
	 * 是否成功
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
