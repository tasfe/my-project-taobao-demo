package com.taobao.api.response;

import com.taobao.api.internal.mapping.ApiField;
import com.taobao.api.domain.AddressResult;

import com.taobao.api.TaobaoResponse;

/**
 * TOP API: taobao.logistics.address.add response.
 * 
 * @author auto create
 * @since 1.0, null
 */
public class LogisticsAddressAddResponse extends TaobaoResponse {

	private static final long serialVersionUID = 2149394444588625264L;

	/** 
	 * 只返回修改日期modify_date
	 */
	@ApiField("address_result")
	private AddressResult addressResult;

	public void setAddressResult(AddressResult addressResult) {
		this.addressResult = addressResult;
	}
	public AddressResult getAddressResult( ) {
		return this.addressResult;
	}

}
